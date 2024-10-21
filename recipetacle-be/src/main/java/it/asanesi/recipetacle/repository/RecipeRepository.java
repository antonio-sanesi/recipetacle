package it.asanesi.recipetacle.repository;

import it.asanesi.recipetacle.entity.Recipe;
import it.asanesi.recipetacle.entity.RecipeDose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    List<Recipe> findByNameIgnoreCaseContaining(String name);
}
