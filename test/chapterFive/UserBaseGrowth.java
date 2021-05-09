package chapterFive;

public class UserBaseGrowth {

    public static String calculateBaseGrowth(){
        double currentNumberOfUser = 1000000000.0;
        double interestRate = 0.04;
        int numOfMonth = 1;
        double baseGrowth;

            baseGrowth = currentNumberOfUser * Math.pow(1.0 + interestRate, numOfMonth);



        return String.format("%d,%.2f", numOfMonth, baseGrowth);
    }

    public static void main(String[] args) {
        System.out.print(UserBaseGrowth.calculateBaseGrowth());
    }
}
