package com.nskfdc.scgj.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SarthakLearnerController  {
	
	@Autowired
	public static SarthakLearnerController sarthakLearnerService;
	
	@RequestMapping(/getSarthakLearnerDetails)
	public Collection<SarthakLearnerDTO> (){
		try{
			return sarthakLearnerService.getSarthakLearnerDetail();
		}
		
	}
}
