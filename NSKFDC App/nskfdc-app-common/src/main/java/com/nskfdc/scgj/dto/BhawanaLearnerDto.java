package com.nskfdc.scgj.dto;

import com.nskfdc.scgj.common.BaseDto;

public class BhawanaLearnerDto extends BaseDto {
	
	private Integer learnerId;
	private String learnerName;
	private String learningTitle;
	private String learningDescription;
	private String date;
	
	public Integer getLearnerId() {
		return learnerId;
	}
	
	public void setLearnerId(Integer learnerId) {
		this.learnerId = learnerId;
	}
	
	public String getLearnerName() {
		return learnerName;
	}
	
	public void setLearnerName(String learnerName) {
		this.learnerName = learnerName;
	}
	
	public String getLearningTitle() {
		return learningTitle;
	}
	
	public void setLearningTitle(String learningTitle) {
		this.learningTitle = learningTitle;
	}
	
	public String getLearningDescription() {
		return learningDescription;
	}
	
	public void setLearningDescription(String learningDescription) {
		this.learningDescription = learningDescription;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}

	
	
	
		/*------CONSTRUCTOR-------------*/
	
	
	public BhawanaLearnerDto(Integer learnerId, String learnerName,String learningTitle, String learningDescription, String date) {
		super();
		this.learnerId = learnerId;
		this.learnerName = learnerName;
		this.learningTitle = learningTitle;
		this.learningDescription = learningDescription;
		this.date = date;
	}

	
	
	/*------CONSTRUCTOR OF BASE DTO CLASS-------------*/
	
	

	public BhawanaLearnerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
