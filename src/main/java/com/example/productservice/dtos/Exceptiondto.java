package com.example.productservice.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class Exceptiondto {

    private HttpStatus httpStatus;

    private String message;
}
