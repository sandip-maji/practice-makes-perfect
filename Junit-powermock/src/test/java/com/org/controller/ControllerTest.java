package com.org.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.org.service.CommonService;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Controller.class})
public class ControllerTest {

	@InjectMocks
	Controller controller;

	@Mock
	CommonService commonService;

	@Test
	public void getAllUserMasterTest() throws Exception {
		
		String serviceResult ="CommonService Test Case working";
		PowerMockito.when(commonService.getServiceDetails()).thenReturn(serviceResult);

		ResponseEntity<String> result = controller.getServiceDetails();

		assertEquals(HttpStatus.OK, result.getStatusCode());
		assertEquals("CommonService Test Case working", result.getBody());
	}

}
