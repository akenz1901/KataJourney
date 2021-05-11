package chapterFive;

import org.junit.jupiter.api.Test;

public class Pythagoras {

    @Test
    void calculateThePythagoras(){
        int pythagorasLimit = 500;
        int counter = 1;
        for(int firstSide = counter; firstSide <= pythagorasLimit; firstSide++){
            for (int secondSide = counter; secondSide <= pythagorasLimit; secondSide++){
                for (int hypotenus = counter; hypotenus <= pythagorasLimit; hypotenus++){
                    double result = firstSide * firstSide + secondSide * secondSide;
                    if (result == hypotenus * hypotenus){
                        System.out.printf("%d, %d, %d",firstSide,secondSide,hypotenus);
                        System.out.println(result);
                    }
                }
            }
        }
    }
}
