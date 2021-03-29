package tdd;

import java.util.ArrayList;

public class Bank {
    private int createAccountNumber;
    ArrayList<Account> accounts = new ArrayList<>();
//
//        public void createAccountName(String firstName, String lastName){
//        accountName = firstName + lastName;
//    }
//    public String getAccountName() {
//        accountName = Account.getAccountInfo();
//        return accountName;
//    }
    public void generateAccountNumber(int accountNumber){
        accounts.add(accountNumber, (null));
        createAccountNumber = accountNumber;
}
    public int getAccountNumber() {
        return createAccountNumber;
    }


}
