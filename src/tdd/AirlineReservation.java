
package tdd;

import chapterFour.ClassTypes;

public class AirlineReservation {

    private ClassTypes typeOfFlightClass;
    private boolean checkSeatSelection;
    private final boolean[] numberOfSeat = new boolean[10];
    private String passengerNames;
    PassengerInfo passengerInfo = new PassengerInfo();

    public void isThereSeatAvailableFor(ClassTypes classType) {
        if (!classType.equals(ClassTypes.BUSINESS))
            typeOfFlightClass = classType;

    }

    public ClassTypes getAvailableClass() {
        return typeOfFlightClass;
    }

    public void isSeatAvailableForClassType(int seatNumber, ClassTypes classType) {
        for (int counter = 0; counter < 5; counter++) {
            if (classType.equals(ClassTypes.FIRST_CLASS) && seatNumber <= 5 && seatNumber >= 0) {
                numberOfSeat[seatNumber-1] = true;
                typeOfFlightClass = classType;
                checkSeatSelection = true;
            }
            for (int newCounter = 5; newCounter < numberOfSeat.length; newCounter++) {
                if (classType.equals(ClassTypes.ECONOMY) && seatNumber > 5 && seatNumber <= numberOfSeat.length) {
                    numberOfSeat[seatNumber] = true;
                    typeOfFlightClass = classType;
                    checkSeatSelection = true;
                    break;
                }
            }
        }
    }
    public boolean assignSeat() {
        return checkSeatSelection;
    }

    public void passengerInfo(String firstName,String lastName) {
        passengerInfo.passengerName(firstName,lastName);
    }
    public String getPassengerNames(){
        return passengerNames = passengerInfo.getNames();
    }

    public void passengerDestination(String location) {
        if(passengerNames!=null)
            if(checkSeatSelection=true)
                passengerInfo.createPassengerDestination(location);

    }

    public String getPassengerDestination() {
        return passengerInfo.getPassengerDestination();
    }
}
