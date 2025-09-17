package com.example.productservice.Inheritence_DB.TableperClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity(name = "Tpc_User")
public class Tpc_User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Name;

    private String Email;
}
