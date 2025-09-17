package com.example.productservice.Inheritence_DB.MappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "MS_Student")
public class Student extends User {

    private Long psp;


}
