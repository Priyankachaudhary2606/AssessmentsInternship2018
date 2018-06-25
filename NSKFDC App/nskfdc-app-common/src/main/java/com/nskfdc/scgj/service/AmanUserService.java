package com.nskfdc.scgj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nskfdc.scgj.dao.AmanUserDao;
import com.nskfdc.scgj.dto.AmanUserDto;



@Service
public class AmanUserService {
	
	@Autowired
	private AmanUserDao AmanUserDao;
	
	public AmanUserDto getCustomerUserDetails(String networkOperator) {
		
	return AmanUserDao.getCustomerDetails(networkOperator);
	
		
	}

}
