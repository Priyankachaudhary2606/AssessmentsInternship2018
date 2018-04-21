package com.nskfdc.scgj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public String getLoginUser() {
		
		LOGGER.debug("In LoginController, to get the authenticated user details");
		LOGGER.debug("Request received from the frontend for authorised login");
		
		try {
			
			LOGGER.debug("In TRY block of LoginController");
			LOGGER.debug("Sending Request to service");
		
		//write your code here
			
			return null;
			
			
		}catch(Exception e) {
			LOGGER.debug("In CATCH block of LoginControlller");
			LOGGER.error("ERROR: Encountered an exception.");
			LOGGER.error("Exception is :"+e);
			LOGGER.debug("returning NULL");
			return null;
		}
	}

}
