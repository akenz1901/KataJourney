package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateClient {
    Date nigeriaDate;
    @BeforeEach
    void startAllWith(){
        nigeriaDate = new Date();
    }
    @Test
    void date_canBeSetForDate() {
        nigeriaDate.setDate(7, 12, 2022);
        assertEquals(7, nigeriaDate.getDay());
        assertEquals(12, nigeriaDate.getMonth());
        assertEquals(2022, nigeriaDate.getYear());
    }
    @Test
    void invalidDay_canThrowException(){
        assertThrows(IllegalArgumentException.class,()->nigeriaDate.setDate(56,2,2021));
    }
    @Test
    void invalidMonth_canThrowException(){
        assertThrows(IllegalArgumentException.class,()->nigeriaDate.setDate(20,47,2021));
    }
    @Test
    void invalidYear_canThrowException(){
        assertThrows(IllegalArgumentException.class,()->nigeriaDate.setDate(20,8,2056));
    }
    @Test
    void date_canBeUsedWithConstructor(){
        nigeriaDate = new Date(29, 12, 2022);
        assertEquals(29, nigeriaDate.getDay());
        assertEquals(12, nigeriaDate.getMonth());
        assertEquals(2022, nigeriaDate.getYear());
    }

}
