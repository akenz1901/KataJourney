package com.stringAndCharacterPractice;
import java.util.Scanner;

public class CharOtherMethods {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a radix:");
            int radix = scanner.nextInt();
            System.out.printf("Please choose one:%n1 -- %s%n2 -- %s%n", "Convert digit to character", "Convert character to digit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter a digit:");
                    int digit = scanner.nextInt();
                    System.out.printf("Convert digit to character: %s%n", Character.forDigit(radix, digit));
                }
                case 2 -> { // convert character to digit
                    System.out.println("Enter a character:");
                    char character = scanner.next().charAt(0);
                    System.out.printf("Convert character to digit: %s%n", Character.digit(radix, character));
                }
            }

            Character char1 = 'A';
            Character char2 = 'a';

            System.out.printf("c1 = %s%nc2 = %s%n%n", char1.charValue(), char2.toString());
            if (char1.equals(char2))
                System.out.println("c1 and c2 are equal%n");
            else
                System.out.println("c1 and c2 are not equal%n");
        }

}
