package it.asanesi.recipetacle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "recipe_metadata")
@Getter
@Setter
@NoArgsConstructor
public class RecipeMetadata {

    @Id
    @Column(name="recipe_id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @Column(name = "difficulty", nullable = true)
    private Integer difficulty;

    @Column(name = "cost", nullable = true)
    private Integer cost;
    
    @Column(name = "prepare_time", nullable = true)
    private Integer prepareTime;
    
    @Column(name = "cooking_time", nullable = true)
    private Integer cookingTime;
}