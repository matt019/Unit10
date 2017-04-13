package com.example.matt.devogellaandroidsqlitefirst;

/**
 * Created by Matt on 4/13/17.
 */

public class Comment {
    private long id;
    private String comment;
    private String rating;

    public long getId() {
        return id;
    } //gets ID

    public void setId(long id) {
        this.id = id;
    } //sets ID

    public String getComment() {
        return comment;
    } //gets comment

    public String getString() {return rating;} //gets rating

    public void setComment(String comment) {
        this.comment = comment;
    } //sets comment

    public void setRating(String rating) {
        this.rating = comment;
    } //sets rating





    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        if ( id != R.id.rating ) {
            return comment;
        } else {
            return rating;
        }

    } //returns comment
}
