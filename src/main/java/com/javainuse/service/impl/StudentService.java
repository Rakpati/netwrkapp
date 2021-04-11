package com.javainuse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.Student;
import com.javainuse.service.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public List<Student> listAll(){
		
		return repository.findAll();
	}
	
	public void create(Student student) {
		
		repository.save(student);
	}
	
}
