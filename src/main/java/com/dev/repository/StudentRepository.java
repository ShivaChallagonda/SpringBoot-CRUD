package com.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {


}
