package com.example.springboot.workshop.persons.dao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.data.r2dbc.repository.R2dbcRepository.

import com.example.springboot.workshop.persons.models.entity.Person;

@Repository
public interface PersonDao extends ReactiveCrudRepository<Person, Long> {
	
}
