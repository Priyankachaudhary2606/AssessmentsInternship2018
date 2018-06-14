package com.nskfdc.scgj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Waiter1ControllerBhawana{
	
	 @RequestMapping("/getmomos")
	 public String giveMomosMethod(){
		 
		 return"Have the Yammy Momos";
	 }
	
	 
	 @RequestMapping("/givemomos")
	 public String giveMomos(@RequestParam("comment") String additionslcomment){
		 return "Have the momos "+additionslcomment;
	 }
	
    @RequestMapping("/takemomos")
    public String takeMomos(@RequestParam("comment1") String additioncomment1, @RequestParam("comment2") String additioncomment2){
    	return"Take this Momos "+additioncomment1+" and "+additioncomment2;
   }
	 
}
