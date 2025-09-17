package com.example.productservice.Inheritence_DB.SingleTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("J_StudentRepository")
public interface S_StudentRepository extends JpaRepository<S_Student,Long> {
    @Override
    <S extends S_Student> S save(S entity);
}
