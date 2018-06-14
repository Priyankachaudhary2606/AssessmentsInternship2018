package com.nskfdc.scgj.controller;

//import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.Restraunt_Handler_sarthak;


@RestController
public class RestrauntController_sarthak {
	@Autowired
	private Restraunt_Handler_sarthak obj1;
	
	
	@RequestMapping("/momos")
	public String momos (){
		return "m0M0 controller called" ;
		
	}
	
	@RequestMapping("/burger")
	public String burger ( @RequestParam("cheese") String cheese){
		return Restraunt_Handler_sarthak.burgerHandler(cheese) ;
		
	}

	@RequestMapping("/pasta")
	public String pasta ( @RequestParam("cheese") String cheese , @RequestParam("sauce") String sauceFlavour){
		return Restraunt_Handler_sarthak.pastaHandler(cheese,sauceFlavour) ;

}
}


