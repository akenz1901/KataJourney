package tipCalculator;

import java.util.Scanner;

public class TipCalculatorApplication {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        TipCalculator tipCalculator = new TipCalculator();

        System.out.print("Enter amount: ");

        double enteredAmount = input.nextDouble();

        tipCalculator.setAmount(enteredAmount);

        final int press18PerButton = 18;
        final int press20PerButton = 20;

        String displayedMessage = String.format("""
                    How many percentage do you want to calculate %.2f with?
                    Enter one of the followings:
                    
                    1. 18
                    2. 20
                """, enteredAmount);
        System.out.println(displayedMessage);

        int pressButton = input.nextInt();
        switch (pressButton){
            case press18PerButton -> System.out.println(tipCalculator.calculateAmountWith18Per());
            case press20PerButton -> System.out.println(tipCalculator.calculateAmountWith20Per());
            default->  System.out.println("Kindly enter one of the given options");
        }

    }
}
