package com.example.matt.devogellaandroidsqlitefirst;

/**
 * Created by Matt on 4/13/17.
 */

public class Comment {
    private long id;
    private String comment;

    public long getId() {
        return id;
    } //gets ID

    public void setId(long id) {
        this.id = id;
    } //sets ID

    public String getComment() {
        return comment;
    } //gets comment

    public void setComment(String comment) {
        this.comment = comment;
    } //sets comment


    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return comment;
    } //returns comment
}
