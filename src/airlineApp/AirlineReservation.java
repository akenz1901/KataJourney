
package airlineApp;

import chapterFour.ClassTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirlineReservation {

    private ClassTypes typeOfFlightClass;
    private boolean checkSeatSelection;
    private final boolean[] numberOfSeat = new boolean[10];
    private final PassengerInfo [] passengersOnSeat = new PassengerInfo[10];

    public void isThereSeatAvailableFor(ClassTypes classType) {
        validateConfirmSeat(classType);
            typeOfFlightClass = classType;
    }
    public static void validateConfirmSeat(ClassTypes classType){
        boolean requiredClassType = classType.equals(ClassTypes.FIRST_CLASS) | classType.equals(ClassTypes.ECONOMY);
        if(!requiredClassType)
            throw new ClassNotAvailableException("Invalid Class Type");
    }
    public ClassTypes getAvailableClass() {
        return typeOfFlightClass;
    }

    public void validateSeatNumber(int seatNumber){
        if(seatNumber < 0 && seatNumber > numberOfSeat.length)
            throw new InvalidSeatNumber("Wrong Seat Number we only have limited seat Number");
    }

    public void isSeatAvailableForClassType(int seatNumber, ClassTypes classType) {
        validateSeatNumber(seatNumber);
        validateConfirmSeat(classType);
        for (int counter = 0; counter < 5; counter++) {
            if (classType.equals(ClassTypes.FIRST_CLASS) && seatNumber <= 5 && seatNumber > 0) {
                numberOfSeat[seatNumber-1] = true;
                checkSeatSelection = true;
            }
            for (counter = 5; counter <=numberOfSeat.length; counter++) {
                if (classType.equals(ClassTypes.ECONOMY) && seatNumber > 5 && seatNumber <= numberOfSeat.length) {
                    numberOfSeat[seatNumber] = true;
                    checkSeatSelection = true;
                }
            }
        }
    }
    public boolean confirmSeat() {
        return checkSeatSelection;
    }

    public void assignSeatForPassenger(int seatNumber, String firstName,String lastName, ClassTypes classType){
        validateConfirmSeat(classType);
        validateSeatNumber(seatNumber);
        PassengerInfo passenger = new PassengerInfo(firstName,lastName);
        passengersOnSeat[seatNumber] = passenger;
    }

    public String getPassengerBySeatNumber(int seatNumber) {
        return passengersOnSeat[seatNumber].toString();}

    public String allPassengerOnSeat() {
//        int num = 0;
//        for (PassengerInfo passenger:passengersOnSeat){
//            num++;
//            System.out.printf("%d. %s%n", num, passenger);
//        }
        return Arrays.toString(passengersOnSeat);
    }
    public int getNumberOfPassengerOnSeat(){
        int numOfPassenger = 0;
        for (PassengerInfo passengerInfo : passengersOnSeat) {
            if (passengerInfo != null) {
                numOfPassenger++;
            }
        }
        return numOfPassenger;
    }

    public String populatePassenger() {return Arrays.toString(passengersOnSeat);}
}
