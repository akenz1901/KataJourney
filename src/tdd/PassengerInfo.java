package tdd;

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
    public PassengerInfo(String destination){
        passengerDestination = destination;
    }
    public PassengerInfo(String firstName, String lastName, String destination){
        this.firstName = firstName;
        this.lastName = lastName;
        boolean isNameValid = this.firstName != null && this.lastName!=null;
        if(isNameValid)
        this.passengerDestination = destination;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public String getDestination(){
        return passengerDestination;
    }



}
