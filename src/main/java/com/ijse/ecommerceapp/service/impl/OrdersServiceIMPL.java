package com.ijse.ecommerceapp.service.impl;

import com.ijse.ecommerceapp.dto.OrdersDTO;
import com.ijse.ecommerceapp.dto.PaymentDTO;
import com.ijse.ecommerceapp.entity.Orders;
import com.ijse.ecommerceapp.entity.Payment;
import com.ijse.ecommerceapp.repo.OrdersRepo;
import com.ijse.ecommerceapp.repo.PaymentRepo;
import com.ijse.ecommerceapp.service.OrdersService;
import com.ijse.ecommerceapp.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Order;
import java.util.List;

@Service
public class OrdersServiceIMPL implements OrdersService {
    @Autowired
    private OrdersRepo orderRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<OrdersDTO> getTotalOrdersByName(double totalCost) {
        boolean b = true;
        List<Orders> orders = orderRepo.findAllByTotalCost(totalCost);
        return null;

    }
}
