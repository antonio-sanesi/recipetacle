package it.asanesi.recipetacle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "recipetacle.recipe")
@Getter
@Setter
@NoArgsConstructor
public class Recipe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "image", nullable = true)
    private byte[] image;
    
    @Column(name = "base_multiplier", nullable = true)
    private Integer baseMultiplier;
    
    @Column(name = "base_multiplier_unit", nullable = true)
    private String baseMultiplierUnit;
    
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<RecipeDose> doses;

    @OneToOne(mappedBy = "recipe", cascade = CascadeType.ALL)
    private RecipeMetadata metadata;
    
    // Getters and Setters
}