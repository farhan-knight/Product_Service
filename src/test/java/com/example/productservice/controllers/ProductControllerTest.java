package com.example.productservice.controllers;

import com.example.productservice.service.ProductService;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
public class ProductControllerTest {

    @Test
    void TestOnePlusOneIsTWo(){

    }

    @MockitoBean()
    @Qualifier("FakeStoreProductService")
    private ProductService productService;

    @Inject
    private ProductController productController;

//    @Test
//    void TestGetProductByIdMocking() throws ProductNotFoundException {
//        GenericProductdto genericProductdto = new GenericProductdto();
//
//        when(productService.getProductById(any(Long.class))).thenReturn(genericProductdto);
//
//       // assertNull(productController.getProductById(100L));
//       // GenericProductdto genericProductdto1 = productController.getProductById(1394L);
//        assertEquals(genericProductdto, productController.getProductById(1394L));
//
//    }
//
//    @Test
//    void TestGetProductByIdMockingException() throws ProductNotFoundException {
//        when(productService.getProductById(0L)).thenThrow(ProductNotFoundException.class);
//
//        assertThrows(ProductNotFoundException.class,
//                () -> productController.getProductById(10L));
//    }
}
