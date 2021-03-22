package tdd;

import java.util.Arrays;

public class KataTwo {
    public static int  maximumComparisonOfArrayIndexes(int... numbers){
        int sum = 0;
        for(int numberCounter = 0 ;numbers.length>=numberCounter; ){
            sum = sum+numbers[numberCounter];
            System.out.println(sum);
//            if(numberCounter % 1== 0) {
//                ;
//            }
            numberCounter++;
        }
        return 6;
    }

    public static int rollingOfDice(int[] arrays){
        arrays = new int[6];
        int loopCounter = 0;
        int OneDice;
        System.out.printf("%s%s8", "Header","Indexes");
        while(loopCounter<arrays.length){
            OneDice = (int) (Math.random()*60000000);
            arrays[loopCounter] = OneDice - arrays.length;
            System.out.printf("%d3%n%d8%n",arrays.length, arrays[loopCounter]);
            ++loopCounter;
        }
        return arrays.length;
    }


    public static int getSumOfArray(int[] sumOfArrays) {
        int loopCounter = 0;
        int sum = 0;
        while(loopCounter<sumOfArrays.length) {
            sum = sum + sumOfArrays[loopCounter];
            ++loopCounter;
        }
        return sum;
    }

    public static double getAverageOfTheFollowingArrays(int[] averageOfArrays) {
        int loopCounter = 0;
        int sumOfAverage = 0;
        while(loopCounter<averageOfArrays.length){
            sumOfAverage = sumOfAverage + averageOfArrays[loopCounter];
            ++loopCounter;
        }
        return sumOfAverage/(averageOfArrays.length*1.0);
//        return getSumOfArray(averageOfArrays)/(averageOfArrays.length*1.0);
    }

    public static int getMaximumNumber(int[] arrays) {
        int maximum = arrays[0];
        int loopCounter = 0;
        while(loopCounter<arrays.length){
            if (maximum < arrays[loopCounter]) {
                maximum = arrays[loopCounter];
            }
            loopCounter++;
        }
        return maximum;
    }

    public static int getMinimumNumber(int[] arrays) {
        int minimum = arrays[0];
        int loopCounter = 0;
        while(loopCounter<arrays.length){
            if (minimum > arrays[loopCounter]) {
                minimum = arrays[loopCounter];
            }
            loopCounter++;
        }
        return minimum;
    }
    public static String newCaseLearning() {
        String name = "Chibuzo".toLowerCase();
        return name;
    }

    public static int addingNumbersWithVague(int... numbers) {
        int sum = 0;
        for(int number : numbers){
            sum+=number;
        }
        return sum;
    }
    public static int multidimensionalNumbers(int [][] numbers){
        for(int loopCounter = 0 ;loopCounter<numbers.length; ){
            System.out.println(Arrays.toString(numbers[loopCounter]));
            loopCounter++;
        }
        return numbers.length;
    }

    public int calculatePriceFor(int testDrillerQuantity) {
        int unitPrice = 0;
        if (testDrillerQuantity >= 1 && testDrillerQuantity <= 4) {
            unitPrice = 1500;
        }
        if (testDrillerQuantity > 4 && testDrillerQuantity < 10) {
            unitPrice = 1400;
        }
        if (testDrillerQuantity > 9 && testDrillerQuantity < 30) {
            unitPrice = 1200;
        }
        if (testDrillerQuantity > 29 && testDrillerQuantity < 50) {
            unitPrice = 1100;
        }
        if (testDrillerQuantity > 49 && testDrillerQuantity < 100) {
            unitPrice = 1000;
        }
        if (testDrillerQuantity >= 99 && testDrillerQuantity < 200){
            unitPrice = 900;
        }
        if(testDrillerQuantity >=200) {
            unitPrice = 800;
        }
        return unitPrice * testDrillerQuantity;
    }
}
