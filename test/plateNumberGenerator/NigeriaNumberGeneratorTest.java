package plateNumberGenerator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NigeriaNumberGeneratorTest {

    NigeriaNumberGenerator numberGenerator;
    @BeforeEach
    void setUp(){
        numberGenerator = new NigeriaNumberGenerator();
    }

    @AfterEach
    void tearDown(){}

    @Test
    void objectIsNotNull(){
        assertNotNull(numberGenerator);
    }
    @Test
    void stateContainsThirtySixStates(){
        assertTrue(numberGenerator.getStates());
    }
    @Test
    void generateNumbers(){
        numberGenerator.generateNumber();
        assertEquals(3 ,numberGenerator.getNum().length());
    }

    @Test
    void generatePlateNumber(){
        numberGenerator.setDesiredState("lagos");

        assertNotNull(numberGenerator.getState());

        numberGenerator.generateNumber();
        assertEquals(3, numberGenerator.getNum().length());

        assertEquals(9, numberGenerator.generatePlateNumber().length());
        numberGenerator.displayPlateNumber();
    }
}