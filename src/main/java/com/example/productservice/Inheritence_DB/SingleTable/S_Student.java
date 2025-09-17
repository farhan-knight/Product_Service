package com.example.productservice.Inheritence_DB.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "S_Student")
@DiscriminatorValue(value = "1")
public class S_Student extends S_User {

    private Long psp;


}
