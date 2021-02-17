package com.alfa.work65;

public class Main {
    public static void main(String[] args) {
        printPyramid(9);
    }
    public static void printPyramid(int height) {
        if (height < 1 || height > 9) {
            System.out.println("Incorrect parameter:" + height);
            return;
        }
        int curHeight = 0;
        while (++curHeight <= height) {
            int curNumber = 0;
            String outString = "";
            String reverseString = "";
            while (++curNumber < curHeight) {
                outString = outString + curNumber;
                reverseString = curNumber + reverseString;
            }
            System.out.print(" ".repeat(height - curHeight + 1) + outString + curNumber + reverseString + "\n");
        }
    }
}
