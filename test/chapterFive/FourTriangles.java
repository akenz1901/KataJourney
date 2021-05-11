package chapterFive;

import org.junit.jupiter.api.Test;

public class FourTriangles {
    @Test
    void fourTrianglesCanBePrinted(){
        int asterisk = 1, asterisks = 10;
        int space = 12, space2 = 5;

        for (int generalCounter = 0; generalCounter < 10; generalCounter++){

            for(int a = 0; a < asterisk ; a++){
                System.out.print("*");
            }
            for(int tSpace = 0; tSpace < space; tSpace++){
                System.out.print(" ");
            }
            for (int b = 0; b < asterisks ; b++){
                System.out.print("*");
            }
            for (int tSpace = 0; tSpace < space2; tSpace++){
                System.out.print(" ");
            }
            for (int c = 0; c < asterisks; c++){
                System.out.print("*");
            }
            for (int tSpace = 0; tSpace < space; tSpace++){
                System.out.print(" ");
            }
            for (int d = 0; d < asterisk; d++){
                System.out.print("*");
            }
            asterisk++; asterisks--; space--; space2+=2;
            System.out.println();
        }
    }
}
