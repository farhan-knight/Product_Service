package com.example.productservice.Inheritence_DB.MappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "MS_Instructor" )
public class Instructor extends User {

    private Double ratings;
}
