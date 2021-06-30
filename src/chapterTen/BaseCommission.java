package chapterTen;

public class BaseCommission extends CommissionEmployee{

    private double baseSalary;

    public BaseCommission(String firstName, String lastName, String IDcardNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, IDcardNumber, grossSales, commissionRate);

        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    private static void validateBaseSalary(double baseSalary){
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("No negative value is allowed");
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + getBaseSalary();
    }

    @Override
    public String toString() {
        return String.format("Base Salaried: %s%nBase-Salary:%f",super.toString(), getBaseSalary());
    }
}
