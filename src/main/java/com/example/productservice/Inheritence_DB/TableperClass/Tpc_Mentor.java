package com.example.productservice.Inheritence_DB.TableperClass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "Tpc_Mentor")
public class Tpc_Mentor extends Tpc_User {

    private Long Sessions;

}
