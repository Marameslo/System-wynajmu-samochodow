package com.example.demo.models;
import java.math.BigDecimal;
import java.util.Date;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class RentalModel {
      private Long id;
    private String userId;
    private String carId;
    private Long pricindId;
    private BigDecimal TotalRentalPrice;
    private Date startDate;
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