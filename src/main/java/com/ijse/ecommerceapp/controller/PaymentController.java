package com.ijse.ecommerceapp.controller;

import com.ijse.ecommerceapp.dto.PaymentDTO;
import com.ijse.ecommerceapp.dto.ProductDTO;
import com.ijse.ecommerceapp.entity.Product;
import com.ijse.ecommerceapp.repo.ProductRepo;
import com.ijse.ecommerceapp.service.PaymentService;
import com.ijse.ecommerceapp.service.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/payment")
@CrossOrigin
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(
            path = "/get-by-name",
            params = "name"
    )
    public List<PaymentDTO> getPaymentByName(@RequestParam(value = "name") double amount) {
        List<PaymentDTO> paymentDTOS = paymentService.getPaymentByName(amount);
        return paymentDTOS;
    }
}