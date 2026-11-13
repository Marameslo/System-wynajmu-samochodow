package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CarDTO {
    @NotBlank(message = "Model cannot be empty")
    private String model;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    private boolean isAvailable = true;
    private boolean isLocked = false;

    @Positive(message = "Price must be greater than 0")
    private double pricePerDay;

    private String imageUrl;
    private double positionX;
    private double positionY;
}