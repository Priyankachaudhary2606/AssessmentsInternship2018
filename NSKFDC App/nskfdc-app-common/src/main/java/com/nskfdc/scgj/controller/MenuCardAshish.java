//package com.nskfdc.scgj.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.nskfdc.scgj.service.ChefService;
//@RestController
//public class MenuCardAshish {
//	@Autowired
//	public ChefService chef;
//	
//	//without any request parametre
//	@RequestMapping("/giveMomos")
//	public String giveMomos(){
//		return ChefService.Momos();
//	}
//	
//	//with one request parametre
//     @RequestMapping("/giveFriedMomos")
//     public String giveFriedMomos(@RequestParam("comment") String Additionalcomment)
//     {
//    	 return ChefService.FriedMomos(Additionalcomment);
//    	 
//     }
//     
//     //with two request parametres
//     @RequestMapping("/givePaneerMomos")
//     public String givePaneerMomos(@RequestParam("comment1") String Additionalcomment1,
//    		 @RequestParam("comment2") String Additionalcomment2){
//      return ChefService.PaneerMomos(Additionalcomment1,Additionalcomment2);   	 
//    	 
//     }
// 
//}
