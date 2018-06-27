package com.nskfdc.scgj.dto;

import com.nskfdc.scgj.common.BaseDto;

public class MannuLearnerDTO extends BaseDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String learnerId;
	private String learnerName;
	private String learningTitle;
	private String learningDescription;
	private String date;
	
	public String getLearnerId() {
		return learnerId;
	}
	public void setLearnerId(String learnerId) {
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
	public void setLearnerDescription(String learningDescription) {
		this.learningDescription = learningDescription;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public MannuLearnerDTO(String learnerId,String learnerName,String learningTitle,String learningDescription,String date)
	{
		super();
		this.learnerId = learnerId;
		this.learnerName = learnerName;
		this.learningTitle = learningTitle;
		this.learningDescription = learningDescription;
		this.date = date;
	}
	public MannuLearnerDTO()
	{
		super();
	}
	
}
