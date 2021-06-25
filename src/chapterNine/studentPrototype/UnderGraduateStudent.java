package chapterNine.studentPrototype;

import java.security.SecureRandom;

public class UnderGraduateStudent extends Student{

    private long matricNumber;

    private final String numberSign = "NOU";
    public UnderGraduateStudent(String firstName, String lastName, String programme,
                                int studentLevel, String schoolName){
        super(firstName, lastName, programme, studentLevel, schoolName);
    }

    public void generateMatricNumber(long number){
        matricNumber = number;
    }
    public long getMatricNumber(){
        return matricNumber;
    }

    @Override
    public String toString() {

        return String.format("%s%nMatric Number-> %s%s", super.toString(), numberSign, matricNumber);
    }
}
