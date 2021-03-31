package tdd;

import chapterFour.ClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirlineReservationTest {
    AirlineReservation airlineReservation;
    @BeforeEach
    void doThisForAllTests(){
        airlineReservation = new AirlineReservation();
    }
    @Test
    void availableClassTypeCan_BeConfirmed() {

        airlineReservation.isThereSeatAvailableFor(ClassTypes.ECONOMY);

        assertEquals(ClassTypes.ECONOMY, airlineReservation.getAvailableClass());
    }

    @Test
    void doubleAvailableClassTypeCan_BeConfirmed() {
        airlineReservation.isThereSeatAvailableFor(ClassTypes.ECONOMY);
        assertEquals(ClassTypes.ECONOMY, airlineReservation.getAvailableClass());

        airlineReservation.isThereSeatAvailableFor(ClassTypes.FIRST_CLASS);
        assertEquals(ClassTypes.FIRST_CLASS, airlineReservation.getAvailableClass());
    }

    @Test
    void classTypeShallNotAllowInvalidClassType() {
        airlineReservation.isThereSeatAvailableFor(ClassTypes.ECONOMY);
        assertEquals(ClassTypes.ECONOMY, airlineReservation.getAvailableClass());

        airlineReservation.isThereSeatAvailableFor(ClassTypes.FIRST_CLASS);
        assertEquals(ClassTypes.FIRST_CLASS, airlineReservation.getAvailableClass());

    }

    @Test
    void seatNumberCan_beAssigned() {
        airlineReservation.isSeatAvailableForClassType(7, ClassTypes.ECONOMY);
        assertTrue( airlineReservation.assignSeat());

    }
    @Test
    void seatNumbers_cannotBeAssignedOverLimit(){
        airlineReservation.isSeatAvailableForClassType(11, ClassTypes.ECONOMY);
        assertFalse(airlineReservation.assignSeat());
    }
    @Test
    void passengerCanBeCreated_WithDestination(){
        airlineReservation.passengerInfo("Hon","Dickson","Spain");
        assertEquals("Hon Dickson",airlineReservation.getPassenger());
        assertEquals("Spain", airlineReservation.getDestination());
    }
    @Test
    void passenger_canBeAssignedToSeat(){

    }

}