package com.example.productservice.Inheritence_DB.JoinedTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("J_MentorRepository")
public interface J_MentorRepository extends JpaRepository <J_Mentor,Long> {

    @Override
    J_Mentor save(J_Mentor mentor);

}
