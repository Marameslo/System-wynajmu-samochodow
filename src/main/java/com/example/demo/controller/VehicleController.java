package com.example.demo.controller;

import com.example.demo.Models.Car;
import com.example.demo.dto.CarDTO;
import com.example.demo.servise.CarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final CarService carService;

    @Autowired
    public VehicleController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/add")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<?> createVehicle(@Valid @RequestBody CarDTO carDTO) {
        try {
            Car createdCar = carService.addCar(carDTO);
            return new ResponseEntity<>(createdCar, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping ("/delete/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<?> deleteVehicle(@PathVariable Long id) {
        try {
            carService.deleteCar(id);
            return ResponseEntity.ok().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping ("/update/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<?> updateVehicle(@PathVariable Long id, @Valid @RequestBody CarDTO carDTO) {
        try {
            Car updatedCar = carService.updateCar(id, carDTO);
            return ResponseEntity.ok(updatedCar);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}