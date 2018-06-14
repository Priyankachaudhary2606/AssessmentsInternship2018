package com.nskfdc.scgj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.Shivanshu;
@RestController
public class waiter1 {
	
	@RequestMapping("/hello1")
	public String printHello()
	{
		return "hello";
	}
	@Autowired
	private Shivanshu bawarchi;
	@RequestMapping("/getFolks") 
	public String getFolksMethod(@RequestParam("a")String additionalcomment,@RequestParam("b")String additionalcomments){
		return bawarchi.getFolksMethod(additionalcomment,additionalcomments);
	}
	@RequestMapping("/getNoodles")
	public String getNoodlesMethod(){
		return "have the noodles";
	}
	@RequestMapping("/getChai")
	public String getChaiMethod(@RequestParam("c")String addcomment){
		return "have the chai"+addcomment;
	}
}
