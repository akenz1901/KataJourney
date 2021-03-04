package tdd;

public class MyAccount {
    private double balance;
    private int pin;

    public void deposit(double amount) {
        if(amount > 0)
        balance = balance + amount;
    }

    public double getBalance() {

        return balance;
    }

    public void setPin(int newPin) {
        pin = newPin;

    }

    public void withdraw(double withdrawal, int pin) {
        if(pin == this.pin)
        balance = withdrawal - balance;
    }
}