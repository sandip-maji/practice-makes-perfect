package com.org.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.form.UserMaster;
import com.org.service.UserMasterService;

@RestController
@RequestMapping(value = "/jpa/")
public class Controller {

	@Autowired
	UserMasterService userMasterService;

	@GetMapping(path = "/getAllUserMaster")
	public ResponseEntity<List<UserMaster>> getAllUserMaster() {

		List<UserMaster> userMasterList = new ArrayList<UserMaster>();

		for (com.org.entity.UserMaster userMasterEntity : userMasterService.findAll()) {
			userMasterList
					.add(new UserMaster(userMasterEntity.getId(), userMasterEntity.getName(), userMasterEntity.getAge(),
							userMasterEntity.getEmail(), userMasterEntity.getAddress(), userMasterEntity.getPin()));
		}

		return new ResponseEntity<List<UserMaster>>(userMasterList, HttpStatus.OK);
	}

	@RequestMapping(value = "/addUserMaster", method = RequestMethod.POST)
	public void addUser(@RequestBody UserMaster userMaster) {
		com.org.entity.UserMaster userMasterEntity = new com.org.entity.UserMaster(userMaster.getId(),
				userMaster.getName(), userMaster.getAge(), userMaster.getEmail(), userMaster.getAddress(),
				userMaster.getPin());
		userMasterService.save(userMasterEntity);
	}

}
