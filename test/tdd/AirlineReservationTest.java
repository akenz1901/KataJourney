package tdd;

import chapterFour.ClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import airlineApp.AirlineReservation;
import airlineApp.ClassNotAvailableException;

import static chapterFour.ClassTypes.BUSINESS;
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
    void availableClassTypeThrowsAnException(){
        assertThrows(ClassNotAvailableException.class, ()-> airlineReservation.isThereSeatAvailableFor(BUSINESS));
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
        assertTrue( airlineReservation.confirmSeat());

    }
    @Test
    void seatNumbers_cannotBeAssignedOverLimit(){
        airlineReservation.isSeatAvailableForClassType(11, ClassTypes.ECONOMY);
        assertFalse(airlineReservation.confirmSeat());
    }
    @Test
    void passenger_canBeAssignedToSeat(){
        airlineReservation.assignSeatForPassenger(1,"Fowler","Martin",ClassTypes.FIRST_CLASS);
        assertEquals("Fowler Martin", airlineReservation.getPassengerBySeatNumber(1));
    }
    @Test
    void twoPassengers_cannotBeAssignedToOneSeat(){
        airlineReservation.assignSeatForPassenger(1,"Fowler","Martin",ClassTypes.FIRST_CLASS);
        assertEquals("Fowler Martin", airlineReservation.getPassengerBySeatNumber(1));

        airlineReservation.assignSeatForPassenger(5,"Akenz","Martin",ClassTypes.FIRST_CLASS);
        assertEquals("Akenz Martin", airlineReservation.getPassengerBySeatNumber(5));
    }
    @Test
    void numberOfPassengerCanBePopulated(){
        airlineReservation.assignSeatForPassenger(1,"Fowler","Martin",ClassTypes.FIRST_CLASS);
        airlineReservation.assignSeatForPassenger(5,"Akenz","Akinsanya",ClassTypes.FIRST_CLASS);

        assertEquals(2, airlineReservation.getNumberOfPassengerOnSeat());
        System.out.printf("%s", airlineReservation.allPassengerOnSeat());
    }

}