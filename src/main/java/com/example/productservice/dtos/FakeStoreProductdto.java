package com.example.productservice.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Getter
public class FakeStoreProductdto {

    private int id;

    private String title;

    private int price;

    private String description;

    private String category;

    private  String image;
}
