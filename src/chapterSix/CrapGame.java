package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapGame {

    private double wager;
    private final SecureRandom randomNumber = new SecureRandom();

    int counter = randomNumber.nextInt(5);

    Scanner sc = new Scanner(System.in);
    private double bankBalance;

    public CrapGame(){
        bankBalance = 1000;
    }

    public void gameSetting(int guess){
        final int SEVEN = 7;
        final int YO_SEVEN = 11;
        final int SNAKE_EYES = 2;
        final int TREY = 3;
        final int BOX_CARS = 12;
        Status gameStatus;

         switch (guess) {
            case SEVEN, YO_SEVEN -> {
                gameStatus = Status.WON;
                bankBalance *= wager;
                System.out.println("You won!! \nYour balance is " + bankBalance);
            }
            case SNAKE_EYES, TREY, BOX_CARS -> {
                bankBalance -= wager;
                gameStatus = Status.TRY_AGAIN;
            }
            default -> {
                bankBalance -= wager;
                gameStatus = Status.LOSE;
                System.out.println("Oh Sorry You busted!!!\nYour balance is " + bankBalance);
            }
        }
                while(gameStatus.equals(Status.TRY_AGAIN)){

                    if(guess == rollOfDice()){
                        gameStatus = Status.WON;
                         bankBalance += wager;
                        System.out.println("You won the game!!!\nYour balance is " + bankBalance);
                    }
                    else
                        System.out.println(chatterMessages());
                }


    }
    private String chatterMessages(){
        if(counter == 1){
            return "Oh you're going for broke, huh?";
        }
        else if (counter == 2){
            return "Aw c'mon, take a chance!";
        }
        else if (counter == 3){
            return "You're up big. Now's the time";
        }
        else
            return "to cash in your chips!";
    }

    private int rollOfDice() {
        int dice1 = randomNumber.nextInt(6);
        int dice2 = randomNumber.nextInt(6);

        return dice1 + dice2;
    }

    public void checkWager(double wager){
        boolean itIsWager = wager > 0.0 && wager >= bankBalance;

        while (!itIsWager) {
            System.out.println("Pls enter correct wager: ");
            wager = sc.nextDouble();

            if(itIsWager){
                this.wager = wager;
                break;
            }
        }
    }
}