package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeClient {
    Time time;
    @BeforeEach
    void startAllThis(){
        time = new Time();
    }

    @Test
    void confirmIfTimeIsNotNull(){
        Time time = new Time();
        assertNotNull(time);
    }
    @Test
    void time_canBeSet(){
        time.setTime(12,45,8);
        assertEquals(12, time.getHour());
        assertEquals(45, time.getMinute());
        assertEquals(8, time.getSecond());
    }
    @Test
    void invalidHour_throwException(){
       assertThrows(IllegalArgumentException.class,()->time.setTime(54, 32,9));

//        try{
//            time.setTime(54,60,34);
//            time.getHour();
//        }
//        catch (IllegalArgumentException illegalArgumentException){
//            System.out.println(illegalArgumentException.getMessage());
//        }
    }
    @Test
    void invalidMinute_throwException(){
        assertThrows(IllegalArgumentException.class,()->time.setTime(12,67,45));
    }
    @Test
    void invalidSecond_throwException(){
        assertThrows(IllegalArgumentException.class,()->time.setTime(8,60,87));
    }


}
