package it.asanesi.recipetacle.controller;

import it.asanesi.recipetacle.dto.RecipeDto;
import it.asanesi.recipetacle.entity.Recipe;
import it.asanesi.recipetacle.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    @PostMapping("")
    public RecipeDto createRecipe(
            @RequestBody RecipeDto recipeDto
    ) {
        return recipeService.save(recipeDto);
    }

    @GetMapping("")
    public List<RecipeDto> findAll(
            @RequestParam(required = false) String name
    ) {
        if(name != null) {
            return recipeService.findByName(name);
        }

        return recipeService.findAll();
    }

    @GetMapping("/{id}")
    public RecipeDto findById(
            @PathVariable Long id
    ) {
        return recipeService.findById(id);
    }

}
