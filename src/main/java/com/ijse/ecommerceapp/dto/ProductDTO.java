package com.ijse.ecommerceapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {
    private String propertyId;
    private String displayName;
    private String description;
    private double unitPrice;
    private int qty;



}
