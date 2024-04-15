package com.gatepass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gatepass.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
