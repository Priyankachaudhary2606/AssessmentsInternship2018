package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.BhawanaANODto;
import com.nskfdc.scgj.service.BhawanaANOService;

@RestController
public class BhawanaANOController {
	
	private static final Logger LOGGER= LoggerFactory.getLogger(BhawanaANOService.class);
	
	@Autowired
	private BhawanaANOService anoService;
	
	@RequestMapping("/getAirtelCustomer")
	public Collection<BhawanaANODto> getAirtelCustomer(){
		try{
		
			LOGGER.debug("I m In try block of AnOController");
			return anoService.getNetworkOpreaterDetailForAirtel();
					
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("I m in controller ");
			
			LOGGER.debug("I m In Catch block of AnOController");
			return null;
		}
	}
	
	@RequestMapping("/getSpecifiedNetworkUser")
	public Collection<BhawanaANODto> getSpecifiedNetworkOperator(@RequestParam("operatorName")String opreator){
		return anoService.getSpecifiedNetworkOpreaterDetail(opreator);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
