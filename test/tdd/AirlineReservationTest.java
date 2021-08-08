package tdd;

import chapterFour.ClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import airlineApp.AirlineReservation;
import airlineApp.ClassNotAvailableException;

import static chapterFour.ClassTypes.*;
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

        airlineReservation.isThereSeatAvailableFor(FIRST_CLASS);
        assertEquals(FIRST_CLASS, airlineReservation.getAvailableClass());
    }
    @Test
    void availableClassTypeThrowsAnException(){
        assertThrows(ClassNotAvailableException.class, ()-> airlineReservation.isThereSeatAvailableFor(BUSINESS));
    }

    @Test
    void classTypeShallNotAllowInvalidClassType() {
        airlineReservation.isThereSeatAvailableFor(ClassTypes.ECONOMY);
        assertEquals(ClassTypes.ECONOMY, airlineReservation.getAvailableClass());

        airlineReservation.isThereSeatAvailableFor(FIRST_CLASS);
        assertEquals(FIRST_CLASS, airlineReservation.getAvailableClass());
    }

    @Test
    void passenger_canBeAssignedToSeat(){
        airlineReservation.assignSeatForPassenger(1,"Fowler","Martin", FIRST_CLASS);
        assertEquals("Fowler Martin", airlineReservation.getPassengerBySeatNumber(1));
    }

    @Test
    void twoPassengers_cannotBeAssignedToOneSeat(){
        airlineReservation.assignSeatForPassenger(10,"Fowler","Martin", ECONOMY);
        assertEquals("Fowler Martin", airlineReservation.getPassengerBySeatNumber(10));

        airlineReservation.assignSeatForPassenger(5,"Akenz","Martin", FIRST_CLASS);
        assertTrue(airlineReservation.confirmSeat());
        assertEquals("Akenz Martin", airlineReservation.getPassengerBySeatNumber(5));
    }

    @Test
    void numberOfPassengerCanBePopulated(){
        airlineReservation.assignSeatForPassenger(1,"Fowler","Martin", FIRST_CLASS);
        airlineReservation.assignSeatForPassenger(5,"Akenz","Akinsanya", FIRST_CLASS);

        assertEquals(2, airlineReservation.getNumberOfPassengerOnSeat());
        System.out.printf("%s", airlineReservation.allPassengerOnSeat());
    }
    @DisplayName("michael")
    @Test
    void displayAirlinePlaneTicket(){
        airlineReservation.assignSeatForPassenger(10,"Mercy","Eberechukwu",ECONOMY);
        assertTrue(airlineReservation.confirmSeat());
        System.out.printf("%s", airlineReservation);
    }

}