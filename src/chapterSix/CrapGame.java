package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapGame {

    private final int SEVEN = 7;
    private final int YO_SEVEN = 11;
    private final int SNAKE_EYES = 2;
    private final int TREY = 3;
    private final int BOX_CARS = 12;
    private Status gameStatus;
    private double wager;
    private final SecureRandom randomNumber = new SecureRandom();

    int counter = randomNumber.nextInt(5);

    Scanner sc = new Scanner(System.in);
    private double bankBalance;
    private double newBalance;

    public CrapGame(){
        bankBalance = 1000;
    }

    public void gameSetting(int guess){

            switch (guess) {
                case SEVEN:
                case YO_SEVEN:
                    gameStatus = Status.WON;
                    newBalance = bankBalance * wager;
                    System.out.println("You won!! \nYour balance is " + newBalance);
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    newBalance = bankBalance -= wager;
                    gameStatus = Status.TRY_AGAIN;
                    break;

                default:
                    newBalance = bankBalance -= wager;
                    gameStatus = Status.LOSE;
                    System.out.println("Oh Sorry You busted!!!\nYour balance is " + newBalance);
                    break;
        }
                while(gameStatus.equals(Status.TRY_AGAIN)){

                    if(guess == rollOfDice()){
                        gameStatus = Status.WON;
                         newBalance = bankBalance + wager;
                        System.out.println("You won the game!!!\nYour balance is " + newBalance);
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