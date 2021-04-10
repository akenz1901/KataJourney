package tdd;

import chapterEight.Date;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateClient {

    @Test
    void day_canBeCreatedForDate(){
        Date nigeriaDate = new Date();
        nigeriaDate.setDate(6, 6);
        assertEquals(6, nigeriaDate.getDay());
    }
    @Test
    void month_canBeCreatedForDate(){
        Date nigeriaDate = new Date();
        nigeriaDate.setDate(6,12);
        assertEquals(12, nigeriaDate.getMonth());
        assertEquals(6, nigeriaDate.getDay());
    }
    @Test
    void year_canBeCreatedForDate(){

    }
}
