package com.example.demo.Models;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class RentalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank 
    private String userId;
    @NotBlank 
    @Column(unique = true)
    private String carId;
    @NotBlank 
    private Long pricindId;
    private BigDecimal TotalRentalPrice;
    @NotBlank 
    private Date startDate;
    @NotBlank 
    private Date endDate;

    public RentalModel(Long id, String userId, String carId, Long pricindId, BigDecimal TotalRentalPrice, Date startDate, Date endDate) {
        this.id = id;
        this.userId = userId;
        this.carId = carId;
        this.pricindId = pricindId;
        this.TotalRentalPrice = TotalRentalPrice;
        this.startDate = startDate;
        this.endDate = endDate;
      
    }
}