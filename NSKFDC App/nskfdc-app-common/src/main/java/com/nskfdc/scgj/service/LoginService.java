package com.nskfdc.scgj.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.LoginDao;

@Service
public class LoginService {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(LoginService.class);
	
	@Autowired
	private LoginDao loginDao;
	
	
	public void getUserAuthentication() {
		
		//write LOGGER here
		
		try {
			//write your code here & change return type
			
			loginDao.userExistence(); 			// to check if user exists
			
			loginDao.getValidUserDetails();		//to get the details of valid user
			
		} catch (Exception e) {
			
			//write LOGGER here
			
			//return default value, it can be null
			
		}
		
		
	}

}
