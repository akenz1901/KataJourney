package chapterFour;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KataTest {
        public static void main(String... args) {
//            Kata kata = new Kata();
//            System.out.println("Check if it's Even " + kata.isEven(2));
//            System.out.println("Grade is " + kata.calculateGrade(4));
//            System.out.println("The average is " + kata.calculateAverage());
//            System.out.println("Is It Prime Number ? " + kata.isPrime(7));
//            System.out.println(Kata.copiesPrice());
//            System.out.println(kata.checkTheFactorsOfANumber());
//            System.out.println(kata.arithmeticNumbers(29,3));

            String [] names = {"Jide", "Mercy", "Ola", "Temio"};
            String [] reversed_names = new String[names.length];
             int count = 0;

            for(int i = names.length-1; i >= 0; i--){
                reversed_names[count] = names[i];
                count++;
            }
            System.out.println(Arrays.toString(reversed_names));

        }
    }