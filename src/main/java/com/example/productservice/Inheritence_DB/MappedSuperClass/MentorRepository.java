package com.example.productservice.Inheritence_DB.MappedSuperClass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MS_MentorRepository")
public interface MentorRepository extends JpaRepository <Mentor,Long> {

    @Override
    Mentor save(Mentor mentor);

}
