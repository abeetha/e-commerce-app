package com.ijse.ecommerceapp.controller;

import com.ijse.ecommerceapp.dto.OrdersDTO;
import com.ijse.ecommerceapp.dto.PaymentDTO;
import com.ijse.ecommerceapp.dto.ProductDTO;
import com.ijse.ecommerceapp.entity.Product;
import com.ijse.ecommerceapp.repo.ProductRepo;
import com.ijse.ecommerceapp.service.OrdersService;
import com.ijse.ecommerceapp.service.PaymentService;
import com.ijse.ecommerceapp.service.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/orders")
@CrossOrigin
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping(
            path = "/get-by-name",
            params = "name"
    )
    public List<OrdersDTO> getTotalOrdersByName(@RequestParam(value = "name") double totalCost) {
        List<OrdersDTO> orderDTOS = ordersService.getTotalOrdersByName(totalCost);
        return orderDTOS;
    }
}