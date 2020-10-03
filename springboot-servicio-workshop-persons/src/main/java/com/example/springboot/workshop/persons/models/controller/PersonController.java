package com.example.springboot.workshop.persons.models.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.workshop.persons.dao.PersonDao;
import com.example.springboot.workshop.persons.models.entity.Person;
import com.example.springboot.workshop.persons.service.PersonService;
import com.example.springboot.workshop.persons.service.PersonServiceImpl;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/persons")
public class PersonController {
	
	private final PersonServiceImpl personServiceImpl;
	
	
	public PersonController(PersonServiceImpl personServiceImpl) {
		this.personServiceImpl=personServiceImpl;
	}
	
//	//NORMAL
//	@GetMapping("/{id}")
//	public Person detalle(@PathVariable Long id) throws Exception{
//		Person person = personService.findById(id);
//		return person;
//	}
	
	//REACTIVIDAD
	@GetMapping("/{id}")
	public Mono<Person> findById(@PathVariable Long id){
		return personServiceImpl.findById(id);
	}

}
