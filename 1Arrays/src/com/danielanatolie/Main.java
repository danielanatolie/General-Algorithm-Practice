package com.danielanatolie;

public class Main {

    public static void main(String[] args) {
        Arrays newArray = new Arrays();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println(newArray.getValueAtIndex(3));
        System.out.println(newArray.doesArrayContainThisValue(20));
        newArray.linearSearch(10);
    }
}
