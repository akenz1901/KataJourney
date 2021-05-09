package chapterFive;

public class TaxPlanTax {

    //Todo get me my call
    private static int simCardSlot;

    public static int getSimCardSlot() {
        return simCardSlot;
    }

    public static void setSimCardSlot(int simCardSlot) {
        TaxPlanTax.simCardSlot = simCardSlot;
    }








    public static void main(String[] args) {
        TaxPlanTax.setSimCardSlot(1);
        TaxPlanTax like = new TaxPlanTax();
//        like.setSeimCardSlot(1);
        //This will not work
        //Because you don't all instance to have different simCard Slot.
    }
}
