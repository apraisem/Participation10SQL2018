package com.example.ashley.participation10sql2018;



public class Comment {
    private long id;
    private String comment;

    //gets Comment ID
    public long getId() {
        return id;
    }
    //sets Comment ID
    public void setId(long id) {
        this.id = id;
    }

    //gets Comment
    public String getComment() {
        return comment;
    }

    //sets comment
    public void setComment(String comment) {
        this.comment = comment;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return comment;
    }
}

