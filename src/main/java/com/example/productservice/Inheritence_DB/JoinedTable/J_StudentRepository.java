package com.example.productservice.Inheritence_DB.JoinedTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("S_StudentRepository")
public interface J_StudentRepository extends JpaRepository<J_Student,Long> {
    @Override
    <S extends J_Student> S save(S entity);
}
