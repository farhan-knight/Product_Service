package com.example.productservice.controllers;

import com.example.productservice.dtos.Exceptiondto;
import com.example.productservice.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductControllerAdvices {

    @ExceptionHandler
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ResponseBody()
    private ResponseEntity<Exceptiondto> handleProductNotFoundException(ProductNotFoundException productNotFoundException) {

        Exceptiondto exceptiondto = new Exceptiondto();
        exceptiondto.setHttpStatus(HttpStatus.NOT_FOUND);
        exceptiondto.setMessage(productNotFoundException.getMessage());
        return new ResponseEntity<>(exceptiondto,HttpStatus.NOT_FOUND);
    }

}
