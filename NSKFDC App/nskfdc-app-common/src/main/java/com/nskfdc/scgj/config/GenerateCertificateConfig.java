package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="generateCertificate",locations="classpath:sql/generateCertificate.yml")
public class GenerateCertificateConfig {

	//write your code here
	
}
