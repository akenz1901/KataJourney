package chapterTen;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String IDcardNumber, double weeklySalary) {
        super(firstName, lastName, IDcardNumber);

        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Enter a valid amount");

        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary){
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Enter a valid amount");

        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("%s%nWeekly Earnings $%.2f", super.toString(), getWeeklySalary());
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }
}
