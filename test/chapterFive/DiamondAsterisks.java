package chapterFive;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class DiamondAsterisks {

    @Test
    void drawADiamond(){
        int space = 4;
        int oddAterisks = 1;
        int count = 0;
        for (; count < 5; count++){
            for (int spaceX = space; spaceX >0; spaceX--){
                System.out.print(" ");
            }
            for (int asterisks = 0; asterisks < oddAterisks ; asterisks++){
                System.out.print("*");
            }
            System.out.println();
            space--; oddAterisks = oddAterisks +2;
        }
        space = 4;
        oddAterisks = 1;
        for(count = 0; count<5 ; count++) {
            for (int spaceX = space; spaceX <=4 ; spaceX++) {
                System.out.print(" ");
            }
            for (int asterisks = oddAterisks; asterisks <= 7; asterisks++) {
                System.out.print("*");
            }
            System.out.println();
            space--; oddAterisks = oddAterisks +2;
        }
    }
    @Test
    void displayingDiamondWithTripleLoops(){
        int spaces = 9, star = 1, lines = 9;
        int div = lines/2+1;

        for (int i = 1; i <= lines; i++){
            for (int s = spaces; s > 0; s--){
                System.out.print(" ");
            }
            for (int a = star; a>0; a--){
                System.out.print("* ");
            }
            System.out.println();

            if(i < div){
                spaces -= 2; star+=2;
            }
            else if(i >= div){
                spaces += 2; star-=2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd Number: ");
        int lines = sc.nextInt();

        if (lines%2==1 && lines < 20 && lines != 1) {
            int spaces = 20, star = 1;
            int div = lines / 2 + 1;


            for (int i = 1; i <= lines; i++) {
                for (int s = spaces; s > 0; s--) {
                    System.out.print(" ");
                }
                for (int a = star; a > 0; a--) {
                    System.out.print("* ");
                }
                System.out.println();

                if (i < div) {
                    spaces -= 2;
                    star += 2;
                } else if (i >= div) {
                    spaces += 2;
                    star -= 2;
                }
            }
        }
        else if(lines == 1){
            System.out.println("Oops: pls enter an odd number greater than one");
        }
        else
            System.out.println("number is not an odd number");

    }
}
