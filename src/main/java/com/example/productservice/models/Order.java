package com.example.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity(name="orders")
public class Order extends BaseModel{
    /*
        1              M
       Order ------- Product => M:M
         M              1
    */
    @ManyToMany
    @JoinTable(name = "orders_products",
            joinColumns = @JoinColumn(name = "orders_id"),
            inverseJoinColumns = @JoinColumn(name = "products_id"))
    private List<Product> productList;

}
