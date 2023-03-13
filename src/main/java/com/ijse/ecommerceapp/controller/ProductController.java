package com.ijse.ecommerceapp.controller;

import com.ijse.ecommerceapp.dto.ProductDTO;
import com.ijse.ecommerceapp.entity.Product;
import com.ijse.ecommerceapp.repo.ProductRepo;
import com.ijse.ecommerceapp.service.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@CrossOrigin
public class ProductController {

    @Autowired
private ProductService productService;

@GetMapping(
        path = "/get-by-name",
        params = "name"
)
public List<ProductDTO> getProductByName(@RequestParam(value = "name") String displayName){
    List<ProductDTO> productDTOS = productService.getProductByName(displayName);
    return productDTOS;
}

}
