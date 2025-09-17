package com.example.productservice.Inheritence_DB.MappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "MS_Mentor")
public class Mentor extends User {

    private Long Sessions;

}
