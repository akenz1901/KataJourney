package chapterOne;

public class Account {
    private String name;
    private int age;
    private double balance;

    public Account(String name, double balance){
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void deposit(double amount){
        if (amount > 0)
            balance = balance + amount;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(double amount){
        if(amount > 0)
            if(amount <= balance)
                balance = balance - amount;
    }

}
