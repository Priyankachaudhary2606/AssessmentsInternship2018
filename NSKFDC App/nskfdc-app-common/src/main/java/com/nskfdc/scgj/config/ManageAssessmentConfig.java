package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="manageAssessment",locations="classpath:sql/manageAssessment.yml")
public class ManageAssessmentConfig {

	//write your code here
	
}
