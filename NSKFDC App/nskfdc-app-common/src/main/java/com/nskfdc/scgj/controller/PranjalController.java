package com.nskfdc.scgj.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nskfdc.scgj.dto.PranjalDto;
import com.nskfdc.scgj.service.PranjalService;

@RestController
public class PranjalController {
	@Autowired
	private PranjalService pranjalService;
	@RequestMapping("/getPranjalAirtel")
	public Collection<PranjalDto> getCustomerDetails(){
		try {
			return pranjalService.getCustomerDetails();
		}
		catch(Exception e) {
			return null;
		}
	}

}
