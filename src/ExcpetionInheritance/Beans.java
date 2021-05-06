package ExcpetionInheritance;

public class Beans {
    private final int quantity;

    public Beans(String akin, double elo, int amount){
        quantity = (int) elo/amount;

    }

    @Override
    public String toString() {
        String alaye = "want to buy beans";
        alaye+= quantity + "Spoons of beans";
        return  alaye;
    }
}
