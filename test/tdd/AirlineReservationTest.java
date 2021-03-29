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
    void passengerCanBeCreated(){
        airlineReservation.passengerInfo("Hon","Dickson","London");
        assertEquals("huh",airlineReservation.getPassenger());
    }
//    @Test
//    void passengerDestinationCanBeAssignedWithCustomersName(){
//        airlineReservation.passengerInfo("Michael", "Olashile");
//        airlineReservation.getPassengerNames();
//        airlineReservation.passengerDestination("New York");
//        assertEquals("New York", airlineReservation.getPassengerDestination());
//    }
//    @Test
//    void passengerCanBeAssignedWithSeatForBoardingPass(){
//        airlineReservation.passengerInfo("Michael ","Akinsanya");
//        assertEquals("Michael Akinsanya",airlineReservation.getPassengerNames());
//        airlineReservation.passengerDestination("London");
//        assertEquals("London", airlineReservation.getPassengerDestination());
//
//        airlineReservation.isSeatAvailableForClassType(9, ClassTypes.ECONOMY);
//        assertTrue(airlineReservation.assignSeat());
//    }
//    @Test
//    void singlePassenger_cannotBookForASeatTwice(){
//        airlineReservation.passengerInfo("Michael ","Kelvin");
//        airlineReservation.getPassengerNames();
//        airlineReservation.passengerDestination("London");
//        airlineReservation.getPassengerDestination();
//
//        airlineReservation.isSeatAvailableForClassType(1, ClassTypes.FIRST_CLASS);
//        assertTrue(airlineReservation.assignSeat());
//
//        airlineReservation.passengerInfo("Michael ","Kelvin");
//        assertEquals("Michael Kelvin",airlineReservation.getPassengerNames());
//        airlineReservation.passengerDestination("London");
//        assertEquals("London", airlineReservation.getPassengerDestination());
//
//        airlineReservation.isSeatAvailableForClassType(2, ClassTypes.FIRST_CLASS);
//        assertTrue(airlineReservation.assignSeat());
//    }
}