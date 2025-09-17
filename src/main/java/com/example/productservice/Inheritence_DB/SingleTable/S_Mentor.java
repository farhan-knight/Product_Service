package com.example.productservice.Inheritence_DB.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "S_Mentor")
@DiscriminatorValue(value = "2")
public class S_Mentor extends S_User {

    private Long Sessions;

}
