package com.example.productservice.service;

import com.example.productservice.dtos.GenericProductdto;
import com.example.productservice.exceptions.ProductNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    GenericProductdto getProductById(Long id) throws ProductNotFoundException;

    ResponseEntity<List<GenericProductdto>> getAllProducts();

    GenericProductdto deleteProductbyId(Long id);

    void createProduct();

    void updateProductbyId(Long id);
}
