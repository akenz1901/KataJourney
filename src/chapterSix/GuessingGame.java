package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGame {
    SecureRandom random  = new SecureRandom();
    Scanner sc =  new Scanner(System.in);
    int number = 0;

    public String getNumber(){
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

    public String   getSpecificNumberOfCount(){
        int randomNumber = random.nextInt(1000);
        int counter = 0;
        while(number != randomNumber){
            boolean numberValidating = number > 0;

            System.out.print("Enter a number between 1 and 1000: ");
            number = sc.nextInt();
            System.out.println();

            if(number > randomNumber) {
                System.out.println("Too High! Try Again...\n");
                if (counter <= 10) {
                    System.out.println("You should be able to do better!\n");
                }
            }
            if (number < randomNumber) {
                System.out.println("Too Low! Try Again...\n");
                if (counter < 10) {
                    System.out.println("Either you know the secret or you got lucky!\n");
                }
            }
            else if(number == randomNumber ){
                if(counter < 10) {
                    System.out.println(" ha! You know the secret!");
                }
                System.out.println("Congratulations. You guessed the number!");
            }
            ++counter;
        }
        return "That was fantastic right ? \nThe initial number is " + randomNumber;

    }
}
