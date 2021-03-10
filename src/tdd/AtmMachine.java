package tdd;

public class AtmMachine {
    double mainBalance;
    int pin;

    public void createPin(int newPin) {
        pin = newPin;
    }
    public boolean powerOn(int powerButton) {
        if(powerButton == 1) {
            return true;
        }
        if(powerButton == 0) {
            return false;
        }
        return false;
    }
    public void withdraw(double withdrawal, int pin) {
        if(withdrawal < 0 || withdrawal>mainBalance){
            System.out.println("Insufficient Fund");
            if(this.pin != pin)
                System.out.println("Invalid Pin");
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
        if(newTransfer < 0 || newTransfer > mainBalance){
            newTransfer = 0;
            System.out.println("Insufficient Fund");
        }
        if(exactPin == pin)
            mainBalance = mainBalance - newTransfer;
            else
            System.out.println("Invalid Pin");

        mainBalance = mainBalance - newTransfer;
    }
    public void setNewPin(int changePin){
        pin = changePin;
    }
    public void payUtilityBills(double bill, int pin){
        if(bill > 0 || this.pin == pin) {
            mainBalance = mainBalance - bill;
        }
        if(this.pin != pin)
            System.out.println("Invalid Pin");
        if(bill < 0)
            System.out.println("Insufficient Fund");
    }
    void buyAirtime(double airtime, int pin){
        if(airtime <= 1000 || airtime >0) {
            mainBalance = mainBalance - airtime;
        }else if (airtime > mainBalance) {
            System.out.println("Insufficient Fund");
        }
            if(this.pin == pin)
            mainBalance = mainBalance - airtime;
            else
                System.out.println("Invalid Pin");
    }
}
