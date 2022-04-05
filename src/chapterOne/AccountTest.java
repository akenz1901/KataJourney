package chapterOne;

import java.util.Scanner;

public class AccountTest {
   public static void main(String[] args){
       Scanner input  =  new Scanner(System.in);

       //TODO Setting an initial balance and name
       Account mercyAccount = new Account("Michael Bolton", 80.78);

       System.out.print("Enter your age: ");
       int age = input.nextInt();
       mercyAccount.setAge(age);

       System.out.print("Pls deposit something: ");
       double amount = input.nextDouble();
       mercyAccount.deposit(amount);

       System.out.print("Pls deposit something again: ");
       amount = input.nextDouble();
       mercyAccount.deposit(amount);

       System.out.print("Enter withdrawal amount: ");
       amount = input.nextDouble();
       mercyAccount.withdraw(amount);
       System.out.printf("Account Name: is %s%nand Customer Age: is %d%nAccount balance is: %.2f%n",
               mercyAccount.getName(), mercyAccount.getAge(), mercyAccount.getBalance());

      }
}
