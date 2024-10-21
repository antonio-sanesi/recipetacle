package it.asanesi.recipetacle.dto;

import it.asanesi.recipetacle.entity.RecipeDose;
import lombok.Data;

import java.util.List;

@Data
public class RecipeDto {
    private Long id;
    private String name;
    private String description;
    private byte[] image;
    private Integer baseMultiplier;
    private String baseMultiplierUnit;
    private List<RecipeDose> doses;
    private RecipeMetadataDto metadata;
}
