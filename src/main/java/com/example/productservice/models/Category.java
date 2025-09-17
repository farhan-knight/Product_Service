package com.example.productservice.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel {

    @Column(nullable = false, unique = true)
    private String name;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "category")
    private List<Product> products;

    //mappedBy helps by not creating a mapping table and reminds that manytoone relation
    // is already made in product class/table.

}
