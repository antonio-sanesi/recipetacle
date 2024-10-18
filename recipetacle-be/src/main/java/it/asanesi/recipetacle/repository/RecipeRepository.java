package it.asanesi.recipetacle.repository;

import it.asanesi.recipetacle.entity.Recipe;
import it.asanesi.recipetacle.entity.RecipeDose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    // Query to get a recipe by its name
    Recipe findByName(String name);

    // Custom method to update the image of an existing recipe
    void updateImage(Long id, byte[] newImage);

    // Custom query to get all recipes with their doses sorted by dose name
    List<Object[]> getAllRecipesWithSortedDoses();
}
