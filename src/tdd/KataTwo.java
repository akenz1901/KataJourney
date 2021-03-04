package tdd;

public class KataTwo {

    public int calulatePriceFor( int testDrillerQuantity) {
        int unitPrice = 0;
        if (testDrillerQuantity >= 1 && testDrillerQuantity <= 4) {
            unitPrice = 1500;//return 1500 * testDrillerQuantity;
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
