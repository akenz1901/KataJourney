package chapterFour;

import java.util.Scanner;


public class Kata {
    enum GRADE {PASSED, FAILED, BEG_TO_PASS,INVALID}
    Scanner collector = new Scanner(System.in);

    public double calculateAverage() {
        int average = 0;
        int number;
        int allAverageNumber = 0;
        while (allAverageNumber < 3) {
            System.out.print("Enter number: ");
            number = collector.nextInt();
            average = average + number;
            allAverageNumber++;
        }
        return average / 3.0;
    }

    public GRADE calculateGrade(int grade) {
        if (grade > 100)
            return GRADE.INVALID;
        if (grade >= 90)
            return GRADE.PASSED;
        else if (grade >= 80)
            return GRADE.PASSED;
        else if (grade >= 70)
            return GRADE.BEG_TO_PASS;
        else
            return GRADE.FAILED;
    }

    public boolean isEven(int isItEven) {
        return isItEven % 2 == 0;
    }

    public boolean isPrime(int number) {
        int numberCounter = 2;
        while (numberCounter < number) {
            if(number % numberCounter == 0){
                return false;
            }
            numberCounter++;
        }
        return true;
    }
    public static double copiesPrice(){
        Scanner collector = new Scanner(System.in);
        int userInput;
        String newPriceList = """
                How Many Copies do you want to buy?
                
                Select 1 for 1-4 Copies Price
                Select 2 for 5-9 copies Price
                select 3 for 10-29 copies Price
                Select 4 for 30-49 copies Price
                select 5 for 50-99 copies Price
                Select 6 for 100-199 copies Price
                Select 7 for 200 Above copies Price
                """;
        System.out.println(newPriceList);
        userInput = collector.nextInt();
        switch (userInput) {
            case 1 -> System.out.print("Price for your cart is " + (1500 * 1.0));
            case 2 -> System.out.print("Price for your cart is " + ((1500 - 100) * 1.0));
            case 3 -> System.out.print("Price for your cart is " + ((1500 - 200) * 1.0));
            case 4 -> System.out.print("Price for your cart is " + ((1500 - 300) * 1.0));
            case 5 -> System.out.print("Price for your cart is " + ((1500 - 400) * 1.0));
            case 6 -> System.out.print("Price for your cart is " + ((1500 - 500) * 1.0));
            case 7 -> System.out.print("Price for your cart is " + ((1500 - 600) * 1.0));
            default -> System.out.print("Oga behave na");
        }
        return userInput;
    }
    public boolean checkTheFactorsOfANumber(){
        System.out.print("Enter a number: ");
        int number = collector.nextInt();
        int factorNumber = 2;
        while(factorNumber<number){
            if(number % factorNumber == 0 ) {
                System.out.println("The Number Of factor are " + factorNumber);
            }
            factorNumber++;
        }
        if(number % factorNumber != 0 )
            System.out.println("The Number Of factor are " + factorNumber);
        return false;
    }
    public String arithmeticNumbers(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        System.out.println(sum+ " is the sum of " + firstNumber + " and " + secondNumber);
        int subtraction = firstNumber - secondNumber;
        System.out.println(subtraction+ " is the subtraction of " + firstNumber + " and " + secondNumber);
        int difference = firstNumber * secondNumber;
        System.out.println(difference+ " is the difference between " + firstNumber + " and " + secondNumber);
        int quotient = firstNumber/secondNumber;
        return quotient * 1.0 + " is the quotient of" + firstNumber + " and " + secondNumber;


    }


}