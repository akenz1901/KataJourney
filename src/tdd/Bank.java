package tdd;

public class Bank {

    private int accountID;
    private double balance;
    private double [] accounts= new double[10];

    public void createAccountNumber(int accountNumber, double balance) {
        for(int counter=1; counter<accounts.length; ) {
            if(accountNumber != 0)
            accounts[accountNumber] = balance;
            this.balance = balance;
            System.out.println(accounts[accountNumber]);
            accountID = accountNumber;
            break;
        }
    }
    public int getAccount() {
        return accountID;
    }

    public void deposit(double deposit) {

        balance+=deposit;
    }

    public double getBalance() {
        return balance;
    }

}
