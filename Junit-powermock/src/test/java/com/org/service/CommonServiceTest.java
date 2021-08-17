package com.org.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ CommonService.class })
public class CommonServiceTest {

	@InjectMocks
	CommonService commonService;

	@Test
	public void testGetServiceDetails() throws Exception {
		String mockedPrivateResponse = "This is mocked response";
		CommonService commonServiceSpy = PowerMockito.spy(commonService);
		
		//Example of private method
		PowerMockito.when(commonServiceSpy, "getMsg").thenReturn(mockedPrivateResponse);
		
		String result = commonServiceSpy.getServiceDetails();
		assertNotNull(result);
		assertEquals(mockedPrivateResponse, result);
	}
	
	@Test
	public void testGetBaseDisplay() throws Exception {
		String mockedPrivateResponse = "This is mocked base response";
		CommonService commonServiceSpy = PowerMockito.spy(commonService);
		
		//Example of Inherited method
		PowerMockito.when(commonServiceSpy, "display").thenReturn(mockedPrivateResponse);
		
		String result = commonServiceSpy.getBaseDisplay();
		assertNotNull(result);
		assertEquals(mockedPrivateResponse, result);
	}

}
