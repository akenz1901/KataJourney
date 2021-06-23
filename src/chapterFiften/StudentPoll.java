package chapterFiften;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class StudentPoll {

    private final int [] studentResponses = new int[20];

    private final int [] numberOfRatingOccurrence = new int[5];

    void rate(){
        Scanner studentsRates = new Scanner(System.in);

        for (int i = 0; i < studentResponses.length; i++) {
            System.out.print("Rate Your Vice Counsellor:");
            int rate = studentsRates.nextInt();
            studentResponses[i] = rate;
        }
    }
    void sumResponses(){
        for (int studentResponse : studentResponses) {
            try {
                ++numberOfRatingOccurrence[studentResponse];
            } catch (ArrayIndexOutOfBoundsException error) {
                System.out.printf("%d%n is out of bound ", studentResponse);
            }
        }
    }
    public void openAndWriteInTheFIle(){

        try(Formatter format = new Formatter("student_pol.txt")){
            format.format("%s%n%n","Survey For rating Your School Vice Counselor");
            format.format("%s %10s%n", "Rating", "NumberOfRepeatedVote");
            for (int rates = 1; rates < numberOfRatingOccurrence.length; rates++) {
                format.format("%5d%10d%n", rates, numberOfRatingOccurrence[rates]);
            }
        }
        catch (FileNotFoundException error){
            System.out.println(error.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int [] responses = {2,2,5,4,5,3,1,5,1,3,4,5,3,3,4,2,3,4,5,2};

        int[] frequency = new int[6];

        for (int answer = 0; answer < responses.length; answer++) {
            try{
                frequency[responses[answer]] = frequency[responses[answer]] + 1;
                Thread.sleep(1000);
            }
            catch (ArrayIndexOutOfBoundsException  outOfBoundsException){
                System.out.println(outOfBoundsException.getMessage());
                System.out.printf(" responses[%d] = %d%n%n", answer, responses[answer]);
            }
//            System.out.printf("%s%10s%n", "Rating", "Frequency");
//            for (int rating = 1; rating < frequency.length; rating++) {
//                System.out.printf("%6d%10d%n", rating, frequency[rating]);
//                Thread.sleep(1000);
//            }
        }
    }
}
