package tdd;

import chapterFour.ClassTypes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirlineReservationTest {

    @Test
    void availableClassTypeCan_BeConfirmed() {
        AirlineReservation airlineReservation = new AirlineReservation();

        airlineReservation.isThereSeatAvailableFor(ClassTypes.ECONOMY);

        assertEquals(ClassTypes.ECONOMY, airlineReservation.getAvailableClass());
    }

    @Test
    void doubleAvailableClassTypeCan_BeConfirmed() {
        AirlineReservation airlineReservation = new AirlineReservation();
        airlineReservation.isThereSeatAvailableFor(ClassTypes.ECONOMY);
        assertEquals(ClassTypes.ECONOMY, airlineReservation.getAvailableClass());

        airlineReservation.isThereSeatAvailableFor(ClassTypes.FIRST_CLASS);
        assertEquals(ClassTypes.FIRST_CLASS, airlineReservation.getAvailableClass());
    }

    @Test
    void classTypeShallNotAllowInvalidClassType() {
        AirlineReservation airlineReservation = new AirlineReservation();
        airlineReservation.isThereSeatAvailableFor(ClassTypes.ECONOMY);
        assertEquals(ClassTypes.ECONOMY, airlineReservation.getAvailableClass());

        airlineReservation.isThereSeatAvailableFor(ClassTypes.ECONOMY);
        assertEquals(ClassTypes.ECONOMY, airlineReservation.getAvailableClass());

        airlineReservation.isThereSeatAvailableFor(ClassTypes.BUSINESS);
        assertFalse(airlineReservation.getAvailableClass()==ClassTypes.BUSINESS);
    }

    @Test
    void seatNumberCan_beAssigned() {
        AirlineReservation airlineReservation = new AirlineReservation();
        airlineReservation.isSeatAvailableForClassType(10, ClassTypes.ECONOMY);

        assertTrue( airlineReservation.assignSeat());

    }

}