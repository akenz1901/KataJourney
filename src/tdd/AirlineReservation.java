
package tdd;

import chapterFour.ClassTypes;

public class AirlineReservation {

    private ClassTypes typeOfFlightClass;
    private boolean checkSeatSelection;
    private PassengerInfo passenger;
    private final boolean[] numberOfSeat = new boolean[10];


//    public AirlineReservation(ClassTypes typeOfFlightClass, boolean checkSeatSelection, PassengerInfo passenger, String passengerNames) {
//        this.typeOfFlightClass = typeOfFlightClass;
//        this.checkSeatSelection = checkSeatSelection;
//        this.passenger.passengerName("hdhf","dhff",null);
//    }

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
        passenger.passengerName(firstName, lastName, destination);
    }
    public PassengerInfo getPassenger(){
        return toString(passenger.getFullName());
    }

    private PassengerInfo toString(String fullName) {
        return passenger;
    }
}
