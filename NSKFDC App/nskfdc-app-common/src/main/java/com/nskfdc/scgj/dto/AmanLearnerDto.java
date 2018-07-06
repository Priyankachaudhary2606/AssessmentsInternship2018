package com.nskfdc.scgj.dto;

public class AmanLearnerDto {
	private int id;
	private String learnerName;
	private String learningTitle;
	private String learningDescription;
	private String date;
public AmanLearnerDto(int id, String learnerName, String learningTitle,
			String learningDescription, String date) {
		super();
		this.id = id;
		this.learnerName = learnerName;
		this.learningTitle = learningTitle;
		this.learningDescription = learningDescription;
		this.date = date;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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

}
