package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoNumbers() {
        Calculator calculator  = new Calculator();


        assertEquals(17, calculator.add(7,10));
        assertEquals(11, calculator.add(5,6));
    }

    @Test
    @DisplayName("Testing For Multiplication")
    void multiplyingTwoNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(27, calculator.multiply(3, 9));
    }

    @Test
    @DisplayName("Testing numbers can be divided")
    void dividedTwoNumbersTest(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(4,2));
        assertEquals(3, calculator.divide(15,5));
        }

    @Test
    @DisplayName("Testing float with number")
        void divideTwoNumbersToYieldFloatTest(){
        Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.divide(5, 2));
        }


    @Test
    @DisplayName("Division by Zero returns zero")
    void divisionByZeroTest(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.divide(5,0));
    }

    @Test
    void difference_canBeCalculated(){
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.subtract(10,5));
}
    @Test
    void difference_willProduceAbsoluteResult(){
        Calculator calculator = new Calculator();
        assertEquals(5,calculator.subtract(5,10));
    }

    }