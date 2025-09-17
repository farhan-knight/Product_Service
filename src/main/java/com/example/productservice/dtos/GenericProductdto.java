package com.example.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GenericProductdto {

    private int id;

    private String title;

    private int price;

    private String description;

    private String category;

    private  String image;



}
