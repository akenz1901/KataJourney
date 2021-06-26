package chapterNine.studentPrototype;

public class UnderGraduateStudent extends Student{

    private long matricNumber;

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
    public int calculateTotalCourseFee(){
        int courseFee = 3000;
        return getTotalCourseUnit() * courseFee;
    }
    @Override
    public String toString() {
        String numberSign = "NOU";
        return String.format("%s%nMatric Number-> %s%s", super.toString(), numberSign, matricNumber);
    }
}
