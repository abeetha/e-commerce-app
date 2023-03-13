package com.ijse.ecommerceapp.service;

import com.ijse.ecommerceapp.dto.UserDTO;
import com.ijse.ecommerceapp.dto.request.RequestUpdateUserDTO;

import java.util.List;

public interface UserService {
    public String saveUser(UserDTO userDTO);

    String updateUser(RequestUpdateUserDTO userDTO);

    List<UserDTO> getAllUsers();

    String deleteUser(String userId);
}
