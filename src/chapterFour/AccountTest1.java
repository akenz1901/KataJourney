package chapterFour;

public class AccountTest1{

	public static void main(String... args){

	Account1 firstAccount = new Account1(" Michael", 70.00);
	Account1 secondAccount = new Account1("Chibuzor", 90.00);
	
	double depositAmount = 17.9;
	firstAccount.deposit(depositAmount);
	secondAccount.deposit(depositAmount);

	System.out.printf("%s balance $%.2f%n",  firstAccount.getName(), secondAccount.getBalance());
	System.out.printf("%s balance $%.2f%n",  secondAccount.getName(), firstAccount.getBalance());

	}
}