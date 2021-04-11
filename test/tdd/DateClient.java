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
    void date_canBeCreatedForDate() {
        nigeriaDate.setDate(6, 12, 2021);
        assertEquals(6, nigeriaDate.getDay());
        assertEquals(12, nigeriaDate.getMonth());
        assertEquals(2021, nigeriaDate.getYear());
    }
    @Test
    void date_isValidate(){
        nigeriaDate.setDate(41,67,1995);
        assertEquals(0, nigeriaDate.getDay());
        assertEquals(0, nigeriaDate.getMonth());
        assertEquals(0, nigeriaDate.getYear());
    }

}
