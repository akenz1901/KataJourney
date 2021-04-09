package tdd;

public class Bank {

    private int accountID;
    private double balance;
    private double [] accounts= new double[10];

    public void createAccountNumber(int accountNumber, double balance) {
        for(int counter=1; counter<accounts.length; ) {
            if(accountNumber != 0)
            accountID = accountNumber;
            accounts[accountNumber] = balance;
            System.out.println(accounts[accountNumber]);
            break;
        }
    }
    public int getAccount() {
        return accountID;
    }

    public void deposit(int deposit) {
        if(deposit>0)
        balance+=deposit;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(int withdraw) {
        balance-=withdraw;
    }
}
