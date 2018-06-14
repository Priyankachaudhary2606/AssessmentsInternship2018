package com.nskfdc.scgj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nskfdc.scgj.service.MoneyService;
@RestController
public class MoneyController {
@Autowired
public MoneyService bank;
	
@RequestMapping("/getmemoney")
public String getmoneyMethod(){

	return "To get 10,000 Rs.......Earn them!";

}

@RequestMapping("/getmemoremoney")
public String getmoremoneyMethod(){
	return "To get 100,000 Rs.......Earn them!";

} 

@RequestMapping("/personId")
String Additional_Comment(@RequestParam("comment") String comment, @RequestParam("comment2") String comment2) {
	return bank.getmymoney(comment,comment2);
}

}
