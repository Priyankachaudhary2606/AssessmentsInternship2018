package com.nskfdc.scgj.service;

import org.springframework.stereotype.Service;

@Service
public class MoneyService {
public String getmymoney(String a, String b)
{
	String c=a+b;
	
	return "Your Balance is"+c;
}
}
