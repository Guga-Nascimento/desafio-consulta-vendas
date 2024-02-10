package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.entities.Seller;

public class SellerDTO {


    Long id;
    String name;
    String email;
    String phone;


    public SellerDTO() {}

    public SellerDTO(Long id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        phone = entity.getPhone();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }


    @Override
    public String toString() {
        return "SellerDTO [ID = " + id + ", "
                + "NAME = " + name + ", "
                + "EMAIL = " + email + ", "
                + "PHONE = " + phone+"]";
}

}
