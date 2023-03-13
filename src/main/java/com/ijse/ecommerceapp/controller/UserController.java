package com.ijse.ecommerceapp.controller;


import com.ijse.ecommerceapp.dto.UserDTO;
import com.ijse.ecommerceapp.dto.request.RequestUpdateUserDTO;
import com.ijse.ecommerceapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path="/save")
    public String saveUser(@RequestBody UserDTO userDTO){
       userService.saveUser(userDTO);
       return "saved";
    }
    @PutMapping(path = "/update")
    public String updateUser(@RequestBody RequestUpdateUserDTO userDTO){
       String updated = userService.updateUser(userDTO);
       return updated;
    }
    @GetMapping(path = "/get-all-users")
    public List<UserDTO> getAllUsers(){
        List<UserDTO> allUsers = userService.getAllUsers();
        return allUsers;
    }
    @DeleteMapping(path = "/delete-user/{id}")
    public String deleteUser(@PathVariable(value = "id") String userId){
        String deleted = userService.deleteUser(userId);
        return deleted;
    }

}
