package com.nskfdc.scgj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import com.nskfdc.scgj.service.demoservice;

@RestController
public class democontroller1 {
	@Autowired
	public demoservice demoservice1;
	@RequestMapping("/getmomos")
		public String getMypaneer()
			{
				return "My Momos";
			}
	@RequestMapping("/getroll")
		public String offerRoll(@RequestParam("comment1") String additionalcomment1, @RequestParam("comment2") String additionalcomment2)
		{ 
		return demoservice.getMypaneer(additionalcomment1,additionalcomment2);
		}

}
