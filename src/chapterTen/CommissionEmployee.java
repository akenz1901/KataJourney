package chapterTen;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String IDcardNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, IDcardNumber);

        validateGross(grossSales);
        validateCommissionRate(commissionRate);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    private static void validateGross(double grossSales){
        if(grossSales < 0)
            throw new IllegalArgumentException("Gross sales must nor be negative");
    }
    private static void validateCommissionRate(double commission){
        if(commission <= 0 || commission >= 1.0)
            throw new IllegalArgumentException("Commission must be greater than or less than 0");
    }


    public double getGrossSales() {

        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        validateGross(grossSales);
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("Commission Employee: %s%n Commission: %.2f%nGrossSales: %f", super.toString(), getCommissionRate(), getGrossSales());
    }
}
