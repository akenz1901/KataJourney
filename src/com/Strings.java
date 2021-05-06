package com;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

//        String initialise = "68573565 234";
//        StringBuilder reversed = new StringBuilder(initialise.substring(initialise.length() - 3));
//
//        reversed.append(") ");
//        reversed.insert(0, "(+");
//
//        int counter = 0;
//        for (int count = reversed.length() - 5; count >= 0; count--) {
//
//            if (counter % 3 == 0 & counter > 0) {
//                counter = 0;
//                reversed.append("-");
//            }
//
//            counter++;
//            reversed.append(initialise.charAt(count));
//        }
//
//        System.out.print(reversed);

        Scanner take = new Scanner(System.in);

        System.out.println("Enter A String Word: ");
        String input = take.next();

        StringBuilder ket = new StringBuilder(input);

        StringBuilder b = ket.reverse();

        if(b == ket){
            System.out.println("it's Palidrome");
        }


    }
}
