//package com.nskfdc.scgj.controller;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class MomosSubhadraController {
//	
//	@RequestMapping("/getmomos")
//	public String getMomosMethod()
//	{
//		return "spicy momos";
//	}
//	
//	@RequestMapping("/getspicymomos")
//	public String getSpicyMomos(@RequestParam("topping") String suggestedTopping )
//	{
//		return "Subhadra momos"+suggestedTopping;
//		
//	}
//	@RequestMapping("/getfriedspicymomos")
//	public String getFriedSpicyMomos(@RequestParam("topping") String suggestedTopping, @RequestParam("type") String fried)
//	{
//		return "Subhadra momos"+suggestedTopping+fried;
//		
//	}
//
//}
