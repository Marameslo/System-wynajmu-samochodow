package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Car {
    private Long id;
    @NotBlank 
    @Column(unique = true)
    private String model;
    @NotBlank 
    private String description;
    private boolean isAvailable;
    private boolean isLocked;
    private double pricePerDay;
    private String imageUrl;
    private double PositionX;
    private double PositionY;

    public Car(Long id, String model, String description, boolean isAvailable, boolean isLocked, double pricePerDay, String imageUrl, double positionX, double positionY) {
        this.id = id;
        this.model = model;
        this.description = description;
        this.isAvailable = isAvailable;
        this.isLocked = isLocked;
        this.imageUrl = imageUrl;
        this.PositionX = positionX;
        this.PositionY = positionY;
    }


}