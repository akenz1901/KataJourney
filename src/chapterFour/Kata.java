package chapterFour;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Kata {
    Scanner collector = new Scanner(System.in);

    public double calculateAverage(int average) {
        average = 0;
        int number;
        int allAveragenumber = 0;
        while (allAveragenumber < 3) {
            System.out.print("Enter number: ");
            number = collector.nextInt();
            average = average + number;
            allAveragenumber++;
        }
        //double average = (firstNumber + secondNumber + thirdNumber) / 3;
        return average / 3.0;
    }

    public String calculateGrade(int grade) {
        if (grade > 100)
            return "Invalid Score";
        if (grade >= 90)
            return "A";
        else if (grade >= 80)
            return "B";
        else if (grade >= 70)
            return "C";
        else
            return "F";
    }

    public boolean isEven(int isItEven) {
        if (isItEven % 2 == 0)
            return true;
        else
            return false;
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
    public double copiesPrice(int price){
        Scanner collector = new Scanner(System.in);
        if(price < 0){
            return price;
        }
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
        int chairmanInput = collector.nextInt();
        switch (chairmanInput) {
            case 1 -> System.out.print("Price for your cart is " + (1500 * 1.0));
            case 2 -> System.out.print("Price for your cart is " + ((1500 - 100) * 1.0));
            case 3 -> System.out.print("Price for your cart is " + ((1500 - 200) * 1.0));
            case 4 -> System.out.print("Price for your cart is " + ((1500 - 300) * 1.0));
            case 5 -> System.out.print("Price for your cart is " + ((1500 - 400) * 1.0));
            case 6 -> System.out.print("Price for your cart is " + ((1500 - 500) * 1.0));
            case 7 -> System.out.print("Price for your cart is " + ((1500 - 600) * 1.0));
            default -> System.out.print("Oga behave na");
        }
        return price = chairmanInput;
    }
}

