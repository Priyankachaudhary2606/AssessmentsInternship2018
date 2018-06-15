package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class Chef1ServiceAman {
	public static String makeBurgers(String comment1,String comment2){
		return "Big Burgers"+comment1+comment2;
	}
	public static String makeMomos(String comment1){
		return "Tasty Momos"+comment1;
	}

}
