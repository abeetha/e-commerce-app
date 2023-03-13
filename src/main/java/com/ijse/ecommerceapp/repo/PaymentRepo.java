package com.ijse.ecommerceapp.repo;

import com.ijse.ecommerceapp.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface PaymentRepo extends JpaRepository<Payment,String> {
    List<Payment> findAllByAmount(double amount);
}
