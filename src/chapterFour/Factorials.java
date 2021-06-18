package chapterFour;

import java.util.Arrays;

public class Factorials {

    void factorialNumbers(int number){
        for (int i = number-1; i > 0 ; i--) {
                number *= i;
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        Factorials factor = new Factorials();
        factor.factorialNumbers(4);
    }
}
