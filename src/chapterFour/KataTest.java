package chapterFour;

import java.net.SocketOption;

public class KataTest {
        public static void main(String... args) {
            Kata kata = new Kata();
            System.out.println("Check if it's Even " + kata.isEven(2));
            System.out.println("Grade is " + kata.calculateGrade(4));
            System.out.println("The average is " + kata.calculateAverage(0));
            System.out.println("Is It Prime Number ? " + kata.isPrime(7));
            System.out.println(kata.copiesPrice(0));

        }
    }