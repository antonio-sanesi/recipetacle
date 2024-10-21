package it.asanesi.recipetacle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "doses")
@SequenceGenerator(name = "dose_seq", sequenceName = "dose_seq", allocationSize = 1)
@Getter
@Setter
@NoArgsConstructor
public class RecipeDose {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dose_seq")
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