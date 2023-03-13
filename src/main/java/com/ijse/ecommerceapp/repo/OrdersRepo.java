package com.ijse.ecommerceapp.repo;

import com.ijse.ecommerceapp.entity.Orders;
import com.ijse.ecommerceapp.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface OrdersRepo extends JpaRepository<Orders,String> {
    List<Orders> findAllByTotalCost(double totalCost);
}
