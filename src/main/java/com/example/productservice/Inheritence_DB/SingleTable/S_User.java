package com.example.productservice.Inheritence_DB.SingleTable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity(name = "S_User")
@DiscriminatorColumn(name = "user_type",
discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue(value = "0")
public class S_User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Name;

    private String Email;
}
