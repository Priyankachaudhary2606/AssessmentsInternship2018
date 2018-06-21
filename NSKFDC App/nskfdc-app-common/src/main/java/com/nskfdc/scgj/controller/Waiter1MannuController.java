//package com.nskfdc.scgj.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import com.nskfdc.scgj.service.Chef1MannuService;
//
//@RestController
//public class Waiter1MannuController {
//	@Autowired
//	private Chef1MannuService chef1Service;
//	
//	@RequestMapping("/getmomos1")
//	public String getmomos1()
//	{
//		return chef1Service.makeMomos();
//	}
//	
//	@RequestMapping("/getmomos2")
//	public String getmomos2(@RequestParam("comment") String additionalInfo)
//	{
//		return chef1Service.makeMomos(additionalInfo);
//	}
//	
//	@RequestMapping("/getmomos3")
//	public String getmomos3(@RequestParam("comment1") String additionalInfo1, @RequestParam("comment2") String additionalInfo2)
//	{
//		return chef1Service.makeMomos(additionalInfo1,additionalInfo2);
//	}
//
//}
