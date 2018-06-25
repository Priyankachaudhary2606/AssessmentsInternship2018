package com.nskfdc.scgj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.AmanUserDto;
import com.nskfdc.scgj.service.AmanUserService;


@RestController
public class AmanUserController {
	
	@Autowired
	private AmanUserService amanUserService;
	
	@RequestMapping("/getSpecifiedNetworkUser")
	public AmanUserDto getCustomerUserDetails(@RequestParam("networkOperator") String networkOperator) {
		
		return amanUserService.getCustomerUserDetails(networkOperator);

}
}
