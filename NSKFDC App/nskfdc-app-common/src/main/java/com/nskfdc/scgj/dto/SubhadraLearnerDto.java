package com.nskfdc.scgj.dto;

import java.util.Date;

import com.nskfdc.scgj.common.BaseDto;

public class SubhadraLearnerDto extends BaseDto {
	
	private Integer learnerId;
	private String learnerName;
	private String learningTitle;
	private String learningDescription;
	private String date;
	
	public int getLearnerId() {
		return learnerId;
	}
	
	public String getLearnerName() {
		return learnerName;
	}
	
	public String getLearningTitle() {
		return learningTitle;
	}
	
	public String getLearningDescription() {
		return learningDescription;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setLearnerId(int learnerId) {
		this.learnerId = learnerId;
	}
	
	public void setLearnerName(String learnerName) {
		this.learnerName = learnerName;
	}
	
	public void setLearningTitle(String learningTitle) {
		this.learningTitle = learningTitle;
	}
	
	public void setLearningDescription(String learningDescription) {
		this.learningDescription = learningDescription;
	}
	
	public void setDate(String date) {
		this.date = date;
	}

	public SubhadraLearnerDto(int learnerId, String learnerName,String learningTitle, String learningDescription, String date) {
		super();
		this.learnerId = learnerId;
		this.learnerName = learnerName;
		this.learningTitle = learningTitle;
		this.learningDescription = learningDescription;
		this.date = date;
	}

	public SubhadraLearnerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}