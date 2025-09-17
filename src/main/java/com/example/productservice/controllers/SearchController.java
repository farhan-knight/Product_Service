package com.example.productservice.controllers;


import com.example.productservice.dtos.GenericProductdto;
import com.example.productservice.dtos.SearchProductDto;
import com.example.productservice.service.SearchService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {

    private SearchService searchService;

    public SearchController(SearchService searchService){
        this.searchService = searchService;
    }

    @PostMapping
    public List<GenericProductdto> searchProduct(@RequestBody SearchProductDto searchProductDto){
        return null;
    }

}
