package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarParkCalculatorClient {

    @Test
    void customerCanGetReceiptForCarParked(){
        CarParkCalculator carBill = new CarParkCalculator();
        carBill.enterHowManyHours(24);
        assertEquals(24, carBill.getHour());

        assertEquals(10, carBill.calculateCharges());
    }
}
