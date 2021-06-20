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
    static double percent; //1
    int offset = 10, base= 50; //2
    public static double calc(double value) {
        var coupon = 0;
                var offset = 0;
        var base = 0; //3
        if(percent <10){ //4
            coupon = 15;
            offset = 20;
            base = 10;
        }
        return coupon*offset*base*value/100; //5
    }
    public static void main(String[] args) {
        System.out.println(calc(100));
    }

}
