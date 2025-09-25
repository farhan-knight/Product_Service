package com.example.productservice.service;


import com.example.productservice.dtos.FakeStoreProductdto;
import com.example.productservice.dtos.GenericProductdto;
import com.example.productservice.exceptions.ProductNotFoundException;
import com.example.productservice.models.Product;
import com.example.productservice.security.JWTObject;
import com.example.productservice.security.Role;
import com.example.productservice.security.TokenValidator;
import com.example.productservice.security.UserDto;
import com.example.productservice.thirdpartyclient.FakeStoreClient.FakeStoreClientAdapter;
import com.sun.jdi.request.InvalidRequestStateException;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service()
@Primary

public class FakeStoreProductService implements ProductService{

    private String GetProductUrl = "https://fakestoreapi.com/products/{id}";

    private FakeStoreClientAdapter fakeStoreClientAdapter;
    private TokenValidator tokenValidator;

    public FakeStoreProductService(FakeStoreClientAdapter fakeStoreClientAdapter,TokenValidator tokenValidator) {
        this.fakeStoreClientAdapter = fakeStoreClientAdapter;
        this.tokenValidator = tokenValidator;

    }

    @Override
    public GenericProductdto getProductById(Long id) throws ProductNotFoundException {


        FakeStoreProductdto fakeStoreProductdto = fakeStoreClientAdapter.getProductById(id);

        return ConvertProductdto(fakeStoreProductdto);

    }

    private  static GenericProductdto ConvertProductdto(FakeStoreProductdto fakeStoreProductdto){
        GenericProductdto genericProductdto = new GenericProductdto();

        genericProductdto.setId(fakeStoreProductdto.getId());
        genericProductdto.setTitle(fakeStoreProductdto.getTitle());
        genericProductdto.setPrice(fakeStoreProductdto.getPrice());
        genericProductdto.setDescription(fakeStoreProductdto.getDescription());
        genericProductdto.setCategory(fakeStoreProductdto.getCategory());
        genericProductdto.setImage(fakeStoreProductdto.getImage());

        return genericProductdto;
    }

    @Override
    public ResponseEntity<List<GenericProductdto>> getAllProducts() {

        // Fetch all products
        List<FakeStoreProductdto> fakeStoreProductDtos = fakeStoreClientAdapter.getAllProducts();

        List<GenericProductdto> genericProductDtos = new ArrayList<>();
        for (FakeStoreProductdto fakeStoreProductDto : fakeStoreProductDtos) {
            genericProductDtos.add(ConvertProductdto(fakeStoreProductDto));
        }

        // Modify the product titles as per business logic (optional)


        // Return the modified list of products
        return new ResponseEntity(genericProductDtos, HttpStatus.OK);

    }

    @Override
    public GenericProductdto deleteProductbyId(Long id) {

        return new GenericProductdto();
    }

    @Override
    public void createProduct() {

    }

    @Override
    public void updateProductbyId(Long id) {

    }
}
