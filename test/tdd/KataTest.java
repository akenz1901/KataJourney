package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    private KataTwo testDriller;
    @BeforeEach
    void startAllTestWithThis(){
        testDriller = new KataTwo();
    }
    @Test
    void purchaseOneUnitOfTestDrillerTest(){

        assertEquals(1500, testDriller.calculatePriceFor(1));
    }

    @Test
    void purchaseFourUnitsOfTestDriller(){
        assertEquals(1500*4, testDriller.calculatePriceFor(4));
        assertEquals(1500*3, testDriller.calculatePriceFor(3));
    }
    @Test
    void purchaseFiveUnitsOfTestDriller(){
        assertEquals(1400*5, testDriller.calculatePriceFor(5));
        assertEquals(1400*9, testDriller.calculatePriceFor(9));
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
    void purchaseOneHundredOfTestDriller(){
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
    void sumOfNumbersInAnArray(){
        int[] arrays = {2,3,2,5,12};
        assertEquals(24, KataTwo.getSumOfArray(arrays));
    }
    @Test
    void testingTheAverageOfAnArray(){
        int[] averageOfTheArrays = {5,4,2,6,8,5};
        assertEquals(5.0, KataTwo.getAverageOfTheFollowingArrays(averageOfTheArrays));
    }
    @Test
    void maximumNumberAmongTheArrays(){
        int[] arrays = {1,2,4,5,6,7};
        assertEquals(7, KataTwo.getMaximumNumber(arrays));
    }
    @Test
    void minimumNumberAmongTheArrays(){
        int[] arrays = {1,4,5,6,7,8};
        assertEquals(1, KataTwo.getMinimumNumber(arrays));
    }
    @Test
    void enhanceForLoopPractice(){
        int[] arrays = {1,4,5,6,7,8};
        int sum = 0;
        int loopCounter = 1;
        for(int newSum: arrays){
            if(loopCounter%2==1)
            sum = sum + newSum;
            loopCounter++;
        }
        System.out.println(sum);

        String name ="3857499233";
        char[] letters = name.toCharArray();
        int length = name.length();
        for(int counter = 0; length>counter ; counter--){
            System.out.println(letters[counter -1]+"");
        }

    }
    @Test
    void testPassByValue(){
        int [] setOfNumbers = {1,2,4,5,};
        int sum = KataTwo.addingNumbersWithVague(setOfNumbers);
        assertEquals(12, sum);
    }
    @Test
    void multidimensionalArrays(){
        int[][]numbers = {{2, 3, 5}, {4, 3, 5}, {6, 7, 3}};
        assertEquals(3, KataTwo.multidimensionalNumbers(numbers));
    }
    @Test
    void maximumNumberAmongSetOfArrays(){
        int [] numbers = {1,2,3};
        assertEquals(6, KataTwo.maximumComparisonOfArrayIndexes(numbers));
    }
}

