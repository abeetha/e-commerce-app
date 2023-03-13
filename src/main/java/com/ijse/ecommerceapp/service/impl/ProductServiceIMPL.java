package com.ijse.ecommerceapp.service.impl;

import com.ijse.ecommerceapp.dto.ProductDTO;
import com.ijse.ecommerceapp.entity.Product;
import com.ijse.ecommerceapp.repo.ProductRepo;
import com.ijse.ecommerceapp.service.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceIMPL implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<ProductDTO> getProductByName(String displayName) {
        boolean b = true;
        List<Product> products = productRepo.findAllBydisplayName(displayName);
        List<ProductDTO> productDTOS = modelMapper.map(products,new TypeToken<List<ProductDTO>>(){}.getType());
        return null;
    }

}
