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

        airlineReservation.isThereSeatAvailableFor(ClassTypes.ECONOMY);
        assertEquals(ClassTypes.ECONOMY, airlineReservation.getAvailableClass());

        airlineReservation.isThereSeatAvailableFor(ClassTypes.BUSINESS);
        assertNotSame(airlineReservation.getAvailableClass(), ClassTypes.BUSINESS);
    }

    @Test
    void seatNumberCan_beAssigned() {
        airlineReservation.isSeatAvailableForClassType(9, ClassTypes.ECONOMY);

        assertTrue( airlineReservation.assignSeat());

    }
    @Test
    void seatNumbers_cannotBeAssignedOverLimit(){
        airlineReservation.isSeatAvailableForClassType(11, ClassTypes.ECONOMY);
        assertFalse(airlineReservation.assignSeat());
    }
    @Test
    void passengerNameCanBeCreated(){
        airlineReservation.passengerInfo("Hon ","Dickson");
        assertEquals("Hon Dickson",airlineReservation.getPassengerNames());
    }
    @Test
    void passengerDestinationCanBeAssignedWithCustomersName(){
        airlineReservation.passengerInfo("Michael", "Olashile");
        airlineReservation.getPassengerNames();
        airlineReservation.passengerDestination("New York");
        assertEquals("New York", airlineReservation.getPassengerDestination());
    }
    @Test
    void passengerCanBeAssignedWithSeat(){
        airlineReservation.passengerInfo("Michael ","Akinsanya");
        assertEquals("Michael Akinsanya",airlineReservation.getPassengerNames());
        airlineReservation.passengerDestination("London");
        assertEquals("London", airlineReservation.getPassengerDestination());

        airlineReservation.isSeatAvailableForClassType(9, ClassTypes.ECONOMY);
        assertTrue(airlineReservation.assignSeat());
    }
}