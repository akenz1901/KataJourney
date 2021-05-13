package chapterSix;

public class MaximumNumber {

    public static double maximum(double firstNum, double secondNum, double thirdNum) {

        double maximum = firstNum;

        if (firstNum > maximum) {
            maximum = thirdNum;

        } else if (secondNum > maximum) {
            maximum = secondNum;

        }
        return maximum;
    }
}
