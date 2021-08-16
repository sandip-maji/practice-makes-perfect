package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.service.CommonService;

@RestController
@RequestMapping(value = "/junit/")
public class Controller {

	@Autowired
	CommonService commonService;

	@GetMapping(path = "/getServiceDetails")
	public ResponseEntity<String> getServiceDetails() {

		String result = commonService.getServiceDetails();

		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
