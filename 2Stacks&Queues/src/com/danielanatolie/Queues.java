package com.danielanatolie;

import java.util.Arrays;

/**
 * Created by DanLam on 9/3/16.
 */
public class Queues {
    private String[] queueArray;
    private int queueSize;
    private int front, numberOfItems, rear =0; //Stack is set to empty
    Queues(int size) {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    public void insert(String input) {
        if(numberOfItems+1 <+ queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
        } else {
            System.out.println("Sorry, queue is full.");
        }
    }

    // This priority insert wil add items in order from high to low
    public void priorityInsert(String input) {
        int i;
        if(numberOfItems ==0) {
            insert(input);
        } else {
            for(i = numberOfItems-1; i >=0; i--) {
                if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
                    queueArray[i+1] = queueArray[i];
                } else break; // Done shifting items in queue
            }
            queueArray[i+1] = input;
            rear++;
            numberOfItems++;
        }
    }

    public void remove() {
        if(numberOfItems >0) {
            queueArray[front] ="-1";
            front++;
            numberOfItems--;
        } else {
            System.out.println("Sorry but queue is empty");
        }
    }

    public void peek() {
        System.out.println("The first element is: "+queueArray[front]);
    }



}
