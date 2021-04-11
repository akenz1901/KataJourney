package tdd;

import chapterEight.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateClient {
    Date nigeriaDate;
    @BeforeEach
    void startAllWith(){
        nigeriaDate = new Date();
    }

    @Test
    void day_canBeCreatedForDate(){
        nigeriaDate.setDate(6, 6, 2021);
        assertEquals(6, nigeriaDate.getDay());
    }
    @Test
    void month_canBeCreatedForDate(){
        nigeriaDate.setDate(6,12, 2021);
        assertEquals(6, nigeriaDate.getDay());
        assertEquals(12, nigeriaDate.getMonth());
        assertEquals(2021, nigeriaDate.getYear());
    }
    @Test
    void year_canBeCreatedForDate(){
        nigeriaDate.setDate(24, 7, 2021);
        assertEquals(2021, nigeriaDate.getYear());
    }
    @Test
    void day_isValidate(){
        nigeriaDate.setDate(41,0,0);
        assertEquals(0, nigeriaDate.getDay());
    }
    @Test
    void month_isValidate(){
        nigeriaDate.setDate(0,50,0);
        assertEquals(0, nigeriaDate.getDay());
    }
    @Test
    void year_isValidate(){
        nigeriaDate.setDate(0,0,2037);
        assertEquals(0, nigeriaDate.getDay());
    }

}
