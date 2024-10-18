package it.asanesi.recipetacle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "recipetacle.doses")
@Getter
@Setter
@NoArgsConstructor
public class RecipeDose {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;
    
    @Column(name = "quantity", nullable = false)
    private Double quantity;

    @Column(name = "unit", nullable = true)
    private String unit;

    @Column(name = "subtext", nullable = true)
    private String subtext;

    // Getters and Setters
}