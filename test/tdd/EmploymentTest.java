package tdd;

import org.junit.jupiter.api.Test;

import java.nio.channels.ShutdownChannelGroupException;

import static org.junit.jupiter.api.Assertions.*;

public class EmploymentTest {

    @Test
    void hr_cannotEmployLasuite(){
        Candidate oluperi = new Candidate("Oluperi", School.NOUN);
        Candidate david = new Candidate("David", School.LASU);
        assertEquals("Employed", Hr.employ(oluperi));
        assertEquals("Employed", Hr.employ(david));

    }

}
