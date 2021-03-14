package tdd;

import java.util.Scanner;

public class Calculator {


    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(int numerator, int denominator) {
        if(denominator== 0){
            return 0;
        }
        return numerator/(denominator * 1.0);
    }

    public int subtract(int firstNumber, int secondNumber) {
        if(secondNumber>firstNumber){
            return secondNumber-firstNumber;
        }
        return firstNumber-secondNumber;

    }
    public static String randomMathematicalExpression(){
        Scanner collector = new Scanner(System.in);
        int score = 0;
        int firstNumber = (int) (Math.random() * 10);
        int secondNumber = (int) (Math.random() * 20);
        System.out.println("What is " + firstNumber +"+"+ secondNumber);
        System.out.println("Enter Answer");
        int userInput = collector.nextByte();
        if (firstNumber + secondNumber == userInput)
            System.out.println("Correct Answer");
        score = score +1;
        if(firstNumber + secondNumber != userInput) {
            System.out.println("Wrong Answer");
            score = 0;
        }
        firstNumber = (int) (Math.random() * 20);
        secondNumber = (int) (Math.random() * 10);
        System.out.println("What is " + firstNumber +"-"+ secondNumber);
        System.out.println("Enter Answer");
        userInput = collector.nextByte();
        if (firstNumber - secondNumber == userInput)
            System.out.println("Correct Answer");
        score = score +1;

        if(firstNumber - secondNumber != userInput) {
            System.out.println("Wrong Answer");
            score = score - 1;
        }
        firstNumber = (int) (Math.random() * 10);
        secondNumber = (int) (Math.random() * 10);
        System.out.println("What is " + firstNumber +" * "+ secondNumber);
        System.out.println("Enter Answer");
        userInput = collector.nextByte();
        if (firstNumber * secondNumber == userInput)
            System.out.println("Correct Answer");
        score = score +1;

        if(firstNumber * secondNumber != userInput) {
            System.out.println("Wrong Answer");
            score = score - 1;
        }
        float firstDivisionNumber = (int) (Math.random() * 500);
        float secondDivisionNumber = (int) (Math.random() * 10);
        System.out.println("What is " + firstDivisionNumber +"/"+ secondDivisionNumber);
        System.out.println("Enter Answer");
        userInput = collector.nextByte();
        float divisionOfTheNumber = firstDivisionNumber / secondDivisionNumber;
        if (divisionOfTheNumber == userInput)
            System.out.println("Correct Answer");
        score = score +2;

        if(firstDivisionNumber / secondDivisionNumber != userInput) {
            System.out.println("Wrong Answer!!\nCorrect Answer is " + divisionOfTheNumber);
            score = score - 1;
        }
        String pointComment = "Your Point Is ";
        return pointComment + score;
    }

    }
//    public int calculatingUserAge(int dateOfBirth){
//        return
//    }