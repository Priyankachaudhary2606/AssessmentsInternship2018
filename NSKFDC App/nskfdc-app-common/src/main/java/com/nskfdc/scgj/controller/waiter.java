package com.nskfdc.scgj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.chef;

@RestController
public class waiter {
@Autowired
private chef chef1;
	@RequestMapping("/getmomosrq1")
	public String getmomosrq1(@RequestParam("comment1")String comment1)
	{
		return chef1.makemomosrq1(comment1);
		
	}
	
@RequestMapping("/getmomosrqs")
public String getmomosrqs(@RequestParam("comment1")String comment1, @RequestParam("comment2")String comment2)
{
	return chef1.makemomosrqs(comment1,comment2);
	
}
@RequestMapping("/getmomos")
public String getmomosrq1()
{
	return chef1.makemomos();
	
}

}
