package tdd;

import chapterFour.Kata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    private KataTwo testDriller;

    @BeforeEach
    void startAllTestWithThis() {
        testDriller = new KataTwo();
    }

    @Test
    void purchaseOneUnitOfTestDrillerTest() {

        assertEquals(1500, testDriller.calculatePriceFor(1));
    }

    @Test
    void purchaseFourUnitsOfTestDriller() {
        assertEquals(1500 * 4, testDriller.calculatePriceFor(4));
        assertEquals(1500 * 3, testDriller.calculatePriceFor(3));
    }

    @Test
    void purchaseFiveUnitsOfTestDriller() {
        assertEquals(1400 * 5, testDriller.calculatePriceFor(5));
        assertEquals(1400 * 9, testDriller.calculatePriceFor(9));
    }

    @Test
    void purchaseTenUnitsOfTestDriller() {
        assertEquals(1200 * 10, testDriller.calculatePriceFor(10));
        assertEquals(1200 * 29, testDriller.calculatePriceFor(29));
    }

    @Test
    void purchaseThirtyUnitsOfTestDriller() {
        assertEquals(1100 * 30, testDriller.calculatePriceFor(30));
        assertEquals(1100 * 37, testDriller.calculatePriceFor(37));
    }

    @Test
    void purchaseFiftyUnitsOfTestDriller() {
        assertEquals(1000 * 50, testDriller.calculatePriceFor(50));
        assertEquals(1000 * 89, testDriller.calculatePriceFor(89));
    }

    @Test
    void purchaseOneHundredOfTestDriller() {
        assertEquals(900 * 130, testDriller.calculatePriceFor(130));
        assertEquals(900 * 99, testDriller.calculatePriceFor(99));
    }

    @Test
    void purchaseTwoHundredUnitsOfTestDrillerAndAsManyAsYouWant() {
        assertEquals(800 * 200, testDriller.calculatePriceFor(200));
        assertEquals(800 * 500, testDriller.calculatePriceFor(500));
    }

    @Test
    void letterHasToBeUpperCaseLetter() {
        assertEquals("God is WonderFul", KataTwo.newCaseLearning());
    }

    @Test
    void sumOfNumbersInAnArray() {
        int[] arrays = {2, 3, 2, 5, 12};
        assertEquals(24, KataTwo.getSumOfArray(arrays));
    }

    @Test
    void testingTheAverageOfAnArray() {
        int[] averageOfTheArrays = {5, 4, 2, 6, 8, 5};
        assertEquals(5.0, KataTwo.getAverageOfTheFollowingArrays(averageOfTheArrays));
    }

    @Test
    void maximumNumberAmongTheArrays() {
        int[] arrays = {1, 2, 4, 5, 6, 7};
        assertEquals(7, KataTwo.getMaximumNumber(arrays));
    }

    @Test
    void minimumNumberAmongTheArrays() {
        int[] arrays = {1, 4, 5, 6, 7, 8};
        assertEquals(1, KataTwo.getMinimumNumber(arrays));
    }

    @Test
    void enhanceForLoopPractice() {
        int[] arrays = {1, 4, 5, 6, 7, 8};
        int sum = 0;
        int loopCounter = 1;
        for (int newSum : arrays) {
            if (loopCounter % 2 == 1)
                sum = sum + newSum;
            loopCounter++;
        }
        System.out.println(sum);

        String name = "3857499233";
        char[] letters = name.toCharArray();
        int length = name.length();
        for (int counter = 0; length > counter; counter--) {
            System.out.println(letters[counter - 1] + "");
        }

    }

    @Test
    void testPassByValue() {
        int[] setOfNumbers = {1, 2, 4, 5,};
        int sum = KataTwo.addingNumbersWithVague(setOfNumbers);
        assertEquals(12, sum);
    }

    @Test
    void multidimensionalArrays() {
        int[][] numbers = {{2, 3, 5}, {4, 3, 5}, {6, 7, 3}};
        assertEquals(3, KataTwo.multidimensionalNumbers(numbers));
    }

    @Test
    void maximumNumberAmongSetOfArrays() {
        int[] numbers = {1, 2, 3};
        assertEquals(6, KataTwo.maximumComparisonOfArrayIndexes(numbers));
    }

    @Test
    void arrayCanBeReShuffled() {
        Kata shuffler = new Kata();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(shuffler.shuffleArray(numbers)));
    }
    @Test
    void arrayCanBeReversed(){
        Kata reverse = new Kata();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        assertEquals(6, numbers.length);
        System.out.println(Arrays.toString(reverse.reverseArray(numbers)));
    }
    @Test
    void arraySortingTest(){
        Kata sort = new Kata();
        int[] numbers = {2, 5, 4, 3, 1, 6};
        sort.sortArrayDesc(numbers);
        System.out.print(Arrays.toString(numbers));
        assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, numbers);
    }
    @Test
    void evenNumberCanBeTested(){
        Kata isEvenNumber = new Kata();
        assertFalse(isEvenNumber.isEven(87));
    }
    public static void main(String[] args) throws InterruptedException {
        char[][] ticItTacIt = new char[3][3];
        ticItTacIt[0] = new char[]{'X', 'O', 'X'};
        ticItTacIt[1] = new char[]{'O', 'O', 'X'};
        ticItTacIt[2] = new char[]{'O', 'X', 'O'};
        for (char[] letter: ticItTacIt) {
            for (char c : letter) {
                System.out.print(c + " ");
            }
            System.out.println();
            Thread.sleep(1000);
        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < ticItTacIt[i].length; j++) {
//                    ticItTacIt[i][j] = 'X';
//                switch (j) {
//                    case 1 -> ticItTacIt[i][j] = 'O';
//                    case 2 -> ticItTacIt[i][j] = 'X';
//                }
//                if(i == 1){
//                    ticItTacIt[i][j] = 'O';
//                    switch (j){
//                        case 1 -> ticItTacIt[i][j] = 'O';
//                        case 2 -> ticItTacIt[i][j] = 'X';
//                    }
//                    System.out.print(ticItTacIt[i][j]);
//                }
//                else if(i == 2){
//                    ticItTacIt[i][j] = 'O';
//                    switch (j){
//                        case 1 -> ticItTacIt[i][j] = 'X';
//                        case 2 -> ticItTacIt[i][j] = 'O';
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(i - j);
//                System.out.println();
//            }
//        }
    }
    @Test
    void testTheSevenSegment(){
        char[][] sevenOnAndOf = {{'#','#','#','#'}, {'#',0,0,'#'}, {'#','#','#','#'}, {'#',0,0,'#'}, {'#','#','#','#'}};
        for (char []numbers:sevenOnAndOf) {
            System.out.println();
            for (char digit: numbers) {
                System.out.print(digit + " ");
            }
        }
    }
    @Test
    void testTheSevenSegmentAgain() throws InterruptedException {
        int [][] sevenSegment = {{1,1,1,1}, {1,0,0,1}, {1,1,1,1}, {1,0,0,1}, {1,1,1,1}};
        for (int[] digits :sevenSegment) {
            System.out.println();
            for (int singleDigit:digits) {
                switch (singleDigit) {
                    case 1 -> System.out.print("# ");
                    case 0 -> System.out.print("  ");
                }
            }
            Thread.sleep(1000);
        }
    }
    @Test
    void arrayCanBeSortedAPIMethod(){
        int [] cohortsNumbers = {23,4,51,3,4,22,9,0,1,2,3,22,3,4,44,};
        Kata.sortArray(cohortsNumbers);
        for (int digit:cohortsNumbers) {
            System.out.print(digit);
            System.out.print(",");
        }
    }
    @Test
    void arrayCanBeFilledAPIMethod(){
        int [] cohortsNumbers = {23,4,51,3,4,22,9,0,1,2,3,22,3,4,44};
        Kata.fillArray(cohortsNumbers);
        for (int digit:cohortsNumbers) {
            System.out.print("Cohort");
            System.out.print(digit);
            System.out.print(" ");
        }
    }
    @Test
    void arrayCanBeCopied() {
        int[] cohortsNumbers = {23, 4, 51, 3, 4, 22, 9, 0, 1, 2, 3, 22, 3, 4, 44};
        int[] copyCart = new int[cohortsNumbers.length];
        Kata.copyArray(cohortsNumbers, copyCart);
        System.out.printf("%s%10s%n", "First Array", "CopyCart");
        for (int i = 0; i < cohortsNumbers.length; ) {
            System.out.printf("%5d", cohortsNumbers[i]);
            for (int j = 0; j < i; j++) {
                System.out.printf("%8d", copyCart[j]);
            }
            i++;
        }
    }
}