package com.javainuse.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javainuse.model.Degree;
import com.javainuse.model.Student;
import com.javainuse.service.impl.DegreeService;
import com.javainuse.service.impl.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private DegreeService degreeService;

	@Autowired
	private StudentService service;
	
	@RequestMapping("/getStudents")
	public String viewIndexPage(Model model){
		List<Student> studentList = service.listAll();
		model.addAttribute("getAllStudent", studentList);
		System.out.println(studentList.get(0));
		return "getStudents";
	}
	
	@RequestMapping("/addStudents")
	public String viewNewStudentForm(Model model) {
		Student student = new Student();
		List<Degree> degreeList = degreeService.listAll();
		model.addAttribute("getAllDegree", degreeList);
		model.addAttribute("student", student);
		return "addStudents";
	}
	
	@RequestMapping(value = "/save_Stuent", method = RequestMethod.POST)
	public String addNewStudent(Model model, @ModelAttribute("student") Student student) {
		service.create(student);
		List<Student> studentList = service.listAll();
		model.addAttribute("getAllStudent", studentList);
		System.out.println(studentList.get(0));
		return "addStudents";
	}
}
