package com.example.productservice.Inheritence_DB.SingleTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("S_MentorRepository")
public interface S_MentorRepository extends JpaRepository <S_Mentor,Long> {

    @Override
    S_Mentor save(S_Mentor mentor);

}
