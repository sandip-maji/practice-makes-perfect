package com.org.service;

import org.springframework.stereotype.Component;

@Component
public class CommonService {

	public String getServiceDetails() {

		String result = getMsg();

		return result;
	}

	private String getMsg() {
		return "CommonService is working";
	}

}
