package tdd;

import java.util.Arrays;

public class PlayingGround {

    public static void main(String... args){
        int[] numbers = {5, 0, 27, 4, 6, 3, 9};
        int holder;

        for(int i = 1; i < numbers.length;  i++){
             for(int j = 0; j < numbers.length; j++){
                 if(numbers[i] < numbers[j]){
                     holder = numbers[j];
                     numbers[j] = numbers[i];
                     numbers[i] = holder;
                 }
             }

        }
        System.out.println(Arrays.toString(numbers));
    }
}
