package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmploymentTest {

    @Test
    void hr_cannotEmployLasuite(){
        Candidate oluperi = new Candidate("Oluperi", School.NOUN);
        Candidate david = new Candidate("David", School.UN);
        assertEquals("Employed", Hr.employ(oluperi));
        assertEquals("Employed", Hr.employ(david));
        System.out.println(oluperi.toString());

    }

}
