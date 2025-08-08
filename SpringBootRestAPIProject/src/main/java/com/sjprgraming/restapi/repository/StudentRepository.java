package com.sjprgraming.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sjprgraming.restapi.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // No need to declare findById, save, deleteById, etc. - all inherited
}
