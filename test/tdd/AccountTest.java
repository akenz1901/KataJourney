package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    @Test
    void account_canReceiveDeposit() {
        //given
        MyAccount account = new MyAccount();
        //when
        account.deposit(2500.00);
        //assert
        double balance = account.getBalance();
        assertEquals(2500.00, balance);
    }
    @Test
    @DisplayName("Money can be deposited twice Test")
    void depositTwice_accountBalance(){

        MyAccount account = new MyAccount();
        account.deposit(2500.00);
        account.deposit(2500.00);
        assertEquals(5000, account.getBalance());
    }
    @Test
    @DisplayName("Account should not receive negative")
    void accountCanNotReceiveNegative(){
        MyAccount account = new MyAccount();
        account.deposit(-45555);
        assertEquals(0, account.getBalance());
    }

    @Test
    void moneyCanBeWithdrawnFromAccountWithValidPinTest(){
        MyAccount AkenzAccount = new MyAccount();
        AkenzAccount.deposit(7000);
        AkenzAccount.setPin(1111);

        AkenzAccount.withdraw(2000,1111);


        assertTrue(AkenzAccount.getBalance()==5000);
    }
    @Test
    void moneyShouldNotWithdrawIfPinNotCorrect(){
        MyAccount AkenzAccount = new MyAccount();
        AkenzAccount.deposit(7000);
        AkenzAccount.setPin(1111);

        AkenzAccount.withdraw(2000,1211);
        assertTrue(AkenzAccount.getBalance()==7000);
    }
    }
