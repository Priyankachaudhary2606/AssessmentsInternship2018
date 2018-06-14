package com.nskfdc.scgj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.Chef1Service;

@RestController
public class Waiter1Contro {
	@Autowired
	private Chef1Service chef;
@RequestMapping("/getSpoons")
public String getSpoons()
{
	return Chef1Service.Spoons();
}
@RequestMapping("/getBurgers")
public String have(@RequestParam("comment")String addcomment)
{
	return Chef1Service.Burger(addcomment);
}
@RequestMapping("/getchilli")
public String getchilli(@RequestParam("comment1")String comment1 , @RequestParam("comment2")String comment2)
{
	return Chef1Service.Chilli(comment1,comment2);
}
}
