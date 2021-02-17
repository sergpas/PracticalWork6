package com.alfa.work65;

public class Main {
    public static void main(String[] args) {
        printPyramid(9);
    }

    public static void printPyramid (int height){
        int curHeight = 0;
        int maxHeight = height;
        while(++curHeight <= height+1){
            String reverseString="";
            String outString="";
            System.out.println();
            int curRow=0;
            while (++curRow <= maxHeight){      //Рисуем отступы в начале каждой строки
                System.out.print(' ');
            }
            maxHeight--;
            curRow=0;
            while(++curRow < curHeight){
                outString = outString+ curRow;
                if(curRow < curHeight - 1){
                    reverseString = curRow + reverseString;
                }
            }
            System.out.print(outString + reverseString);
        }
    }
}
