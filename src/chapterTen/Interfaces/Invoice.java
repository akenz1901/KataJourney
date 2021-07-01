package chapterTen.Interfaces;

public class Invoice implements Payable{

    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription,
                   int quantity, double pricePerItem) {

        validateQuantity(quantity);
        validatePriceOfEachItem(pricePerItem);
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    private static void validateQuantity(int quantity){
        if(quantity < 0)
            throw new IllegalArgumentException("Quantity must not be negative");
    }
    private static void validatePriceOfEachItem(double pricePerItem){
        if(pricePerItem < 0.0)
            throw new IllegalArgumentException("negative value not accepted");
    }

    public void setQuantity(int quantity) {
        validateQuantity(quantity);
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        validatePriceOfEachItem(pricePerItem);
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    @Override
 public String toString()
{ return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }

}
