package chapterFour;

public enum ClassTypes {
    FIRST_CLASS,ECONOMY,BUSINESS;
}
















//            for (int counter = 0; counter < 5; counter++) {
//                if (!numberOfSeat[counter])
//                    numberOfSeat[counter] = true;
//                classType.equals(ClassTypes.FIRST_CLASS);
//                }
//                for(int newCounter = 5; newCounter <=10 ; newCounter++) {
//                    if (classType.equals(ClassTypes.ECONOMY)){
//                        numberOfSeat[newCounter] = true;
//                        break;
//                }
//            }
//        }


//    private final boolean []numberOfSeat = {true, true, false, true, true, true, true, true, true,true};
//        switch (classType) {
//            case FIRST_CLASS:
//
//                for (int counter = 0; counter < 5; counter++) {
//                    if (!numberOfSeat[counter]) {
//
//                    }
//                }
//                break;
//            case ECONOMY:
//                for (int counter = 5; counter < 10; counter++) {
//                    if (!numberOfSeat[counter]) {
//                    }
//                }
//                break;
//        }
//public void bookedTicketForAPassenger(ClassTypes classType, int seatNumber, PassengerInfo passenger) {
//    for (int counter = 0; counter < 5; counter++) {
//        if (classType.equals(ClassTypes.FIRST_CLASS) && seatNumber <= 5 && seatNumber >= 0) {
//                        numberOfSeat = new boolean[]{false, false, false, false, false, true, true, true, true, true,};
//            numberOfSeat[seatNumber - 1] = true;
//            checkSeatSelection = true;
//            boardingTicket = passenger;
//        }
//        for (int newCounter = 5; newCounter < numberOfSeat.length; newCounter++) {
//            if (classType.equals(ClassTypes.ECONOMY) && seatNumber >= 6 && seatNumber <= numberOfSeat.length) {
//                    numberOfSeat = new boolean[]{true, true, true, true, true, false, false, false, false, false};
//                numberOfSeat[seatNumber] = true;
//                checkSeatSelection = true;
//                boardingTicket = passenger;
//                break;
//            }
//        }
//    }
//}