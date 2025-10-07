package com.example.productservice.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Setter
@Getter
public class FakeStoreProductdto implements Serializable {

    private int id;

    private String title;

    private int price;

    private String description;

    private String category;

    private  String image;
}
