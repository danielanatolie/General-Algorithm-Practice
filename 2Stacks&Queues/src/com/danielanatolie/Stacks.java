package com.danielanatolie;

import java.util.Arrays;

/**
 * Created by DanLam on 9/3/16.
 */
public class Stacks {

    private String[] stackArray;
    private int stackSize;

    private int topOfStack = -1; // Stack is empty

    Stacks(int size) {
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1"); //-1 means that item is unavailable (empty)
    }

    // Pushing item on-top of stack:
    public void push(String input) {
        //Make sure you have enough room in your stack:
        if(topOfStack+1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else System.out.println("Sorry, stack is full");

        System.out.println("PUSH "+input+" was added to the Stack\n");
    }

    // Popping item off of stack:
    public String pop() {
        if(topOfStack >=0) {
            stackArray[topOfStack] = "-1";
            return stackArray[topOfStack--];
        } else {
            System.out.println("Sorry, stack is empty.");
            return "-1";
        }
    }

    // Peaking at the item on the top of the stack:
    public String peak() {
        return stackArray[topOfStack];
    }

    public void pushMany(String multipleValues) {
        String[] tempString = multipleValues.split(" "); // Split string by space and put it into the array
        for(int i=0; i<tempString.length; i++) {
            push(tempString[i]);
        }
    }

    public void popAll() {
        for(int i=topOfStack; i>=0; i--) {
            pop();
        }
    }

}
