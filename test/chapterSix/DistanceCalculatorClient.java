package chapterSix;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.SortedMap;

public class DistanceCalculatorClient {

    @Test
    void distanceValuesCanBeCalculated(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = DistanceCalculator.distance(6,5,3, 6);

        System.out.println("Enter the distance of the numbers above: ");
        double take = sc.nextInt();

        if(take == input) {
            System.out.println("Correct. Your Mathematical Skills is good ");
            System.out.println("Distance is " + input);
        }
        else
            System.out.println("Oops Wrong answer! ");
            System.out.println("Distance is " + input);
    }
}
