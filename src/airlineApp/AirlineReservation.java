
package airlineApp;

import chapterFour.ClassTypes;

import java.util.Arrays;

import static chapterFour.ClassTypes.ECONOMY;
import static chapterFour.ClassTypes.FIRST_CLASS;

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
        boolean requiredClassType = classType.equals(FIRST_CLASS) | classType.equals(ECONOMY);
        if(!requiredClassType)
            throw new ClassNotAvailableException("Invalid Class Type");
    }
    public ClassTypes getAvailableClass() {
        return typeOfFlightClass;
    }

    public void validateSeatNumber(int seatNumber){
        if (seatNumber < 1 || seatNumber > numberOfSeat.length+1)
            throw new InvalidSeatNumber("Wrong Seat Number we only have limited seat Number");
    }

    private void isSeatAvailableForClassType(int seatNumber, ClassTypes classType) {
        validateSeatNumber(seatNumber);
        validateConfirmSeat(classType);
            if (classType.equals(FIRST_CLASS) && seatNumber <= 5) {
                numberOfSeat[seatNumber-1] = true;
                isThereSeatAvailableFor(classType);
                if(numberOfSeat[seatNumber - 1])
                    checkSeatSelection = true;
            }
            else if(classType.equals(ECONOMY) && seatNumber > 5 && seatNumber <= numberOfSeat.length) {
                 numberOfSeat[seatNumber-1] = true;
                 isThereSeatAvailableFor(classType);
                 if(numberOfSeat[seatNumber-1])
                    checkSeatSelection = true;
            }
            else
                throw new ClassNotAvailableException("Sorry Error Occurred\n Wrong Seat Assignment");
    }
    public boolean confirmSeat() {
        return checkSeatSelection;
    }

    public void assignSeatForPassenger(int seatNumber, String firstName,String lastName, ClassTypes classType){
        isSeatAvailableForClassType(seatNumber, classType);
        PassengerInfo passenger = new PassengerInfo(firstName,lastName);
        passengersOnSeat[seatNumber-1] = passenger;
    }

    public String getPassengerBySeatNumber(int seatNumber) {
        return passengersOnSeat[seatNumber-1].toString();}

    public String allPassengerOnSeat() {

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

    @Override
    public String toString() {
        PassengerInfo pass = null;
        int count = 0;
        for (PassengerInfo passenger:passengersOnSeat){
            count++;
            if(passenger != null)
                pass = passenger;
        }
        return String.format("%s%nClass-Type: %s%nSeat-Number: %d%n", pass, typeOfFlightClass, count);
    }
}
