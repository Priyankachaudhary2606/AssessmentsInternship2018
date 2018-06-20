package com.nskfdc.scgj.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dao.CustomerDao;
import com.nskfdc.scgj.dto.CustomerDto;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	public Collection<CustomerDto> getDetails()
	{
		
		try{
			System.out.println("Entered in Service");
			return customerDao.getDetails();
		}
		catch(Exception e)
		{
			System.out.println("ERROR");
			return null;
		}
	}
}
