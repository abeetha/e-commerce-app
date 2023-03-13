package com.ijse.ecommerceapp.service;

import com.ijse.ecommerceapp.dto.OrdersDTO;
import com.ijse.ecommerceapp.dto.PaymentDTO;

import java.util.List;

public interface OrdersService {

    List<OrdersDTO> getTotalOrdersByName(double totalCost);
}
