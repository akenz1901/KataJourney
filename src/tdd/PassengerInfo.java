package tdd;

public class PassengerInfo {
    private String firstName;
    private String lastName;
    private String passengerDestination;

    public void passengerName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getNames(){
        return firstName + lastName;
    }
    public void createPassengerDestination(String destination){
        passengerDestination = destination;
    }
    public String getPassengerDestination(){
        return passengerDestination;
    }

}
