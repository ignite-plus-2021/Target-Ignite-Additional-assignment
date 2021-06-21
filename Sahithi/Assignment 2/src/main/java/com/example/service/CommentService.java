package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.entities;


@Component
public class CommentService {
	
	@Autowired
	entities e;
	
	List<String> list=new ArrayList<String>(Arrays.asList("shit","damn", "bad", "hate","fake", "waste"));
	
	public entities checkComment(String string) {
		 
		 String comment = string;
		String arr[] = comment.split(" ");

		 for (int i = 0; i < arr.length; i++) {
			 if(list.contains(arr[i])) {
				 e.setComment(comment);
				 e.setHasObjectionalWord(true);
				 e.setObjectionalWord(arr[i]); 
			 }
				 
		 }
		 
		 return e;
	 }

}
