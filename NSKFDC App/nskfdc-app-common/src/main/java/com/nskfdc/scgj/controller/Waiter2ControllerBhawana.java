package com.nskfdc.scgj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.ServiceClassBhawana;

@RestController
public class Waiter2ControllerBhawana{
	@Autowired
	public ServiceClassBhawana service;
	
	 @RequestMapping("/getmomos1")
	 public String giveMomosMethod(){
		 
		 return"Have the Yammy Momos";
	 }
	
	 
	 @RequestMapping("/getmomos2")
	 public String giveMomos(@RequestParam("comment") String additionalcomment){
		 return ServiceClassBhawana.makeMomos(additionalcomment );
	 }
	
    @RequestMapping("/getmomos3")
    public String takeMomos(@RequestParam("comment1") String additionalcomment1, @RequestParam("comment2") String additionslcomment2){
    	return ServiceClassBhawana.haveMomos(additionalcomment1,additionslcomment2);
   }
	 
}
