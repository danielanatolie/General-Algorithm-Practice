package com.danielanatolie;

/**
 * Created by DanLam on 9/5/16.
 */
public class LinkList {
    // Reference to first Link in list
    // The last link added to the LinkedList
    public Link firstLink;
    LinkList() {
        // Here to show the first Link always starts as null
        firstLink = null;
    }
    // Returns true if LinkList is empty
    public boolean isEmpty() {
        return(firstLink == null);
    }

    public void insertFirstLink(String bookName, int millionsSold) {
        Link newLink = new Link(millionsSold, bookName);
        // Connects the first link tp the new link
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public Link removeFirst() {
        Link linkReference = firstLink;
        if(!isEmpty()) {
            // Removes the link from the list
            firstLink = firstLink.next;
        } else {
            System.out.println("Empty linkedList");
        }

        return linkReference;
    }

    public void display() {
        Link theLink = firstLink;
        while(theLink != null) {
            System.out.println("Next Link: "+theLink.next);
            theLink = theLink.next;
            System.out.println();
        }
    }

    public Link find(String bookName) {
        Link theLink = firstLink;
      if(!isEmpty()) {
          while(theLink.bookName != bookName) {
              // Checks if at the end of the LinkedList
              if(theLink.next == null) {
                  return null;
              } else {
                  theLink = theLink.next;
              }
          }
      } else {
          System.out.println("Empty LinkedList");
      }
        return theLink;
    }

    public Link removeLink(String bookName) {
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        // Keep searching as long as a match isn't made
        while(currentLink.bookName != bookName) {
            // Check if at the last link in the LinkedList
            if(currentLink.next == null) {
                // bookName not found so leave the method
                return null;
            } else {
                // We checked here so let's look in the
                // next link on the list
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }

        if(currentLink == firstLink) {
            // A match was made instantly for the first link
            // we'll now remove this link since we can't
            // use previous to remove this special case like
            // in the else statement
            firstLink = firstLink.next;
        } else {
            //If you are here there was a match in a Link other
            // than the firstLink. Assign the value of next
            // for the Link you want to delete to the Link that's
            // next previously pointed to the reference to remove
            previousLink.next = currentLink.next;
        }

        return currentLink;
    }
}
