package chapterSix;

import tdd.Time;

public class CarParkCalculator {

    private int hour;
    private double charges;

    public CarParkCalculator(){
        charges = 2.0;
    }
    public void enterHowManyHours(int hour) {
        int minimumHour = 3;
        Time time = new Time();
        time.setHour(hour);
        this.hour = hour;
        if(hour > minimumHour && hour != 24){
            hour -= minimumHour;
            charges = 0.54 * hour + 2.0;
            System.out.println("Your Charges are");
        }
        else if (hour == 24){
            charges = 10;
            System.out.println("Your charges are");
        }
    }
    public double calculateCharges(){
        return charges;
    }
    public int getHour(){
        return hour;
    }
}
