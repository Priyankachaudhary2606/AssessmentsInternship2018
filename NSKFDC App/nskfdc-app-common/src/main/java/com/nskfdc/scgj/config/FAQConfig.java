package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="faq",locations="classpath:sql/faq.yml")
public class FAQConfig {

	//write your code here
	
}
