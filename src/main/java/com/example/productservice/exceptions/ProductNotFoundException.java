package com.example.productservice.exceptions;

import lombok.experimental.SuperBuilder;

public class ProductNotFoundException extends Exception{

    public ProductNotFoundException(String message) {
        super(message);
    }
}
