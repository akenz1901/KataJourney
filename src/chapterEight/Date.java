package chapterEight;

public class Date {
    private int day;
    private int month;
    private int year;

    public void setDate(int day, int month, int year) {
        boolean validateDay = day > 0 & day < 32;
        if(validateDay){ this.day = day; }

        boolean validateMonth = month > 0 & day <= 12;
        if(validateMonth) { this.month = month; }

        boolean validateYear = year >= 2021 & year <= 2023;
        if(validateYear) { this.year = year; }
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
