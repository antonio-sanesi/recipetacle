package it.asanesi.recipetacle.service.impl;

import it.asanesi.recipetacle.dto.IngredientDto;
import it.asanesi.recipetacle.dto.RecipeDto;
import it.asanesi.recipetacle.entity.Ingredient;
import it.asanesi.recipetacle.repository.IngredientRepository;
import it.asanesi.recipetacle.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public List<IngredientDto> findByName(String name) {
        return repository.findByNameIgnoreCaseContaining(name).stream()
                .map(element -> modelMapper.map(element, IngredientDto.class))
                .toList();
    }

    @Override
    public List<IngredientDto> findAll() {
        return repository.findAll().stream()
                .map(element -> modelMapper.map(element, IngredientDto.class))
                .toList();
    }

    @Override
    public IngredientDto save(IngredientDto ingredientDto) {
        if(ingredientDto == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ingredient cannot be null");
        }

        if(ingredientDto.getName().length() < 2) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ingredient name must be at least 2 characters long");
        }

        Ingredient toSave = modelMapper.map(ingredientDto, Ingredient.class);
        Ingredient saved = repository.save(toSave);
        return modelMapper.map(saved, IngredientDto.class);
    }
}
