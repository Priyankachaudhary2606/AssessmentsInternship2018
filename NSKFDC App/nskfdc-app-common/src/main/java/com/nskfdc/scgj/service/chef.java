package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class chef {

	public String makemomos()
	{return "momos";
	
	}
	public String makemomosrqs(String comment1, String comment2){
		return "momos"+comment1+comment2;
	}
	public String makemomosrq1(String comment1)
	{
		return "momos"+comment1;
	}
}
