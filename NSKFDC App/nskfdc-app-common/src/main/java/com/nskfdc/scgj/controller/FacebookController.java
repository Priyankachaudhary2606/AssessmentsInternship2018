package com.nskfdc.scgj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.dto.FacebookUserDetailsDto;
import com.nskfdc.scgj.service.FacebookService;

@RestController
public class FacebookController {
	
	@Autowired
	private FacebookService facebookService;
	
	@RequestMapping("/getUserDetails")
	public FacebookUserDetailsDto getFacebookUserDetails(@RequestParam("username") String username) {
		
		return facebookService.getUserDetails(username);

}
}