package tdd;

public class AtmMachine {
    double mainBalance;
    int pin;

    public void createPin(int newPin) {
        pin = newPin;
    }
    public boolean powerOn(int powerButton) {
        if(powerButton == 1){
            return true;
        }
        if (powerButton == 0) {
            return false;
        }
        return false;
    }
    public void withdraw(double withdrawal, int pin) {
        if(withdrawal < 0 || this.pin != pin) {
            withdrawal = 0;
        }
        mainBalance = mainBalance - withdrawal;
    }
    public double availableBalance() {
        return mainBalance;
    }

    public void balance(double balance) {
        if(balance > 0 )
        mainBalance = balance + mainBalance;
    }

    public int pin() {
        return pin;
    }

    public void transfer(double newTransfer, int exactPin) {
        if(newTransfer < 0){
            newTransfer = 0;
        }
        if(exactPin == pin)
        mainBalance = mainBalance - newTransfer;
    }
}
