package com.danielanatolie;

/**
 * Created by DanLam on 9/2/16.
 */
public class Arrays {
    private int[] theArray = new int[50]; // Creates an array with 50 indexes
    private int arraySize = 10; // Elements in theArray

    // Fill the array with random values
    public void generateRandomArray() {
        for(int i=0; i<arraySize; i++) {
            // Random number 10 through 19
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public int getValueAtIndex(int index) {
        if(index < arraySize) return theArray[index];
        return 0;
    }

    public boolean doesArrayContainThisValue(int value) {
        boolean valueInArray = false;
        for(int i=0; i<arraySize; i++) {
            if(theArray[i]==value)
                valueInArray = true;
        }

        return valueInArray;
    }

    public void deleteIndex(int index) {

        if(index<arraySize) {
            for (int i = index; i < (arraySize-1); i++) {
                theArray[i] = theArray[i+1];
              }
            arraySize--;
        }
    }

    public void insertValue(int value) {
        if(arraySize <50) {
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    public String linearSearch(int value) {
        boolean valueInArray=false;
        String indexWithValue = "";
        System.out.print("The value was Found in the following: ");
        for(int i=0; i<arraySize; i++) {
            if(theArray[i] ==value) {
                valueInArray = true;
                System.out.println(i+" ");
                indexWithValue+= i +" ";
            }
        }
        if(!valueInArray) {
            indexWithValue = "None";
            System.out.print(indexWithValue);
        }
        System.out.println();
        return indexWithValue;
    }

    public void printArray() {
        System.out.println("----------");
        for(int i=0; i<arraySize; i++) {
            System.out.print("| "+i+" | ");
            System.out.println(theArray[i]+" |");
            System.out.println("----------");
        }
    }


}
