package com.ijse.ecommerceapp.service;

import com.ijse.ecommerceapp.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    List<PaymentDTO> getPaymentByName(double amount);
}
