package chapterFour;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner collector = new Scanner(System.in);
        int totalScore = 0;
        int score = 0;
        int totalNumberOfInputCollected = 0;

        while (totalNumberOfInputCollected <3) {
                System.out.print("Enter Average number: ");
                score = collector.nextInt();
                totalScore = totalScore + score;
                    }
        double average = totalScore / totalNumberOfInputCollected * 1.0;
        System.out.print(totalScore);
    }
}
