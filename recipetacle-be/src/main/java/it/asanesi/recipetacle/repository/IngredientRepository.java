package it.asanesi.recipetacle.repository;

import it.asanesi.recipetacle.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    // Query to get all ingredients by name (e.g., for searching)
    List<Ingredient> findByName(String name);

}