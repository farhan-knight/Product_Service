package com.example.productservice.Inheritence_DB.TableperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Tpc_Instructor" )
public class Tpc_Instructor extends Tpc_User {

    private Double ratings;
}
