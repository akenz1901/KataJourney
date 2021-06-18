package chapterEight;

import tdd.Date;

public class StudentInfo {
    private final String firstName;
    private final String lastName;
    private final Date dateOfBirth;

    public StudentInfo(String firstName, String lastName, Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString(){
        return String.format("FullName: %s %s%n Date Of Birth: %s", firstName, lastName, dateOfBirth);
    }
}
