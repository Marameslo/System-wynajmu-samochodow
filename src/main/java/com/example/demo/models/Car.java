package com.example.demo.models;

public class Car {
    private Long id;
    private String model;
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        this.isLocked = locked;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getPositionX() {
        return PositionX;
    }

    public void setPositionX(double positionX) {
        this.PositionX = positionX;
    }

    public double getPositionY() {
        return PositionY;
    }

    public void setPositionY(double positionY) {
        this.PositionY = positionY;
    }
}