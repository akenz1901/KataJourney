package tdd;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestSite {

    @Test
    void determineOccurrenceOfALetter(){
        String animal = "elephant";
        int me = 0;
        for(int counter = 0;counter < animal.length(); counter++){

            if(animal.charAt(counter)=='e'+'e'){
                me++;
            }
        }
        System.out.printf("Letter (e) was found %s ", me + " times");
    }

    @Test
    void determineWordsInSentence(){
        String expression = " i want what i want and what i want isn't what i got may God provide what i want ";

        String [] boySender = expression.split(" ");
        int increase = 0;
        for (String nigga: boySender) {
            if (nigga.equals("want")){
                increase++;
            }
        }
        System.out.println(increase);
    }
    @Test
    void determineWordInASentence(){
        System.out.print(determineForMe("Mummy Pls buy bonvita for me only me", "me"));
    }

    public static int determineForMe(String sentence, String check){
        int reader = 0;

        for (int count = 0; count < sentence.length(); count++)
        if (check.regionMatches(0, sentence, 36, 35))
            reader++;
            return reader;
    }
}
