package com.example.productservice.Inheritence_DB.TableperClass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("Tpc_MentorRepository")
public interface Tpc_MentorRepository extends JpaRepository <Tpc_Mentor,Long> {

    @Override
    Tpc_Mentor save(Tpc_Mentor mentor);

}
