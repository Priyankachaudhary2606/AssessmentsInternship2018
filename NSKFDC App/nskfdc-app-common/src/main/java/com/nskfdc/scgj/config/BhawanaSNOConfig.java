package com.nskfdc.scgj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="snoQuery",locations="classpath:sql/BhawanaSNO.yml")
public class BhawanaSNOConfig {

	

	public String getShowSpecifiedNetworkOpreatorDetail() {
		return showSpecifiedNetworkOpreatorDetail;
	}

	public void setShowSpecifiedNetworkOpreatorDetail(String showSpecifiedNetworkOpreatorDetail) {
		this.showSpecifiedNetworkOpreatorDetail = showSpecifiedNetworkOpreatorDetail;
	}

	private String showSpecifiedNetworkOpreatorDetail;
	

}
