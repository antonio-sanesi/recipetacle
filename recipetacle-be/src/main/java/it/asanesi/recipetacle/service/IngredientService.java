package it.asanesi.recipetacle.service;

import it.asanesi.recipetacle.dto.IngredientDto;

import java.util.List;

public interface IngredientService {
    List<IngredientDto> findByName(String name);

    List<IngredientDto> findAll();

    IngredientDto save(IngredientDto ingredientDto);
}
