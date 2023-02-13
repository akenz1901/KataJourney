package tipCalculator;

public class TipCalculator {

    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double calculateAmountWith18Per(){
        return amount * 0.18;
    }
    public double calculateAmountWith20Per(){
        return amount * 0.18;
    }
}
