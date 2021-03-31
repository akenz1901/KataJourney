package tdd;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void validateTime(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);

    }
    private void validateHour(int hour){
        boolean hourISValid = hour >0 && hour <=24;
        if(!hourISValid) throw new IllegalArgumentException("Hour is Invalid");
    }
    private void validateMinute(int minute){
        boolean minuteIsValid = minute >0 && minute <=60;
        if(!minuteIsValid) throw new IllegalArgumentException("Minute is Invalid");
    }
    private void validateSecond(int second){
        boolean secondIsValid = second >0 && second <=60;
        if(!secondIsValid) throw new IllegalArgumentException("Second is Invalid");
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
