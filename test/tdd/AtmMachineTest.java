package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AtmMachineTest {
    AtmMachine newAtm;
        @BeforeEach
        void doAllForAllTest() {
            newAtm = new AtmMachine();
        }


        @Test
        void atmPowerNeedsToBeOn() {
            //given
            //assert
            assertTrue(newAtm.powerOn(1));
        }
        @Test
        void pinMustBeCreatedBeforeAnyTransaction () {
            newAtm.createPin("1111");
            assertEquals("1111", newAtm.pin());
        }
        @Test
        @DisplayName("Account Balance is Needed")
        void thereMustBeAnAvailableBalance () {
            newAtm.balance(1000);
            assertEquals(1000, newAtm.availableBalance());
        }

        @Test
        void withdrawalShallBeEffective () {
            newAtm.balance(4000);
            newAtm.createPin("1111");
            newAtm.withdraw(2200, "1111");

            assertEquals(1800, newAtm.availableBalance());
        }
        @Test
        void nowNegativeWithdrawalShallOccur () {
            newAtm.createPin("1212");
            newAtm.withdraw(-3000, "1212");
            assertEquals(newAtm.availableBalance(), 0);
        }
        @Test
        void atmMachineShouldNotAllowWithdrawalIfPinIsNotCorrect () {
            newAtm.balance(4000);
            newAtm.createPin("1234");
            newAtm.withdraw(3000, "1234");
            assertEquals(newAtm.availableBalance(), 1000);
        }
        @Test
        void atmMachineShallTransferFundToAnotherAccount () {
            newAtm.balance(10000);
            newAtm.createPin("1222");
            newAtm.transfer(10000, "1222");

            assertEquals(newAtm.availableBalance(), 0);
        }
        @Test
        void atmMachineShallNotAllowNegativeTransfer () {
            newAtm.createPin("1222");
            newAtm.transfer(-9000, "1222");
            assertEquals(newAtm.availableBalance(), 0);

        }
        @Test
        @DisplayName("User should be able to change pin")
        void changingOfPin(){
            newAtm.setNewPin("1118");
            assertEquals("1118",newAtm.pin());
        }

}
