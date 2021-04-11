package com.javainuse.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.model.Degree;

public interface DegreeRepository extends JpaRepository<Degree, Long> {

}
