package chapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateNumberDetectorTest {

    @Test
    void testNumberCanBeInput(){
        DuplicateNumberDetector numberDetector = new DuplicateNumberDetector();

        numberDetector.inputNumber(10);
        assertArrayEquals(new int[]{10, 0, 0, 0, 0}, numberDetector.getContainerOfNumbers());
    }

    @Test
    void testThatNumberCanBeInputFiveTimes(){
        DuplicateNumberDetector numbers = new DuplicateNumberDetector();
        numbers.inputNumber(50);
        numbers.inputNumber(90);
        numbers.inputNumber(60);
        numbers.inputNumber(40);
        numbers.inputNumber(16);

        assertArrayEquals(new int[]{50, 90, 60, 40, 16}, numbers.getContainerOfNumbers());
    }

    @Test
    void duplicateNumber_cannotBeTaken(){
        DuplicateNumberDetector uniqueNumbers = new DuplicateNumberDetector();

        uniqueNumbers.inputNumber(33);
        uniqueNumbers.inputNumber(67);
        uniqueNumbers.inputNumber(33);

        assertArrayEquals(new int[]{33, 67, 0, 0, 0}, uniqueNumbers.getContainerOfNumbers());
    }
}
