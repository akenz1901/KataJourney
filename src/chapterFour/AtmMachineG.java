package chapterFour;

public class AtmMachineG{

    private String pin;
    private double balance;

    public void setPin(String newPin) {
        pin = newPin;
        System.out.println("Pin Set Successfully");
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("You have Just been credited with %.2f ", amount);
        }
        else if(amount <0 || amount == -0){
            System.out.println("Oops!! Wrong Input");
        }
    }
    public void withdraw(double cash, String pin) {
        if (cash > 0 && cash < balance && this.pin.equals(pin)) {
            System.out.println("Your Withdrawal Was Successful");
            balance = balance - cash;
        }
        else if (balance < cash) {
            System.out.println("Insufficient Fund");
        }
        else if(cash <= -0){
            System.out.println("Oops!! Wrong Amount Input");
        }
            if (!this.pin.equals(pin)) {
                System.out.println("Invalid Pin\nTry Again!!!");
        }
    }

    public void transfer(double wire, String pin) {
        if (wire > 0.0 && wire < balance && this.pin.equals(pin)) {
            balance = balance - wire;
            System.out.println("Your Transfer of "+ wire + " was Successful");
        }
        else if(wire > balance) {
            System.out.println("Insufficient Fund!!!");
        }
        else if(wire <= -0){
            System.out.println("Oops!!! Wrong Amount Input");
        }
            if(!this.pin.equals(pin)){
            System.out.println("Invalid Pin\nTry Again!!!");
        }
    }

    public void recharge(double bills, String pin) {
        if (bills > 0.0 && bills < balance && this.pin.equals(pin)) {
            balance -= bills;
            System.out.println("Recharge Was Successful");
        }
            else if(bills > balance) {
            System.out.println("Insufficient Fund!!!");
        }
        else if(bills <= -0){
            System.out.println("Oops!! Wrong Amount Input");
        }
            if (!this.pin.equals(pin))
                System.out.println("Invalid Pin\nTry Again!!!");

    }
    public void changePin(String changePin,String oldPin) {
        if(pin.equals(oldPin)) {
            pin = changePin;
            System.out.println("Pin Successfully Changed\nKeep Your Pin Safe");
        }
          else
            System.out.println("Incorrect Current Pin");
    }

}
