package com.example.demo.servise; // або com.example.demo.service

import com.example.demo.Models.Car;
import com.example.demo.dto.CarDTO;
import com.example.demo.repository.CarRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    @Transactional 
    public void deleteCar(Long id) {
        if (!carRepository.existsById(id)) {
            throw new IllegalArgumentException("Car with ID " + id + " not found.");
        }
        carRepository.deleteById(id);
    }

    public Car addCar(CarDTO carDTO) {
        Car car = new Car();
        car.setModel(carDTO.getModel());
        car.setDescription(carDTO.getDescription());
        car.setAvailable(carDTO.isAvailable());
        car.setLocked(carDTO.isLocked());
        car.setPricePerDay(carDTO.getPricePerDay());
        car.setImageUrl(carDTO.getImageUrl());
        car.setPositionX(carDTO.getPositionX());
        car.setPositionY(carDTO.getPositionY());

        return carRepository.save(car);
    }

    public Car updateCar(Long id, CarDTO carDTO) {
        Car existingCar = carRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Car with ID " + id + " not found."));

        existingCar.setModel(carDTO.getModel());
        existingCar.setDescription(carDTO.getDescription());
        existingCar.setAvailable(carDTO.isAvailable());
        existingCar.setLocked(carDTO.isLocked());
        existingCar.setPricePerDay(carDTO.getPricePerDay());
        existingCar.setImageUrl(carDTO.getImageUrl());
        existingCar.setPositionX(carDTO.getPositionX());
        existingCar.setPositionY(carDTO.getPositionY());

        return carRepository.save(existingCar);
    }
}