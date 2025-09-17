package com.example.productservice.models;


import com.example.productservice.dtos.GenericProductdto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseModel {

    private String title;

    private String description;


    private String image;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Category category;

    @OneToOne(cascade = {CascadeType.REMOVE,CascadeType.PERSIST}, optional = false)
    @JoinColumn(nullable = false)
    private Price price;
    private int InventoryCount;

    // suppose if I have price object and I forget to save it and while creating product
    // object, this price object will automatically will be saved with product by using PERSIST

    public GenericProductdto from(Product product) {
        GenericProductdto genericProductdto = new GenericProductdto();

        genericProductdto.setTitle(product.getTitle());
        genericProductdto.setDescription(product.getDescription());
        genericProductdto.setImage(product.getImage());
        genericProductdto.setCategory(product.getCategory().toString());
        return genericProductdto;
    }
}
