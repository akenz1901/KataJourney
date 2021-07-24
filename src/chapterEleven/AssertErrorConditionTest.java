package chapterEleven;

import java.util.Scanner;

public class AssertErrorConditionTest {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 10: ");
        int number = ex.nextInt();

        assert (number >= 0 && number <= 10) : "bad number: " + number;

            System.out.printf("You enter %d%n", number);
    }
}
