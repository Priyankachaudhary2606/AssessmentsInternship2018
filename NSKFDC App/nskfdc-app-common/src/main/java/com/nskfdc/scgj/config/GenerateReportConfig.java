package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="generateReport",locations="classpath:sql/generateReport.yml")
public class GenerateReportConfig {

	//write your code here
	
}
