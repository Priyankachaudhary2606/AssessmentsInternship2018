package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class SamridhiChefService {
	public static String getBurgerMethod(String addComment){
		return "Big Burger with " +addComment+" from Service of SpringBoot";
	}
	
	public static String getMomosMethod(String comment1, String comment2){
		return "Momos that are "+comment1+" and "+ comment2 +" from Services";
	}

}
