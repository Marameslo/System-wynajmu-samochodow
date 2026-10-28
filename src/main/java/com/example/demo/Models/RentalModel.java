package com.example.demo.models;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@Entity
public class RentalModel {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
    @NonNull 
    private String userId;
    @NotNull 
    private String carId;
    @NotNull 
    private Long pricindId;
    private BigDecimal TotalRentalPrice;
    @NotBlank 
    private Date startDate;
    private Date endDate;

}