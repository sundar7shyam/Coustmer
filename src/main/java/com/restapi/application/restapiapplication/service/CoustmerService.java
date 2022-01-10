package com.restapi.application.restapiapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.application.restapiapplication.entity.Coustmer;
import com.restapi.application.restapiapplication.repository.CoustmerRepository;

@Service
public class CoustmerService {

	@Autowired
	public CoustmerRepository repository;
	
	public List<Coustmer> getAll(){
		return repository.getAll();	
	}
	
	public Coustmer saveEmployee(Coustmer employee) {
		return repository.save(employee);
	}

	

	
}
