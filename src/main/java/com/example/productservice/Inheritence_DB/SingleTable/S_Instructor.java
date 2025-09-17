package com.example.productservice.Inheritence_DB.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "S_Instructor" )
@DiscriminatorValue(value = "3")
public class S_Instructor extends S_User {

    private Double ratings;
}
