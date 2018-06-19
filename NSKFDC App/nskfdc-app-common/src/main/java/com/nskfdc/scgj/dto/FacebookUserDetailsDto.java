package com.nskfdc.scgj.dto;

public class FacebookUserDetailsDto {
	
	private String username;
	private String course;
	private String age;
	private String college;
	
	
	public FacebookUserDetailsDto(String username, String course, String age, String college) {
		super();
		this.username = username;
		this.course = course;
		this.age = age;
		this.college = college;
	}


	public String getUsername() {
		return username;
	}


	public String getCourse() {
		return course;
	}


	public String getAge() {
		return age;
	}


	public String getCollege() {
		return college;
	}
	
}
