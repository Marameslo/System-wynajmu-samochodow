package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    private String token;
    private String role;
    private String type = "Bearer";

    public AuthResponse(String token, String role) {
        this.token = token;
        this.role = role;
    }
}