package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AtmMachineTest {
    @Test
    void atmPowerNeedsToBeOn(){
        //given
        AtmMachine newAtm = new AtmMachine();
        //assert
        assertTrue(newAtm.powerOn(1));
    }
    @Test
    void pinMustBeCreatedBeforeAnyTransaction(){
        AtmMachine akenzPin =  new AtmMachine();
        akenzPin.createPin(1111);
        assertEquals(1111, akenzPin.pin());
    }
    @Test
    @DisplayName("Account Balance is Needed")
    void thereMustBeAnAvailableBalance(){
        AtmMachine uniqueBalance = new AtmMachine();
        uniqueBalance.balance(1000);
        assertEquals(1000, uniqueBalance.availableBalance());
    }

    @Test
    void withdrawalShallBeEffective(){
    AtmMachine michaelBalance = new AtmMachine();
    michaelBalance.balance(4000);
    michaelBalance.createPin(1111);
    michaelBalance.withdraw(2200,1111);

    assertEquals(1800, michaelBalance.availableBalance());
    }
    @Test
    void nowNegativeWithdrawalShallOccur(){
        AtmMachine wasiuWithdrawal = new AtmMachine();
        wasiuWithdrawal.createPin(1212);
        wasiuWithdrawal.withdraw(-3000,1212);
        assertEquals(wasiuWithdrawal.availableBalance(), 0);
    }
    @Test
    void atmMachineShouldNotAllowWithdrawalIfPinIsNotCorrect(){
        AtmMachine akenzPin = new AtmMachine();
        akenzPin.balance(4000);
        akenzPin.createPin(1234);
        akenzPin.withdraw(3000,1234);
        assertEquals(akenzPin.availableBalance(),1000);
    }
    @Test
    void atmMachineShallTransferFundToAnotherAccount(){
        AtmMachine tundePos = new AtmMachine();
        tundePos.balance(10000);
        tundePos.createPin(1222);
        tundePos.transfer(10000, 1222);

        assertEquals(tundePos.availableBalance(), 0);
    }
    @Test
    void atmMachineShallNotAllowNegativeTransfer() {
        AtmMachine tundePos = new AtmMachine();
        tundePos.createPin(1222);
        tundePos.transfer(-9000, 1222);
        assertEquals(tundePos.availableBalance(), 0);

    }
}
