package com.example.productservice.thirdpartyclient.FakeStoreClient;

import com.example.productservice.dtos.FakeStoreProductdto;
import com.example.productservice.dtos.GenericProductdto;
import com.example.productservice.exceptions.ProductNotFoundException;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FakeStoreClientAdapter {

    private String GetProductUrl = "https://fakestoreapi.com/products/{id}";

    private  RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
    public FakeStoreClientAdapter(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }


    public FakeStoreProductdto getProductById(Long id) throws ProductNotFoundException {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<FakeStoreProductdto> responseEntity =
                restTemplate.getForEntity(GetProductUrl,FakeStoreProductdto.class,id);

        FakeStoreProductdto fakeStoreProductdto = responseEntity.getBody();

        if(fakeStoreProductdto == null){
            throw new ProductNotFoundException("Product not found");
        }

        return fakeStoreProductdto;

    }




    public List<FakeStoreProductdto> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductdto[]> responseEntity =
                restTemplate.getForEntity("https://fakestoreapi.com/products",FakeStoreProductdto[].class);

        return List.of(responseEntity.getBody());


    }


    public GenericProductdto deleteProductbyId(Long id) {

        RestTemplate restTemplate = restTemplateBuilder.build();

        return new GenericProductdto();
    }

    public void createProduct() {

    }

    public void updateProductbyId(Long id) {

    }
}
