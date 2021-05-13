package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumPlayingClient {

    @Test
    void testCanCheckForMaximumNum(){
        assertEquals(23.4, MaximumNumber.maximum(23.4, 21.9, 6.3));
    }
}
