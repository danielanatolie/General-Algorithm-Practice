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

    public void printArray() {
        System.out.println("----------");
        for(int i=0; i<arraySize; i++) {
            System.out.print("| "+i+" | ");
            System.out.println(theArray[i]+" |");
            System.out.println("----------");
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

    // Bubble-sort: Sorts from smallest to largest
    // i starts at the end of the array
    // as it is decremented all indexes greater than it are sorted
    public void bubbleSort() {
        for(int i=arraySize-1; i>1; i--) {
            // The inner loop starts at the beginning of the array and
            // compares each value next to each other
            // If the value is greater than they are swapped
            for(int j=0; j<i; j++) {
                // Sort can be changed to descending by changing <
                if(theArray[j] > theArray[j+1]) {
                    swapValues(j, j+1);
                }
            }
        }
    }

    public void swapValues(int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }


    // Binary search requires a sorted list!
    // It cuts the list in halve, deleting the other half, and finally finds the value!
    public void binarySearchForValue(int value) {
        int lowIndex =0;
        int highIndex = arraySize-1;
        while(lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex)/2;
            if(theArray[middleIndex] < value) lowIndex = middleIndex +1;
            else if(theArray[middleIndex] > value) highIndex = middleIndex -1;
            else {
                System.out.println("\nFound a Match for "+value+" at Index "+middleIndex);
                lowIndex = highIndex+1; //Throws us out of the loop.
            }
        }
    }

    // Selection Sort: Finds the smallest number, placing it at the minimum spot
    // continues sorting through the entire array
    public void selectionSort() {
        for(int x=0; x<arraySize; x++) {
            int minimum =x;
            for(int y=x; y<arraySize; y++) {
                // To change direction of sort just change this from > to <
                if(theArray[minimum] > theArray[y]) {
                    minimum =y;
                }
            }
            swapValues(x, minimum);
        }
    }

    public void insertionSort() {
        for(int i =1; i<arraySize; i++) {
            int j=i;
            int toInsert = theArray[i];
            while((j>0) && (theArray[j-1] > toInsert)) {
                theArray[j] = theArray[j-1];
                j--;
            }
            theArray[j] = toInsert;
        }
    }
}


