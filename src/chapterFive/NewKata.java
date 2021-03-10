package chapterFive;

import java.util.Scanner;

public class NewKata {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        int checkNumber = 1;
        int less = 0;
        int higher = 0;
        while(checkNumber <= 5){
            System.out.print("Enter Number: ");
            int number = collector.nextInt();
            if(checkNumber == 1) {
                less = number;
                higher= number;
            }
            if(number > higher){
                higher = number;
            }
            if(number < less)
                less = number;
            checkNumber++;
            }

        System.out.println("The greater number is " + higher);
        System.out.println("The lesser number is " + less);
        }
    }