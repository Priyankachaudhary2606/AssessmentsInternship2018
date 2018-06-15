package com.nskfdc.scgj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nskfdc.scgj.service.Chef1ServiceAman;

@RestController
public class Waiter1ControllerAman {
	@Autowired
	public Chef1ServiceAman chef;
	@RequestMapping("/getSpoons")
	public String getSpoons()
	{
		return "Get the Spoons";
	}
	@RequestMapping("/getBurgers")
	public String getBurgers(@RequestParam("comment1")String addcomment1,@RequestParam("comment2")String addcomment2){
		return Chef1ServiceAman.makeBurgers(addcomment1, addcomment2);
	}
	@RequestMapping("/getMomos")
	public String getMomos(@RequestParam("comment1")String addcomment1){
		return Chef1ServiceAman.makeMomos(addcomment1); 
	}
}
