package com.devsuperior.dsmeta.dto;

import java.time.LocalDate;

import com.devsuperior.dsmeta.entities.Sale;

public class SaleMinDTO {

    private Long id;
    private LocalDate date;
    private Double amount;

    private SellerDTO seller;
    public SaleMinDTO(){}

    public SaleMinDTO(Long id, Double amount, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public SaleMinDTO(Sale entity) {
        id = entity.getId();
        amount = entity.getAmount();
        date = entity.getDate();
        seller = new SellerDTO(entity.getSeller());
    }


    public Long getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public SellerDTO getSeller() {
        return seller;
    }

    @Override
    public String toString() {
        return "\nSaleDTO \t[ID = " + id + ", "
                + "AMOUNT = " + amount + ", "
                + "DATE = " + date + ", "
                + "SELLER_DTO = " + seller + " ]";
    }

}