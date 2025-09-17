package com.example.productservice.Inheritence_DB.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "J_Mentor")
@PrimaryKeyJoinColumn(name = "user_id")
public class J_Mentor extends J_User {

    private Long Sessions;

}
