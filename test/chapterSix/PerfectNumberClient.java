package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerfectNumberClient {

    @Test
    void perfectNumberCanBeDetected(){
        PerfectNumber number = new PerfectNumber();
        number.isPerfect(6);
        assertTrue( number.getPerfect());
    }
}
