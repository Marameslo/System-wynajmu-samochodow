package com.example.demo.models;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserModel {
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
    @NotBlank 
    private String name;
    @NotBlank
    @Column (unique = true)
    private String email;
    @NotBlank
    private String password;
    @NotBlank 
    private String role;
    private BigDecimal balance;
    private Long carId;

}
