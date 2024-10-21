package it.asanesi.recipetacle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ingredient")
@SequenceGenerator(name = "ingredient_seq", sequenceName = "ingredient_seq", allocationSize = 1)
@Getter
@Setter
@NoArgsConstructor
public class Ingredient {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ingredient_seq")
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    // Getters and Setters
}