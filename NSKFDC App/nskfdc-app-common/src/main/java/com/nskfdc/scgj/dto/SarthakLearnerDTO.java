package com.nskfdc.scgj.dto;

import com.nskfdc.scgj.common.BaseDto;

	public class SarthakLearnerDTO extends BaseDto{
		
		private int LearnerId;
		private String LearnerName;
		private String LearningTitle;
		private String LearningDescription;
		private String date; //SHOULD BE DATE
		
		public int getLearnerId() {
			return LearnerId;
		}
		public void setLearnerId(int learnerId) {
			this.LearnerId = learnerId;
		}
		public String getLearningTitle() {
			return LearningTitle;
		}
		public void setLearningTitle(String LearningTitle) {
			this.LearningTitle = LearningTitle;
		}
		public String getLearnerName() {
			return LearnerName;
		}
		public void setLearnerName(String learnerName) {
			this.LearnerName = learnerName;
		}
		public String getLearningDescription() {
			return LearningDescription;
		}
		public void setLearningDescription(String LearningDescription) {
			this.LearningDescription = LearningDescription;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		
		public SarthakLearnerDTO(int LearnerId,String LearnerName,String LearningTitle,String LearningDescription,String date){
			this.LearnerId = LearnerId;
			this.LearningTitle = LearningTitle;
			this.LearnerName = LearnerName;
			this.LearningDescription = LearningDescription;
			this.date = date;
		}
		
}
