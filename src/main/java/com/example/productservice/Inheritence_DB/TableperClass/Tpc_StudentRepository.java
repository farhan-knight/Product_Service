package com.example.productservice.Inheritence_DB.TableperClass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("Tpc_StudentRepository")
public interface Tpc_StudentRepository extends JpaRepository<Tpc_Student,Long> {
    @Override
    <S extends Tpc_Student> S save(S entity);
}
