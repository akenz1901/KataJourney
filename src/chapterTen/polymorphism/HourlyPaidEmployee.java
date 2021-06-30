package chapterTen.polymorphism;

public class HourlyPaidEmployee extends Employee{

    private double wage;
    private double hourlyPay;

    public HourlyPaidEmployee(String firstName, String lastName, String IdNumber, double wage, double hourlyPay){
        super(firstName, lastName, IdNumber);

        validateWage(wage);
        validateHourly(hourlyPay);
        this.hourlyPay = hourlyPay;
        this.wage = wage;
    }

    public void setWages(double wage){
        validateWage(wage);
        this.wage = wage;
    }
    public void setHourlyPay(double hourlyPay){
        validateHourly(hourlyPay);
        this.hourlyPay = hourlyPay;
    }
    public double getWage(){
        return wage;
    }
    public double getHourlyPay(){
        return hourlyPay;
    }
    private static void validateWage(double wage){
        if(wage < 0.0)
            throw new IllegalArgumentException("Pls Enter a Valid digit");
    }
    private static void validateHourly(double hourlyPay){
        if(hourlyPay > 120 && hourlyPay < 0)
            throw new IllegalArgumentException("You can't enter");
    }

    @Override
    public double getPaymentAmount() {
        if (getHourlyPay() <= 40)
            return getHourlyPay() * getWage();
        else
            return 40 * getWage() + (getHourlyPay() - 40) * getWage() * 1.5;
    }
    @Override
    public String toString(){
        return String.format("Hourly employee: %s%n%.2f%n%.2f", super.toString(), getWage(), getHourlyPay());
    }
}
