package com.danielanatolie;

/**
 * Created by DanLam on 9/5/16.
 */
public class Link {
    //Set to public so getters and setters aren't needed
    public String bookName;
    public int millionsSold;

    // Reference to next linke made in the Linkedlist
    // Holds the reference to the Link that was created before it
    // Set to null until it is connected to other links
    public Link next;

    public Link(int millionsSold, String bookName) {
        this.millionsSold = millionsSold;
        this.bookName = bookName;
    }

    public void display() {
        System.out.println(bookName+": "+millionsSold+",000,000 Sold");
    }

    public String getBookName() {
        return bookName;
    }
}
