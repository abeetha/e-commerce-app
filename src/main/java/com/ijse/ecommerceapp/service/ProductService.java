package com.ijse.ecommerceapp.service;

import com.ijse.ecommerceapp.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getProductByName(String displayName);
}
