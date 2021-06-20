package com.malika.entity;

import org.springframework.stereotype.Component;

@Component
public class entitities {
	

		
		private String comment;
		private Boolean hasobjectionalword ;
		private String objectionalWord ;
	
		
		public entitities(String comment, Boolean hasobjectionalword, String objectionalWord) {
			
			this.comment = comment;
			this.hasobjectionalword = hasobjectionalword;
			this.objectionalWord = objectionalWord;
			
		}
		

		public entitities() {
			// TODO Auto-generated constructor stub
		}
		

		public String getComment() {
			return comment;
		}



		public void setComment(String comment) {
			this.comment = comment;
		}



		public Boolean getHasobjectionalword() {
			return hasobjectionalword;
		}



		public void setHasobjectionalword(Boolean hasobjectionalword) {
			this.hasobjectionalword = hasobjectionalword;
		}





		public String getObjectionalWord() {
			return objectionalWord;
		}



		public void setObjectionalWord(String objectionalWord) {
			this.objectionalWord = objectionalWord;
		}



		@Override
		public String toString() {
			return "{\"comment\":" + comment + ",\" hasobjectionalword\":" + hasobjectionalword+ ", \"objectionalWord \":" + objectionalWord + "}";
		}

}
