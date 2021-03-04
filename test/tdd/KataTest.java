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

        assertEquals(1500, testDriller.calulatePriceFor(1));
    }

    @Test
    void purchaseFourUnitsOfTestDriller(){
        assertEquals(1500*4, testDriller.calulatePriceFor(4));
        assertEquals(1500*3, testDriller.calulatePriceFor(3));
    }
    @Test
    void purchaseFiveUnitsOfTestDriller(){
        assertEquals(1400*5, testDriller.calulatePriceFor(5));
        assertEquals(1400*9, testDriller.calulatePriceFor(9));
    }
    @Test
    void purchaseTenUnitsOfTestDriller() {
        assertEquals(1200 * 10, testDriller.calulatePriceFor(10));
        assertEquals(1200 * 29, testDriller.calulatePriceFor(29));
    }
    @Test
    void purchaseThirtyUnitsOfTestDriller() {
        assertEquals(1100 * 30, testDriller.calulatePriceFor(30));
        assertEquals(1100 * 37, testDriller.calulatePriceFor(37));
    }
    @Test
    void purchaseFiftyUnitsOfTestDriller() {
        assertEquals(1000 * 50, testDriller.calulatePriceFor(50));
        assertEquals(1000 * 89, testDriller.calulatePriceFor(89));
    }
    @Test
    void purchaseOneHundredOfTestDriller(){
        assertEquals(900 * 130, testDriller.calulatePriceFor(130));
        assertEquals(900 * 99, testDriller.calulatePriceFor(99));
    }
    @Test
    void purchaseTwoHundredUnitsOfTestDrillerAndAsManyAsYouWant() {
        assertEquals(800 * 200, testDriller.calulatePriceFor(200));
        assertEquals(800 * 500, testDriller.calulatePriceFor(500));
    }
}

