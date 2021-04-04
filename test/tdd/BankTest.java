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
        mavens.createAccountNumber(1, 6000);
        assertEquals(1, mavens.getAccount());
    }
    @Test
    void account_CanBeCreatedTwice(){
        mavens.createAccountNumber(1, 5000);
        assertEquals(1,mavens.getAccount());

        mavens.createAccountNumber(2, 4000);
        assertEquals(2,mavens.getAccount());
    }
    @Test
    void bank_canDepositIntoAccount(){
        mavens.deposit(1000);
        mavens.createAccountNumber(1, 1000);
        assertEquals(1, mavens.getAccount());
        assertEquals(1000, mavens.getBalance());
    }
    @Test
    void bank_canDepositIntoSeparateAccounts(){
        mavens.deposit(3000);
        mavens.createAccountNumber(2, 3000);
        assertEquals(2, mavens.getAccount());
        assertEquals(3000, mavens.getBalance());

        mavens.deposit(2000);
        mavens.createAccountNumber(4, 2000);
        assertEquals(4, mavens.getAccount());
        assertEquals(2000, mavens.getBalance());
        System.out.println(mavens.getBalance());

    }
    @Test
    void bank_cannotDepositNegativeAmount(){
        mavens.deposit(-4000);
        mavens.createAccountNumber(2, 0);
        assertEquals(2, mavens.getAccount());
        assertEquals(0, mavens.getBalance());
    }
}
