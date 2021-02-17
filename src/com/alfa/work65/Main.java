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
        int curRow = 0;
        while (++curRow <= height) {
            int curNumber = 0;
            String leftString = "";
            String rightString = "";
            while (++curNumber < curRow) {
                leftString = leftString + curNumber;
                rightString = curNumber + rightString;
            }
            System.out.print(" ".repeat(height - curRow + 1) + leftString + curNumber + rightString + "\n");
        }
    }
}
