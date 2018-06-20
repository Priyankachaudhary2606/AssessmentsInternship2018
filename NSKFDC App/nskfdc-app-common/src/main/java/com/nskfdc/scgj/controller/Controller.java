//package com.nskfdc.scgj.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.nskfdc.scgj.service.chefservice;
//
//@RestController
//public class Controller {
//	@Autowired
//	private chefservice obj1;
//	
//	@RequestMapping("/getmomos")
//	public String getmomosmethod()
//	{
//	 return "bigburger";
//}
//
//	
//	@RequestMapping("/getspicymomos")
//	public String getspicymomosmethod(@RequestParam("value") String any)
//	{
//	 return obj1.momos(any);
//}
//	
//
//	@RequestMapping("/getfriedmomos")
//	public String getfriedmomosmethod(@RequestParam("value") String any, @RequestParam("id") String box)
//	{
//	 return "have momos" +any +box;
//}
//}
//	
//	
