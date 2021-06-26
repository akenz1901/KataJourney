package chapterNine.studentPrototype;

public class Student {

    private final String firstName;
    private final String lastName;
    private final String programme;
    private final int level;
    private final String school;
    private int totalCourseUnit;

    public Student(String firstName, String lastName, String programme, int studentLevel, String schoolName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.programme = programme;
        level = studentLevel;
        school = schoolName ;
    }

    public void setTotalCourseUnit(int totalCourseUnit){
        this.totalCourseUnit = totalCourseUnit;
    }
    public int getTotalCourseUnit(){
        return totalCourseUnit;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getLevel() {
        return level;
    }

    public String getSchool() {
        return school;
    }

    public String getProgramme() {
        return programme;
    }

    public int calculateTotalCourseFee(){
        int courseFee = 2000;
        return getTotalCourseUnit() * courseFee;
    }

    public String toString(){
        System.out.printf("%s%n", getSchool());
        return String.format("First Name-> %s%nLast Name-> %s%nProgramme-> %s%nLevel-> %dL%nSchool Fee-> %s",
                getFirstName(), getLastName(), getProgramme(),getLevel(), calculateTotalCourseFee());
    }
}
