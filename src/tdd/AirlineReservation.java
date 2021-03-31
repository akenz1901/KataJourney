
package tdd;

import chapterFour.ClassTypes;

import java.util.ArrayList;
import java.util.List;

public class AirlineReservation {

    private ClassTypes typeOfFlightClass;
    private boolean checkSeatSelection;
    private final boolean[] numberOfSeat = new boolean[10];
    private ArrayList <PassengerInfo> passengerSeat = new ArrayList<>();

    public void isThereSeatAvailableFor(ClassTypes classType) {
        if (classType.equals(ClassTypes.FIRST_CLASS) | classType.equals(ClassTypes.ECONOMY))
            typeOfFlightClass = classType;

    }

    public ClassTypes getAvailableClass() {
        return typeOfFlightClass;
    }

    public void isSeatAvailableForClassType(int seatNumber, ClassTypes classType) {
        for (int counter = 0; counter < 5; counter++) {
            if (classType.equals(ClassTypes.FIRST_CLASS) && seatNumber <= 5 && seatNumber >= 0) { //
                numberOfSeat[seatNumber-1] = true;
                checkSeatSelection = true;
            }
            for (counter = 5; counter <=numberOfSeat.length; counter++) {
                if (classType.equals(ClassTypes.ECONOMY) && seatNumber > 5 && seatNumber <= numberOfSeat.length) { //
                    numberOfSeat[seatNumber] = true;
                    checkSeatSelection = true;
                    break;
                }
            }
        }
    }
    public boolean assignSeat() {
        return checkSeatSelection;
    }

    public void passengerInfo(String firstName, String lastName, String destination){
        PassengerInfo passenger = new PassengerInfo(firstName, lastName, destination);
        passengerSeat.add(passenger);
        
    }
    public List<PassengerInfo> getPassenger(){

        return passengerSeat;
    }

}
