package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.OpDtoAman;
import com.nskfdc.scgj.service.OpServiceAman;

@RestController
public class OpControllerAman {
	

	@Autowired
	private OpServiceAman opService;
	
	@RequestMapping("/getAmanAirtelCustomer")
	public Collection<OpDtoAman> getdetails(){
		
	
		
		try {
		
			return opService.getShowCustomerDetails();
			
		}catch(Exception e) {
			return null;
			
		}
	}

}

