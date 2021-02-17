package com.alfa.work64;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scan.nextInt();
        System.out.println("BinaryNumber: " + convertDecimalToBinary(number));
    }
    public static String convertDecimalToBinary (int number){
        if(number < 0) {
            return "Incorrect Number";
        }
        int curBit;
        String outString = "";
        while(number != 0) {
            curBit = number % 2;
            outString = curBit + outString;
            number = number / 2;
        }
        int countZerro = 32 - outString.length();
        outString = "0".repeat(countZerro) + outString;
        return outString;
    }
}
