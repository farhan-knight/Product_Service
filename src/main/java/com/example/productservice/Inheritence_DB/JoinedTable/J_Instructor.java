package com.example.productservice.Inheritence_DB.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "J_Instructor" )
@PrimaryKeyJoinColumn(name = "user_id")
public class J_Instructor extends J_User {

    private Double ratings;
}
