package chapterNine;

import chapterNine.studentPrototype.UnderGraduateStudent;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    void underGraduateStudent_cannot_be_null(){
        UnderGraduateStudent student = new UnderGraduateStudent("Michael", "Olashile",
                "Computer Science", 400, "University Of Lagos");
        student.generateMatricNumber(146582839);
        System.out.print(student);
    }

}
