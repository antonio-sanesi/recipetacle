package it.asanesi.recipetacle.repository;

import it.asanesi.recipetacle.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    List<Ingredient> findByNameIgnoreCaseContaining(String name);
}