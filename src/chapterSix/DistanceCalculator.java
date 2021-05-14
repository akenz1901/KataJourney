package chapterSix;

public class DistanceCalculator {

    public static double distance(double x, double y, double x2, double y2){

        double slope = x - (x2);
        double angle = y - (y2);

        return Math.sqrt(slope + angle);
    }

}
