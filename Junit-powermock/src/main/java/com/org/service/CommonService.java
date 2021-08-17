package com.org.service;

import org.springframework.stereotype.Component;

@Component
public class CommonService extends BaseService{

	public String getServiceDetails() {

		String result = getMsg();

		return result;
	}
	
	public String getBaseDisplay() {

		String result = display();

		return result;
	}

	private String getMsg() {
		return "CommonService is working";
	}

}
