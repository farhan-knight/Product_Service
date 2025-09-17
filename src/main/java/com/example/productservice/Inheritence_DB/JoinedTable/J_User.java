package com.example.productservice.Inheritence_DB.JoinedTable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "J_User")
public class J_User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Name;

    private String Email;
}
