package com.example.productservice.service;


import com.example.productservice.dtos.GenericProductdto;
import com.example.productservice.models.Product;
import com.example.productservice.repositories.ProductRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    private ProductRespository productRespository;

    public SearchService(ProductRespository productRespository){
        this.productRespository = productRespository;
    }

    public List<GenericProductdto> searchProduct(String query){

        List<Product> products = productRespository.findAllByTitle(query);

        List<GenericProductdto> genericProductDtos = List.of();

        for(Product product : products){
           genericProductDtos.add(product.from(product));
        }

        return genericProductDtos;
    }
}
