package tdd;

import chapterFour.ClassTypes;

public class AirlineReservation {

    private ClassTypes typeOfFlightClass;
    private boolean checkSeatSelection;
    private final boolean []numberOfSeat = new boolean[10];

    public void isThereSeatAvailableFor(ClassTypes classType) {
        if (!classType.equals(ClassTypes.BUSINESS))
            typeOfFlightClass = classType;

    }
        public ClassTypes getAvailableClass () {
            return typeOfFlightClass;
        }

        public void isSeatAvailableForClassType(int seatNumber, ClassTypes classType) {
            for (int counter = 1; counter < 5; counter++) {
                if (classType.equals(ClassTypes.FIRST_CLASS) && seatNumber <= 5 && seatNumber > 0) {
//                    numberOfSeat = new boolean[]{true, true, true, true, true, false, false, false, false, false};
                    numberOfSeat[seatNumber-1] = true;
                    checkSeatSelection = true;
                }
                for(int newCounter = 5; newCounter < numberOfSeat.length ; newCounter++) {
                    if (classType.equals(ClassTypes.ECONOMY) && seatNumber >= 6 && seatNumber <=numberOfSeat.length) {
//                        numberOfSeat = new boolean[]{false, false, false, false, false, true, true, true, true, true,};
                        numberOfSeat[seatNumber] = true;
                        checkSeatSelection = true;
                        break;
                    }
                }
            }
        }
        public boolean assignSeat(){

        return checkSeatSelection;
        }
    }
