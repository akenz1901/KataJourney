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
        this.day = day;
        this.month = month;
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
    private void validatingDay(int day){
        boolean validateDay = day > 0 && day <= 31;
        if(!validateDay)throw new IllegalArgumentException("Pls enter a valid day");
    }
    private void validatingMonth(int month){
        boolean validateMonth = month > 0 && month <= 12;
        if(!validateMonth) throw new IllegalArgumentException("Pls enter a valid month");
    }
    private void validatingYear(int year){
        boolean validateYear = year >= 2021 && year <= 2023;
        if(!validateYear) throw new IllegalArgumentException("Pls enter a valid year");
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() { return year;}
}