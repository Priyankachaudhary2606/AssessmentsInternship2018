package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class Restraunt_Handler_sarthak {
	public String momoHandler(){
		return "no parameter!";
	}
	
	public static String burgerHandler( String cheeseOption){
		return "Burger with " + cheeseOption + " cheese!";
	}
	
	public static String pastaHandler( String cheeseOption, String flavour){
		return "Pasta with " + cheeseOption + " cheese and " + flavour + " sauce!";
	}

}
