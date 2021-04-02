package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank mavens;
    @BeforeEach
    void startThisBeforeEachTest(){
        mavens = new Bank();
    }
    @Test
    void bankAccountCanBeCreated(){
        assertNotNull(mavens);
    }
    @Test
    void account_CanBeCreated(){
        mavens.createAccountNumber(1,0);
        assertEquals(1, mavens.getAccount());
    }
    @Test
    void account_CanBeCreatedTwice(){
        mavens.createAccountNumber(1,0);
        assertEquals(1,mavens.getAccount());

        mavens.createAccountNumber(2,0);
        assertEquals(2,mavens.getAccount());
    }
    @Test
    void bank_canDepositIntoAccount(){
        mavens.deposit(1000);
        mavens.createAccountNumber(1,1000);
        assertEquals(1, mavens.getAccount());
        assertEquals(1000, mavens.getBalance());
    }
}
