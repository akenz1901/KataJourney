package chapterEight;

import tdd.Date;

public class StudentInfo {
    private final String firstName;
    private final String lastName;
    private final Date dateOfBirth;
    private static int count;

    public StudentInfo(String firstName, String lastName, Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        ++count;
    }

    public String toString(){
        return String.format("FullName: %s %s%n Date Of Birth: %s", firstName, lastName, dateOfBirth);
    }

    public static int getNumberOfEmployee(){
        return count;
    }

}
