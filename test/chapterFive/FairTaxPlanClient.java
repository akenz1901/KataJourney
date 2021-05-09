package chapterFive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FairTaxPlanClient {

    @Test
    void fairTaxCanBeCalculated(){
        FairTaxPlanTax fair = new FairTaxPlanTax(2003, 833, 3344, 4433);

        assertEquals(2440.9900000000002, fair.getFairTaxExpense());

    }

    public static void main(String... args) {
        FairTaxPlanTax fair = new FairTaxPlanTax();

        fair.calculateExpense(0);
        System.out.println(" Your fair tax bill is " + fair.getFairTaxExpense());
    }
}
