package it.asanesi.recipetacle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "recipetacle.recipe_metadata")
@Getter
@Setter
@NoArgsConstructor
public class RecipeMetadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "difficulty", nullable = true)
    private Integer difficulty;

    @Column(name = "cost", nullable = true)
    private Integer cost;
    
    @Column(name = "prepare_time", nullable = true)
    private Integer prepareTime;
    
    @Column(name = "cooking_time", nullable = true)
    private Integer cookingTime;

    @OneToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
    
    // Getters and Setters
}