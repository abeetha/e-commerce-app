package com.ijse.ecommerceapp.repo;

import com.ijse.ecommerceapp.entity.Product;
import com.ijse.ecommerceapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@EnableJpaRepositories
public interface ProductRepo extends JpaRepository<Product,String> {

    List<Product> findAllBydisplayName(String displayName);
}
