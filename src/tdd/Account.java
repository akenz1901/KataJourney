package tdd;

public class Account {
    private final String accountName;
    private final int accountNumber;

    public Account(String firstName, String secondName, int accountNumber){
        accountName = firstName + secondName;
        this.accountNumber = accountNumber;
    }
    public String getAccountInfo(){
        return accountName;
    }
    public int getAccountNumber(){
        return accountNumber;
    }



}
