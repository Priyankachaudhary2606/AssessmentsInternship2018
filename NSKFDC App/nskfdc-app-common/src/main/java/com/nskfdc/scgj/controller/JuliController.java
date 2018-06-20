//package com.nskfdc.scgj.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.nskfdc.scgj.service.juliservice;
//
//@RestController
//public class JuliController
//{
//	@Autowired
//	private juliservice juliservice1;
//	@RequestMapping("/getmomos")
//	public String getmomosmethod()
//	{
//		return juliservice1.makemomos();
//	}
//
//	@RequestMapping("/getmomos1")
//	public String getmomosmethod1(@RequestParam("comment")String additionalcomment)
//	{
//		return juliservice1.makemomos(additionalcomment);
//	}
//	
//	@RequestMapping("/getmomos2")
//	public String getmomosmethod2(@RequestParam("comment")String additionalcomment1,@RequestParam("comment1")String additionalcomment2)
//	{
//		return juliservice1.makemomos(additionalcomment1,additionalcomment2);
//
//
//	}
//}