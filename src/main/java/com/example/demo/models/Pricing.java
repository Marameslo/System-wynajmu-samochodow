package com.example.demo.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Pricing {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column (unique = true)
    private String name;
    @NotBlank 
    private double pricePerHour;
    @NotBlank 


    public Pricing(Long id, String name, double pricePerHour) {
        this.id = id;
        this.name = name;
        this.pricePerHour = pricePerHour;
    }
}