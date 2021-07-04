package chapterTen;

import chapterTen.Interfaces.Invoice;
import chapterTen.Interfaces.Payable;
import chapterTen.polymorphism.SalariedEmployee;
import org.junit.jupiter.api.Test;

public class TestPayable {

    @Test
    void testInterfacePolymorphism(){
        Payable [] payableObject = new Payable[4];

        payableObject[0] = new Invoice("01234", "seat", 2, 375.00);payableObject[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObject[1] = new Invoice("12936", "tire", 6, 79.00);payableObject[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObject[2] = new SalariedEmployee("John", "Smith", "F134-485-85", 490.00);
        payableObject[3] = new SalariedEmployee("Lisa", "Barnes", "D127-494-72", 3000.00);

        for (Payable payer: payableObject) {
            System.out.printf("%s%n%.2f%n", payer.toString(), payer.getPaymentAmount());
        }
    }
}
