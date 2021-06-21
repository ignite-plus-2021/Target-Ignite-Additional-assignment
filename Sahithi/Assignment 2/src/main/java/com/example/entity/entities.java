package com.example.entity;

import org.springframework.stereotype.Component;

@Component
public class entities {
	
            	private String comment;
		private Boolean hasObjectionalWord ;
		private String objectionalWord ;
	
		public entities() {
		
		}

		public entities(String comment, Boolean hasObjectionalWord, String objectionalWord) {
			
			this.comment = comment;
			this.hasObjectionalWord = hasObjectionalWord;
			this.objectionalWord = objectionalWord;
			
		}
		

		public String getComment() {
			return comment;
		}



		public void setComment(String comment) {
			this.comment = comment;
		}



		public Boolean getHasObjectionalWord() {
			return hasObjectionalWord;
		}



		public void setHasObjectionalWord(Boolean hasObjectionalWord) {
			this.hasObjectionalWord = hasobjectionalword;
		}





		public String getObjectionalWord() {
			return objectionalWord;
		}



		public void setObjectionalWord(String objectionalWord) {
			this.objectionalWord = objectionalWord;
		}



		@Override
		public String toString() {
			return "{\"comment\":" + comment + ",\" hasObjectionalWord\":" + hasObjectionalWord+ ", \"objectionalWord \":" + objectionalWord + "}";
		}

}
