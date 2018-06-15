package com.nskfdc.scgj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.SamridhiChefService;

@RestController
public class SamridhiWaiterController {
	
	@Autowired
	private SamridhiChefService chefservice;
	
	@RequestMapping("/getSpoons")
	public String getSpoonsMethod()
	{
		return "Here are the Spoons";
	}
	@RequestMapping("/getBurger")
	public String getBurgerMethod(@RequestParam("comment") String addComment)
	{
		return SamridhiChefService.getBurgerMethod(addComment);
	}
	@RequestMapping("/getMomos")
	public String getMomosMethod(@RequestParam("comment1") String comment1,@RequestParam("comment2") String comment2){
		return SamridhiChefService.getMomosMethod(comment1,comment2);
	}

}
