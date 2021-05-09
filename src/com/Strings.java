package com;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        String initialise = "68573565 234";
        StringBuilder reversed = new StringBuilder(initialise.substring(initialise.length() - 3));

        reversed.append(") ");
        reversed.insert(0, "(+");

        int counter = 0;
        for (int count = reversed.length() - 5; count >= 0; count--) {

            if (counter % 3 == 0 & counter > 0) {
                counter = 0;
                reversed.append("-");
            }

            counter++;
            reversed.append(initialise.charAt(count));
        }

        System.out.print(reversed);

        Scanner take = new Scanner(System.in);


        System.out.println("Enter a word");
        String first = take.next();

        System.out.println("Enter a word");
        String second = take.next();

        System.out.println(comparison(first,second));

        }
    public static boolean comparison(String firstInput, String secondInput){

        return firstInput.regionMatches(0, secondInput, firstInput.length(), secondInput.length());

    }
    public static int compare(StringBuilder word){
        StringBuilder a = new StringBuilder(word);

        for(int i = a.length(); i > 0 ; i--){
            a.append(a.charAt(i));
        }
        return a.compareTo(word);
    }
     }
