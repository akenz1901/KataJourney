package chapterFive;

import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {
        Scanner collect = new Scanner(System.in);

        int userInput,firstNumber = 0,second = 0,thirdNum = 0,forthNum = 0,fifthNum = 0;

        for(int collectionTimes = 0; collectionTimes < 5; collectionTimes++){
            System.out.print("Enter a number of asterisk: ");
            userInput = collect.nextInt();

            if(collectionTimes == 0 && userInput <= 30 && userInput > 0){
                firstNumber = userInput;
            }
            if(collectionTimes == 1 && userInput <= 30 && userInput > 0){
                second = userInput;
            }
            if(collectionTimes == 2 && userInput <= 30 && userInput > 0){
                thirdNum = userInput;
            }
            if(collectionTimes == 3 && userInput <= 30 && userInput > 0){
                forthNum = userInput;
            }
            if(collectionTimes == 4 && userInput <= 30 && userInput > 0){
                fifthNum = userInput;
            }
        }
        int counter;
        for (int asterisk = 0; asterisk < 5 ; asterisk++){
                for (counter = firstNumber; counter > 0; counter--) {
                    System.out.print("*");
                }
            System.out.println();
                if(asterisk == 1) {
                    firstNumber = second;
                }
                else if(asterisk == 2) {
                    firstNumber = thirdNum;
                }
                else if(asterisk == 3) {
                    firstNumber = forthNum;
                }
                else if(asterisk == 4) {
                    firstNumber = fifthNum;
                }
        }




////        for(int count = 0; count < 1; count++){
////            for (int count1 = 0; count1 < firstNumber ; count1++){
////                System.out.print("*");
////            }
////            System.out.print("\n");
////            for (int count1 = 0;count1 < second ;count1++){
////                System.out.print("*");
////            }
////            System.out.println();
////            for (int counter = 0; thirdNum > counter ; counter++){
////                System.out.print("*");
////            }
////            System.out.println();
////            for (int counting = 0;counting < fought ; counting++){
////                System.out.print("*");
////            }
////            System.out.println();
////            for (int count = 0; count < fifthNum ; count++){
////                System.out.print("*");
////            }
//        }
    }
}
