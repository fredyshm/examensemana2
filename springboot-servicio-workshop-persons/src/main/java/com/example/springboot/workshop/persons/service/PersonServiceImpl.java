package com.example.springboot.workshop.persons.service;

import org.springframework.stereotype.Service;

import com.example.springboot.workshop.persons.dao.PersonDao;
import com.example.springboot.workshop.persons.models.entity.Person;

import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl {
	
	private final PersonDao personDao;

    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }
	
	public Mono<Person> findById(Long id) {
        return personDao.findById(id);
    }
	
}
