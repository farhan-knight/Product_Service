package com.example.productservice.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {

    @Id
    @GeneratedValue(generator = "UUID-generator")
    @GenericGenerator(name = "UUID-generator", strategy = "uuid2")
    @Column(name="Id",columnDefinition = "BINARY(16)",nullable = false,updatable = false)
    private UUID id;


}
