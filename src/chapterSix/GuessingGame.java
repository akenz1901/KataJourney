package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {

    public static String getNumber(){
        int number = 0;
        SecureRandom random = new SecureRandom();
        Scanner sc =  new Scanner(System.in);
        int randomNumber = random.nextInt(1000);
        int restartOrEnd;
        String restartGameQuestion = """
                Do you want to play Again ?
                Press 1 to play Again
                Press 2 to end the game""";

        while(number != randomNumber){
            boolean numberValidating = number > 0;

            System.out.print("Enter a number between 1 and 1000: ");
            number = sc.nextInt();
            if(number < randomNumber){
                System.out.println("Too Low. Try Again");
            }
            else if (number > randomNumber){
                System.out.println("Too High. Try Again");
            }
            else if (numberValidating && number==randomNumber){
                System.out.println("Congratulations. You Guess the number");

                System.out.println(restartGameQuestion);
                restartOrEnd = sc.nextInt();
                switch (restartOrEnd) {
                    case 1:
                        number = 0;
                        randomNumber = random.nextInt(1000);
                        break;
                    case 2:
                        number = randomNumber;
                        break;
                }
            }
        }
        return "Congrats once more \nThe initial number is " + randomNumber;
    }
}
