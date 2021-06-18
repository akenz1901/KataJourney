package tdd;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this(0,0,0);
    }

    public Date(int day){
        this(day, 0, 0);
    }

    public Date(int day, int month){
        this(day,month,0);
    }
    public Date(int day, int month, int year){
        validatingDay(day);
        this.day = day;
        validatingMonth(month);
        this.month = month;
        validatingYear(year);
        this.year = year;
    }
    public void setDate(int day, int month, int year) {
        validateDate(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
    }
    private void validateDate(int day, int month, int year){
        validatingDay(day);
        validatingMonth(month);
        validatingYear(year);
    }
    private static void validatingDay(int day){
        boolean validateDay = day > 0 && day <= 31;
        if(!validateDay)throw new IllegalArgumentException("Pls enter a valid day");
    }
    private static void validatingMonth(int month){
        boolean validateMonth = month > 0 && month <= 12;
        if(!validateMonth) throw new IllegalArgumentException("Pls enter a valid month");
    }
    private static void validatingYear(int year){
        boolean validateYear = year >= 1800 && year <= 2023;
        if(!validateYear) throw new IllegalArgumentException("Pls enter a valid year");
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() { return year;}

    @Override
    public String toString() {
        return String.format("2%d 2%d %d", day, month, year);
    }
}
