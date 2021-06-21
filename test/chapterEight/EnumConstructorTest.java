package chapterEight;

import org.junit.jupiter.api.Test;

import java.util.EnumSet;

import static chapterEight.EnumConstructor.*;

public class EnumConstructorTest {
    @Test
    void testThatConstructorCanBePrinted(){
        for (EnumConstructor value:EnumConstructor.values()) {
            System.out.println(value);
        }
        System.out.println();
        for (EnumConstructor product: EnumSet.range(BIRO, PENCIL)) {
            System.out.println(product);

        }
    }
}
