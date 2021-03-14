package tdd;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner userInputCollector = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String prompt = """
                Hello User,
                Welcome to Unique Calculator.
                ->  Enter 1 for addition.
                ->  Enter 2 for absolute subtraction.
                ->  Enter 3 for multiplication.
                ->  Enter 4 for Division.
                """;
        System.out.println(prompt);
        int userInput = userInputCollector.nextInt();
        System.out.println("Enter First Number: ");
        int firstNumber = userInputCollector.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNumber = userInputCollector.nextInt();
        switch (userInput) {
            case 1 -> System.out.println(calculator.add(firstNumber, secondNumber));
            case 2 -> System.out.println(calculator.subtract(firstNumber, secondNumber));
            case 3 -> System.out.println(calculator.multiply(firstNumber, secondNumber));
            case 4 -> System.out.println(calculator.divide(firstNumber, secondNumber));
            default-> System.out.print("Oga choose something reasonable");
        }
        System.out.println(Calculator.randomMathematicalExpression());
    }
}
