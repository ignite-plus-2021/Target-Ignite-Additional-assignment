package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.*;

import com.example.service.CommentService;

@RestController
@RequestMapping(value="/api/comment")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@GetMapping(value="{string}")
	@ResponseBody
	public entities checkComment(@PathVariable("string") String string) {
	
		return commentService.checkComment(string);
	}

}
