package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    Bank mavens;
    @BeforeEach
    void startThisBeforeEachTest(){
        mavens = new Bank();
    }
    @Test
    void bankAccountCanBeCreated(){
        mavens.generateAccountNumber(1);
        assertEquals(19293, mavens.getAccountNumber());
    }

}
