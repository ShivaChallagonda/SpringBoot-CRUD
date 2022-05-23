package com.dev.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dev.entity.Student;
import com.dev.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to handle list students and return mode and view
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		List<Student> students = studentService.listStudents();
		mav.addObject("students", students);
		return mav;
	}
	
	@RequestMapping("/student")
	public ModelAndView addStudent() {
		ModelAndView mav = new ModelAndView("student");
		mav.addObject("student", new Student());
		return mav;
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("student") Student student) {
		studentService.save(student);
		return "redirect:/";
	}
	
	@GetMapping("/student/{id}")
	public ModelAndView edit(@PathVariable Integer id) {
		ModelAndView mav = new ModelAndView("student");
		Student student = studentService.findById(id);
		mav.addObject("student",student);
		return mav;
	}
	
	@RequestMapping("/student/{id}/delete")
	public String delete(@PathVariable Integer id) {
		studentService.delete(id);
		return "redirect:/";
	}

}
