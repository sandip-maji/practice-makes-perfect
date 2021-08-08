package com.org.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jpa/")
public class Controller {
	

	@GetMapping(path="/getDetails")
	public ResponseEntity<String> getDetails(){
		return new ResponseEntity<String>("Spring Boot with Spring Data JPA",HttpStatus.OK);
	}
	
}
