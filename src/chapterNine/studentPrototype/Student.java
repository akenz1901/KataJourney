package chapterNine.studentPrototype;

public class Student {

    protected String firstName;
    protected String lastName;
    protected String programme;
    protected int level;
    protected String school;

    public Student(String firstName, String lastName, String programme, int studentLevel, String schoolName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.programme = programme;
        level = studentLevel;
        school = schoolName ;
    }

    public String toString(){
        System.out.printf("%s%n", school);
        return String.format("First Name-> %s%nLast Name-> %s%nProgramme-> %s%nLevel-> %dL", firstName, lastName, programme,level);
    }
}
