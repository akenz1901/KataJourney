package chapterEight;

import org.junit.jupiter.api.Test;
import tdd.Date;

public class StudentTest {

    @Test
    void studentInfoTest(){
        Date date = new Date(24,3, 2013);
        StudentInfo student = new StudentInfo("Mercy", "Olashile", date);

        System.out.println(student);
    }
}
