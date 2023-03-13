package com.ijse.ecommerceapp.repo;

import com.ijse.ecommerceapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User,String> {
}
