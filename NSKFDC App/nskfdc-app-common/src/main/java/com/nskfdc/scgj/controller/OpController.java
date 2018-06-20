package com.nskfdc.scgj.controller;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.OpDto;
import com.nskfdc.scgj.service.OpService;


@RestController
public class OpController {
	

	@Autowired
	private OpService opService;
	
	@RequestMapping("/getAkashAirtelCustomer")
	public Collection<OpDto> getdetails(){
		
	
		
		try {
		
			return opService.getShowCustomerDetails();
			
		}catch(Exception e) {
			return null;
			
		}
	}

}



