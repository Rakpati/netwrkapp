package com.javainuse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.Degree;
import com.javainuse.service.DegreeRepository;

@Service
public class DegreeService {
	
	@Autowired
	private DegreeRepository repository;
	
	public List<Degree> listAll(){
		
		return repository.findAll();
	}
	
	public void create(Degree degree) {
		
		repository.save(degree);
	}
	
	public Degree updateid(Long id) {
		
		return repository.findOne(id);
	}
	
	public void delete(Long id) {
		
		repository.delete(id);
	}

}
