package com.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.entity.Student;
import com.dev.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	@Override
	public List<Student> listStudents() {
		List<Student> students=studentRepository.findAll();
		return students;
	}
	
	@Override
	public Student findById(int id) {
		Student student = studentRepository.getById(id);
		return student;
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public void delete(int id) {
		Student student = studentRepository.getById(id);
		studentRepository.delete(student);	
	}

}
