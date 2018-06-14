package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class Chef1Service {
	public static String Spoons()
	{
		return "Have the spoons";
	}
	public static String Burger(String comment)
	{
		return "BigBurger"+comment;
	}
	public static String Chilli(String comment1, String comment2)
	{
		return "ChilliPotatoes"+comment1+comment2;
	}
}
