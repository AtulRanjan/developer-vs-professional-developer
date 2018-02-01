package com.code.service;

import com.code.entity.PersonEntity;

import java.util.List;

public interface PersonService {

	public List<PersonEntity> getAll();
	
	public PersonEntity getById(Integer personId);
	
	public void delete(Integer personId);
	
	public PersonEntity create(PersonEntity person);
}
