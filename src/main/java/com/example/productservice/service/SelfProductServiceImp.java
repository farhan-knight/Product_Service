package com.example.productservice.service;

import com.example.productservice.dtos.GenericProductdto;
import com.example.productservice.exceptions.ProductNotFoundException;
import com.example.productservice.models.Product;
import com.example.productservice.repositories.ProductRespository;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service("SelfProductServiceImp")
public class SelfProductServiceImp implements ProductService{

    private ProductRespository productRespository;

    public SelfProductServiceImp(ProductRespository productRespository){
        this.productRespository = productRespository;
    }

    @Override
    public GenericProductdto getProductById(Long id) throws ProductNotFoundException {
        GenericProductdto genericProductdto = new GenericProductdto();
        Optional<Product> optionalProduct = productRespository.findById(UUID.fromString("0ffb52cb-cedc-47ba-86ad-0343db99c946"));

        Product product = optionalProduct.get();

        genericProductdto.setTitle(product.getTitle());
        genericProductdto.setDescription(product.getDescription());
        genericProductdto.setImage(product.getImage());
        genericProductdto.setCategory(product.getCategory().toString());
        return genericProductdto;





    }

    @Override
    public ResponseEntity<List<GenericProductdto>> getAllProducts(){
        return null;
    }

    @Override
    public GenericProductdto deleteProductbyId(Long id) {
        return null;
    }

    @Override
    public void createProduct() {

    }

    @Override
    public void updateProductbyId(Long id) {

    }
}
