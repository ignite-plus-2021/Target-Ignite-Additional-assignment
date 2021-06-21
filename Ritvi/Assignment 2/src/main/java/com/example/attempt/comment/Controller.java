package com.example.attempt.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    Comment comment;

    List<String> list=new ArrayList<String>(Arrays.asList("damn", "bloody", "badWords"));

//    @GetMapping(value="/api/comment/{string}")
    @RequestMapping(value="/api/comment/{string}", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Comment checkBadWords(@PathVariable("string") String commentReceived) {
        String checkStatement = commentReceived;
        String[] words = checkStatement.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(list.contains(words[i])) {
                comment.setComments(checkStatement);
                comment.setCheck(true);
                comment.setWord(words[i]);
            }
        }
        return comment;
    }
}
