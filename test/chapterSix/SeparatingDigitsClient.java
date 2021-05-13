package chapterSix;

import org.junit.jupiter.api.Test;

public class SeparatingDigitsClient {

    @Test
    void digitsCanBeSeparated(){
        SeparatingDigits sp = new SeparatingDigits();
        System.out.println(sp.display(11000));
    }
}
