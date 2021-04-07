package tdd;

public class Candidate {
    private String name;
    private School school;

    public Candidate(String name, School school){
        this.name = name;
        this.school = school;
    }

    public School getSchool() {
        return school;
    }
    public String getName(){
        return name;
    }
}
