package tdd;

public class AtmMachine {
    private double mainBalance;
    private String pin;
    public void createPin(String newPin) {
        pin = newPin;
    }
    public boolean powerOn(int powerButton) {
        return powerButton == 1;
    }
    public void withdraw(double withdrawal, String pin) {
        if(withdrawal < 0 || withdrawal>mainBalance){
            System.out.println("Insufficient Fund");
            if(!this.pin.equals(pin))
                System.out.println("Invalid Pin");
            withdrawal = 0;
        }
        mainBalance = mainBalance - withdrawal;
    }
    public double availableBalance() {
        return mainBalance;
    }

    public  void balance(double balance) {
        if(balance > 0 )
        mainBalance = balance + mainBalance;
    }

    public String pin() {
        return pin;
    }

    public void transfer(double newTransfer, String exactPin) {
        if(newTransfer < 0) {
            newTransfer = 0;
            System.out.println("Insufficient Fund");
        }
        else if(newTransfer > 0 ){
            mainBalance = mainBalance - newTransfer;
            System.out.println("Transaction Successful");
        }
        if(exactPin.equals(pin))
            mainBalance = mainBalance - newTransfer;
            else
            System.out.println("Invalid Pin");
    }
    public void setNewPin(String changePin){
        pin = changePin;
    }

    public void payUtilityBillsAndBuyAirtime(double bill, String pin){
        if(bill > 0 && this.pin.equals(pin)) {
            mainBalance = mainBalance - bill;
        }
        if(!this.pin.equals(pin))
            System.out.println("Invalid Pin");
        if(bill < 0)
            System.out.println("Insufficient Fund");
    }


}
