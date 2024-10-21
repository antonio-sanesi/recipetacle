package it.asanesi.recipetacle.dto;

import it.asanesi.recipetacle.entity.Ingredient;
import lombok.Data;

@Data
public class RecipeDoseDto {
    private Long id;
    private IngredientDto ingredient;
    private Double quantity;
    private String unit;
    private String subtext;
}
