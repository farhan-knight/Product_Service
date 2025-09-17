package com.example.productservice.controllers;

import com.example.productservice.service.ProductService;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class) // creates necessary dependencies for productcontroller class
public class ProductControllerWebMVCTest {

    @MockitoBean()
    private ProductService productService;

    @Inject
    private MockMvc mockMvc;



//    @Test
//    void getALLProductsreturnsEmptyList() throws Exception {
//
//        when(productService.getAllProducts()).thenReturn(new ArrayList<>());
//
//        mockMvc.perform(get("/products")).andExpect(
//                status().is(200)).andExpect(content().string("[]"));
//
//    }


}
