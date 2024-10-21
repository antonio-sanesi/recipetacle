package it.asanesi.recipetacle.controller;

import it.asanesi.recipetacle.dto.IngredientDto;
import it.asanesi.recipetacle.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ingredients")
public class IngredientController {
    private final IngredientService ingredientService;

    @PostMapping("")
    public IngredientDto createIngredient(@RequestBody IngredientDto ingredientDto) {
        return ingredientService.save(ingredientDto);
    }

    @GetMapping("")
    public List<IngredientDto> findAll(@RequestParam(required = false) String name) {
        if (name != null) {
            return ingredientService.findByName(name);
        }

        return ingredientService.findAll();
    }
}
