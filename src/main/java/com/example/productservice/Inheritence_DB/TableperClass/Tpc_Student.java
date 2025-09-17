package com.example.productservice.Inheritence_DB.TableperClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "Tpc_Student")
public class Tpc_Student extends Tpc_User {

    private Long psp;


}
