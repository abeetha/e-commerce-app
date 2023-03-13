package com.ijse.ecommerceapp.service.impl;

import com.ijse.ecommerceapp.dto.PaymentDTO;
import com.ijse.ecommerceapp.entity.Payment;
import com.ijse.ecommerceapp.entity.Product;
import com.ijse.ecommerceapp.repo.PaymentRepo;
import com.ijse.ecommerceapp.repo.ProductRepo;
import com.ijse.ecommerceapp.service.PaymentService;
import com.ijse.ecommerceapp.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceIMPL implements PaymentService {
    @Autowired
    private PaymentRepo paymentRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<PaymentDTO> getPaymentByName(double amount) {
        boolean b = true;
        List<Payment> payments = paymentRepo.findAllByAmount(amount);
        return null;
    }
}
