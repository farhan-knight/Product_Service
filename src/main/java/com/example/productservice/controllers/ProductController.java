package com.example.productservice.controllers;

import com.example.productservice.dtos.GenericProductdto;
import com.example.productservice.exceptions.ProductNotFoundException;
import com.example.productservice.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    // Field Injection
   // @Autowired
    // private ProductService productService;

    // Setter Injection
   // @Autowired
   // public ProductService SetProductService(ProductService productService) {
   //     return productService;
    //   };


    // Constructor Injection // preferred


    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public GenericProductdto getProductById( @PathVariable("id") Long id) throws ProductNotFoundException {
       return productService.getProductById(id);
    }

    @GetMapping
    public ResponseEntity<List<GenericProductdto>> getAllProducts() {

        return productService.getAllProducts();
    }

    @DeleteMapping( "/{id}")
    public GenericProductdto deleteProductbyId(@PathVariable("id") Long id) {
        return productService.deleteProductbyId(id);
    }


    public void createProduct() {

    }

    public void updateProductbyId() {

    }

//    @ExceptionHandler(ProductNotFoundException.class)
//    private Exceptiondto handleProductNotFoundException(ProductNotFoundException productNotFoundException) {
//
//        Exceptiondto exceptiondto = new Exceptiondto();
//        exceptiondto.setHttpStatus(HttpStatus.BAD_REQUEST);
//        exceptiondto.setMessage(productNotFoundException.getMessage());
//        return exceptiondto;
//    }
}
