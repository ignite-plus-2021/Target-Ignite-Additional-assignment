package com.example.attempt.comment;

import org.springframework.beans.factory.annotation.Autowired;


public class Comment {

    private String comments;
    private Boolean check;
    private String Word;

    public Comment(String comments, Boolean check, String word) {
        this.comments = comments;
        this.check = check;
        Word = word;
    }

    public String getComments() {
        return comments;
    }

    public Boolean getCheck() {
        return check;
    }

    public String getWord() {
        return Word;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public void setWord(String word) {
        Word = word;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comments='" + comments + '\'' +
                ", check=" + check +
                ", Word='" + Word + '\'' +
                '}';
    }
}
