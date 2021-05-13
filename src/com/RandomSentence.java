package com;

import java.security.SecureRandom;
import java.util.Locale;

public class RandomSentence {

    public static String getRandomSentence(){
        SecureRandom random = new SecureRandom();
        String[] articles = { "the", "a", "one", "some","any"}, noun = { "boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"} , preposition = { "to", "from", "over", "under", "on"};

        for (int counter = 0; counter < 20; counter++){
            System.out.print(counter+1 + " ");
            for (int secondCounter = 0; secondCounter < 5; secondCounter++){
                if(secondCounter == 0){
                    System.out.print(articles[random.nextInt(5)].toUpperCase(Locale.ROOT) + " ");
                }
                else if(secondCounter == 1){
                    System.out.print(noun[random.nextInt(5)] + " ");
                }
                else if(secondCounter == 2){
                    System.out.print(verb[random.nextInt(5)] + " ");
                }
                else if(secondCounter == 3){
                    System.out.print(preposition[random.nextInt(5)] + " ");
                }
                else {
                    System.out.print(articles[random.nextInt(5)] + " " + noun[random.nextInt(5)] + ".");
                }
            }
            System.out.println();
        }
        return "";
    }
}
