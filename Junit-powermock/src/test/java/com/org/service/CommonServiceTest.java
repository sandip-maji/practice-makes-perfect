package com.org.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(PowerMockRunner.class)
@PrepareForTest({CommonService.class})
public class CommonServiceTest {
	
	@InjectMocks
	CommonService commonService;
	
	@Test
	public void getServiceDetailsTest() throws Exception {
		
		//String string = ReflectionTestUtils.invokeMethod(commonService, "getMsg");
		CommonService spy = PowerMockito.spy(commonService);
		
		PowerMockito.doReturn("mock").when(spy, "getMsg");
		
		String str = spy.getServiceDetails();
		
		//String  result = commonService.getServiceDetails();
		
		assertNotNull(str);
		
	}
	

}
