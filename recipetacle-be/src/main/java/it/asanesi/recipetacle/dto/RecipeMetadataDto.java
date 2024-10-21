package it.asanesi.recipetacle.dto;

import lombok.Data;

@Data
public class RecipeMetadataDto {
    private Long id;
    private Integer difficulty;
    private Integer cost;
    private Integer prepareTime;
    private Integer cookingTime;
}
