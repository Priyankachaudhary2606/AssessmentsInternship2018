package com.nskfdc.scgj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.FacebookUserDetailsDao;
import com.nskfdc.scgj.dto.FacebookUserDetailsDto;


@Service
public class FacebookService {
	
	@Autowired
	private FacebookUserDetailsDao facebookUserDetailsDao;
	
	public FacebookUserDetailsDto getUserDetails(String username) {
		
	return facebookUserDetailsDao.getFacebookUserDetails(username);
	
		
	}

}
