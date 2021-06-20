package com.malika.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.malika.entity.entitities;



@Component
public class myService {
	
	@Autowired
	entitities en ;
	
	//list of objectionable content
	List<String> list=new ArrayList<String>(Arrays.asList("Hate", "bad", "dirty", "worst", "damm", "low quality", "worst", "disappointed"));
	
	
	 
	public entitities checkComments(String string) {
		 
		
		 
		 String comment = string;
		 
		 String[] ary = comment.split(" ");
		 
		 
		 //checking if any objectionable words are present
		 
		 for (int i = 0; i < ary.length; i++) {
			 if(list.contains(ary[i])) {
				 
				 en.setComment(comment);
				 en.setHasobjectionalword(true);
				 en.setObjectionalWord(ary[i]);
				 
			 }
				 
		 }
		 
		 return en;
		 
		 
		 
	 }

}
