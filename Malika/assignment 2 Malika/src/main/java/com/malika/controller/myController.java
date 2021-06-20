package com.malika.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.malika.entity.*;

import com.malika.service.myService;

@RestController
@RequestMapping(value="/api/comment")
public class myController {
	
	@Autowired
	myService myservice;
	
	@GetMapping(value="{string}")
	@ResponseBody
	public entitities checkComments(@PathVariable("string") String string) {
		
		
		return myservice.checkComments(string);
	}

}
