package com.dev.service;

import java.util.List;

import com.dev.entity.Student;

public interface StudentService {

	List<Student> listStudents();
	
	
	void save(Student student);
	Student findById(int id);
	
	void delete(int id);

}
