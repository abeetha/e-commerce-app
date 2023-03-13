package com.ijse.ecommerceapp.service.impl;

import com.ijse.ecommerceapp.dto.UserDTO;
import com.ijse.ecommerceapp.dto.request.RequestUpdateUserDTO;
import com.ijse.ecommerceapp.entity.User;
import com.ijse.ecommerceapp.repo.UserRepo;
import com.ijse.ecommerceapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public String saveUser(UserDTO userDTO) {
            User user = new User(
                    userDTO.getPropertyId(),
                    userDTO.getContactNumber(),
                    userDTO.getName(),
                    userDTO.getEmail(),
                    userDTO.getPassword(),
                    userDTO.getNic()

        );
        if(userRepo.existsById(user.getPropertyId())){
            throw new DuplicateKeyException("User Already Exists");
        }else{
            userRepo.save(user);
            return user.getName() + " saved";
        }
    }

    @Override
    public String updateUser(RequestUpdateUserDTO userDTO) {
        if(userRepo.existsById(userDTO.getPropertyId())){
            User user = userRepo.getReferenceById(userDTO.getPropertyId());
            user.setName(userDTO.getName());
            user.setContactNumber(userDTO.getContactNumber());
            user.setEmail(userDTO.getEmail());
            user.setPassword(userDTO.getPassword());
            userRepo.save(user);
            return "saved "+ user.getPropertyId()+ user.getName();

        }else{
            throw new RuntimeException("Customer Not In Database");
        }
    }

    @Override
    public List<UserDTO> getAllUsers() {
       List<User> getUser = userRepo.findAll();
       List<UserDTO> userDTOList = new ArrayList<>();

       for(User user : getUser){
           UserDTO userDTO = new UserDTO(
                   user.getPropertyId(),
                   user.getPassword(),
                   user.getContactNumber(),
                   user.getName(),
                   user.getEmail(),
                   user.getNic()
           );
           userDTOList.add(userDTO);
       }
       return userDTOList;
    }

    @Override
    public String deleteUser(String userId) {
        if (userRepo.existsById(userId)) {
            userRepo.deleteById(userId);
            return "delete Success";
        } else {
            return "NO User Found From That Id";
        }
    }

}
