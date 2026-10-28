package com.example.demo.servise;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.models.UserModel;
import com.example.demo.repository.UserRepository;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UserRegisterServise {

    @Autowired
    private UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public String registerUser(RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("User with this email already exists!");
        }

        UserModel user = new UserModel();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
    
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        
        user.setRole(request.getRole() != null ? request.getRole() : "USER");
        user.setBalance(BigDecimal.ZERO); 
        
        userRepository.save(user);
        return "User registered successfully!";
    }
}