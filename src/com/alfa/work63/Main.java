package com.alfa.work63;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inString = scan.nextLine();
        System.out.println("Enter Number of World: ");
        int numberWorld = scan.nextInt();
        int idxCurWorld = 0;
        int idxNextWorld = 0;
        int curNumbWorld = 0;
        while ((idxNextWorld=inString.indexOf(' ',idxCurWorld))>0){
            if(++curNumbWorld == numberWorld) {
                System.out.println("First Symbol: "+inString.substring(idxCurWorld,idxNextWorld).charAt(0));
                return;
            }
            idxCurWorld=idxNextWorld+1;
        }
        if(++curNumbWorld == numberWorld) {
            System.out.println("First Symbol: "+inString.substring(idxCurWorld).charAt(0));
        }else{
            System.out.println("Incorrect Number of World: "+numberWorld);
        }
    }
}
