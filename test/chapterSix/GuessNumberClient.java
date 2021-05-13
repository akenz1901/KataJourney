package chapterSix;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class GuessNumberClient {

    @Test
    void playGuessGame(){
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
//        System.out.println(game.getNumber());

        System.out.println(game.getSpecificNumberOfCount());
    }
}
