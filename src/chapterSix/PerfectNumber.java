package chapterSix;

public class PerfectNumber {
    boolean divisor;

    public void isPerfect(int number){
        int sum;
        int newSum;
        for(int counter = 1; counter <= 1000; counter++){
            sum = counter + counter;
            newSum = 1;

            System.out.print(sum / number + " ");

            if(sum == number && sum % number == 0){
                newSum++;
                divisor = true;
                System.out.println(newSum);
                break;
            }
        }
    }
    public boolean getPerfect(){
        return divisor;
    }
}
