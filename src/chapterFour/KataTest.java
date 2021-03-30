package chapterFour;

public class KataTest {
        public static void main(String... args) {
            Kata kata = new Kata();
            System.out.println("Check if it's Even " + kata.isEven(2));
            System.out.println("Grade is " + kata.calculateGrade(4));
            System.out.println("The average is " + kata.calculateAverage());
            System.out.println("Is It Prime Number ? " + kata.isPrime(7));
            System.out.println(Kata.copiesPrice());
            System.out.println(kata.checkTheFactorsOfANumber());
            System.out.println(kata.arithmeticNumbers(29,3));

        }
    }