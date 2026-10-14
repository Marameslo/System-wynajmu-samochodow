package com.example.demo.models;
import java.math.BigDecimal;
import java.util.Date;

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

    public RentalModel() {
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getCarId() {
        return carId;
    }
    public void setCarId(String carId) {
        this.carId = carId;
    }
    public Long getPricindId() {
        return pricindId;
    }
    public void setPricindId(Long pricindId) {
        this.pricindId = pricindId;
    }
    public BigDecimal getTotalRentalPrice() {
        return TotalRentalPrice;
    }
    public void setTotalRentalPrice(BigDecimal totalRentalPrice) {
        TotalRentalPrice = totalRentalPrice;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}