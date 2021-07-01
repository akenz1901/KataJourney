package chapterTen.polymorphism;

import chapterTen.Interfaces.Payable;

public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String IDcardNumber;

    public Employee(String firstName, String lastName, String IDcardNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDcardNumber = IDcardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIDcardNumber() {
        return IDcardNumber;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%n Last Name: %s%n Identity Number: %s", getFirstName(), getLastName(), getIDcardNumber());
    }
//    public abstract double earnings();
    //Abstract method must be overridden by concrete subclass.
}
