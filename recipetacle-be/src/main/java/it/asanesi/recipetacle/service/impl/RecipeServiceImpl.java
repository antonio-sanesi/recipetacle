package it.asanesi.recipetacle.service.impl;

import it.asanesi.recipetacle.dto.RecipeDto;
import it.asanesi.recipetacle.entity.Recipe;
import it.asanesi.recipetacle.repository.RecipeRepository;
import it.asanesi.recipetacle.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    private final ModelMapper modelMapper;

    @Override
    public RecipeDto save(RecipeDto recipeDto) {
        var toSave = modelMapper.map(recipeDto, Recipe.class);
        var saved = recipeRepository.save(toSave);
        return modelMapper.map(saved, RecipeDto.class);
    }

    @Override
    public List<RecipeDto> findAll() {
        return recipeRepository.findAll().stream()
                .map(recipe -> modelMapper.map(recipe, RecipeDto.class))
                .toList();
    }

    @Override
    public List<RecipeDto> findByName(String name) {
        return recipeRepository.findByNameIgnoreCaseContaining(name).stream()
                .map(recipe -> modelMapper.map(recipe, RecipeDto.class))
                .toList();
    }

    @Override
    public RecipeDto findById(Long id) {
        return recipeRepository.findById(id)
                .map(recipe -> modelMapper.map(recipe, RecipeDto.class))
                .orElse(null);
    }

    @Override
    public void delete(Long id) {
        recipeRepository.deleteById(id);
    }
}
