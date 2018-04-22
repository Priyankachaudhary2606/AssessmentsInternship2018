package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="dashboard",locations="classpath:sql/dashboard.yml")
public class DashboardConfig {

	//Write your code here
	
}
