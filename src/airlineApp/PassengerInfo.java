package airlineApp;

public class PassengerInfo {
    private String firstName;
    private String lastName;
    private String passengerDestination;

    public PassengerInfo(){
    }
    public PassengerInfo(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PassengerInfo(String firstName, String lastName, String destination){
        this.firstName = firstName;
        this.lastName = lastName;
        boolean isNameValid = this.firstName != null && this.lastName!=null;
        if(isNameValid)
        this.passengerDestination = destination;
    }

    public String getDestination(){
        return passengerDestination;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){return lastName;}

    @Override
    public String toString() {
        return String.format("%s %s", getFirstName(), getLastName());
    }
}

//    public PassengerInfo(String destination){
//        passengerDestination = destination;
//    }
