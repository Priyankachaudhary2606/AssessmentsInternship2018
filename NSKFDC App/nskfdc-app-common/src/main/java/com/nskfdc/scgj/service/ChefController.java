package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class ChefController {
	public static String makeBurgers(String comment){
		return "BIG BURGER"+comment;
	}
	
public static String makeMomos(String comment1,String comment2){
	return "momos"+comment1+comment2;
}
}
