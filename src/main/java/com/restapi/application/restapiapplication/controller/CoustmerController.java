package com.restapi.application.restapiapplication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.application.restapiapplication.entity.Coustmer;
import com.restapi.application.restapiapplication.service.CoustmerService;

@RestController
@RequestMapping("/employee")
public class CoustmerController {

	public CoustmerService service;
	
	public List<Coustmer> getAll(){
		return service.getAll();
	}
	
	public Coustmer addEmployee(@RequestBody Coustmer employee) {
		return service.saveEmployee(employee);
	}
}
