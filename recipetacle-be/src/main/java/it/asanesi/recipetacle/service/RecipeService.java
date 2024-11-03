package it.asanesi.recipetacle.service;

import it.asanesi.recipetacle.dto.RecipeDto;
import it.asanesi.recipetacle.entity.Recipe;

import java.util.List;

public interface RecipeService {
    RecipeDto save(RecipeDto recipeDto);
    List<RecipeDto> findAll();
    List<RecipeDto> findByName(String name);

    RecipeDto findById(Long id);

    void delete(Long id);
}
