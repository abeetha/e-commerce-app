package com.ijse.ecommerceapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDTO {

    private String propertyId;
    private double amount;
    private String bank;
}
