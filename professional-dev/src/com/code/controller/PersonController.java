package com.code.controller;

import com.code.entity.PersonEntity;

import com.code.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping
	public ResponseEntity<List<PersonEntity>> getAllPersons(){
		return ResponseEntity.ok(personService.getAll()); 
	}

	@GetMapping("/{personId}")
	public ResponseEntity<PersonEntity> getByPersonId(@PathVariable Integer personId){
		return ResponseEntity.ok(personService.getById(personId));
	}

	@DeleteMapping("/{personId}")
	public ResponseEntity<Integer> deletePerson(@PathVariable Integer personId){
		personService.delete(personId);
		return ResponseEntity.ok(personId); 
	}
	@PostMapping
	public ResponseEntity<PersonEntity> createPerson(@RequestBody PersonEntity person){
		return ResponseEntity.ok(personService.create(person)); 
	}
}
