package com.example.springboot.workshop.persons.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="persons")
public class Person {
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -1703270379502260400L;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long DNI;
	
	private String name;
	private String apellido;
	private int tarjetas;
	private String fecha;
	

}
