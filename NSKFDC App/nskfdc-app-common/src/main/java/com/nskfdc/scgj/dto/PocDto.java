package com.nskfdc.scgj.dto;

import com.nskfdc.scgj.common.BaseDto;

public class PocDto extends BaseDto{
	
	private String trainingPartnerId;
	private String trainingPartnerName;
	private String tpAddress;
	private String tpContact;
	private String tpEmail;
	public String getTrainingPartnerId() {
		return trainingPartnerId;
	}
	public void setTrainingPartnerId(String trainingPartnerId) {
		this.trainingPartnerId = trainingPartnerId;
	}
	public String getTrainingPartnerName() {
		return trainingPartnerName;
	}
	public void setTrainingPartnerName(String trainingPartnerName) {
		this.trainingPartnerName = trainingPartnerName;
	}
	public String getTpAddress() {
		return tpAddress;
	}
	public void setTpAddress(String tpAddress) {
		this.tpAddress = tpAddress;
	}
	public String getTpContact() {
		return tpContact;
	}
	public void setTpContact(String tpContact) {
		this.tpContact = tpContact;
	}
	public String getTpEmail() {
		return tpEmail;
	}
	public void setTpEmail(String tpEmail) {
		this.tpEmail = tpEmail;
	}
	
	/*------CONSTRUCTOR-------------*/
	
	public PocDto(String trainingPartnerId, String trainingPartnerName, String tpAddress, String tpContact,
			String tpEmail) {
		super();
		this.trainingPartnerId = trainingPartnerId;
		this.trainingPartnerName = trainingPartnerName;
		this.tpAddress = tpAddress;
		this.tpContact = tpContact;
		this.tpEmail = tpEmail;
	}
	
	
	public PocDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
