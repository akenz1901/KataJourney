package chapterFour;

import java.util.Scanner;

public class GuessGameNew {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        int checkNumber = 0;
        int guessNumber;
        int correctNumber = 30;

        System.out.println("Guess The Number: ");
        guessNumber = collector.nextInt();
        while (checkNumber < guessNumber) {
            System.out.println("Try Guess Again: ");
            guessNumber = collector.nextInt();
            if (guessNumber > correctNumber) {
                System.out.println("Ooops Try Again.... The correct Number is less than " + guessNumber);
                checkNumber++;
            } else {
                if (guessNumber < correctNumber) {
                    System.out.println("Ooops Try Again.... The correct Number is greater than " + guessNumber);
                }
            else{
                if (guessNumber == correctNumber) {
                    System.out.println("You Win");
                    break;
                }
            }
        }
        }
    }
}
