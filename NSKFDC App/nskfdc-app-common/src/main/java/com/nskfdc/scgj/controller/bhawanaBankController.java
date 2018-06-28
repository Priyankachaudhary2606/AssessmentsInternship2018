package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.BhawanaBankDto;
import com.nskfdc.scgj.service.BhawanaBankService;

@RestController
public class bhawanaBankController {
	
private static final Logger LOGGER= LoggerFactory.getLogger(BhawanaBankService.class);
	
	@Autowired
	private BhawanaBankService bhawanaBankService;
	
	@RequestMapping("/getHDFCcustomer")
	public Collection<BhawanaBankDto> getHDFCCustomer(){
		try{
		
			LOGGER.debug("I m In try block of bankController");
			return bhawanaBankService.getHDFCcustomerDetails();
					
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("I m in controller ");
			
			LOGGER.debug("I m In Catch block of bankController");
			return null;
		}
	}
	
	
	
	
	

}
