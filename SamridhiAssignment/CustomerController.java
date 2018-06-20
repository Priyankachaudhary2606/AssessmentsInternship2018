package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.CustomerDto;
import com.nskfdc.scgj.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/getCustomerDetails")
	public Collection<CustomerDto> getDetails()
	{
		//("Entered in Controller");
		try
		{
			System.out.println("In try Block");
			System.out.println("Entered in Controller");
			return customerService.getDetails();
		}
		
		catch (Exception e)
		{
			System.out.println("Entered in Controller Catch");
			return null;
		}
	}

}
