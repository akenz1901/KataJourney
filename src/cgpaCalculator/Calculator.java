package cgpaCalculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator{
    private double cgpa;
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course){
        courses.add(course);
    }
    public void calculateCgpa(){
        int totalCourseUnit = 0;
        for (Course course:courses) {

        }
    }
    public List<Course> getAllCourses(){
        return courses;
    }
}
