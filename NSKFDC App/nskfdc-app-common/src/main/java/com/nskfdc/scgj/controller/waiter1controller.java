package com.nskfdc.scgj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.ChefController;

@RestController
public class waiter1controller 
{
	
	@Autowired
	public ChefController chef;
	
	@RequestMapping("/getSpoons")
	public String getSpoons()
	{
    return "Have the spoons";
		}
@RequestMapping("/getBurgers")
public String makeBurgers(@RequestParam("comment")String addcomment){
	return ChefController.makeBurgers(addcomment);
}
@RequestMapping("/getMomos")
public String makeMomos(@RequestParam("comment 1")String addcomment1,@RequestParam("comment 2")String addcomment2){
	{
		return ChefController.makeMomos(addcomment1,addcomment2);
	}
}

}
