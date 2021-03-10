package chapterFour;

import java.util.Scanner;

public class AtmMachineM{
    public static void main(String[] args) {

        AtmMachineG newAtm = new AtmMachineG();
        Scanner userInput = new Scanner(System.in);

        System.out.println("""
                Welcome to Maven African Bank
                Please insert your card
                please create pin""");
        String userNeedsToCreatePin = userInput.next();
        newAtm.setPin(userNeedsToCreatePin);
        System.out.println("Your Pin is " + newAtm.getPin());
        boolean userDecidesIfTransactionHasEnded = true;
        while(userDecidesIfTransactionHasEnded){

            String transactionOptions = """
                    
                    ------------------------------
                    --> Enter 1 to Deposit        |
                    --> Enter 2 to Withdraw       |
                    --> Enter 3 to Transfer       |
                    --> Enter 4 to Recharge       |
                    --> Enter 5 to Change pin     |
                    --> Enter 6 to Check Balance  |
                    --> Enter 7 to End Transaction|
                    -------------------------------
                    """;
            System.out.println(transactionOptions);
            int transactionSelection = userInput.nextInt();

            switch (transactionSelection) {
                case 1 -> {
                    System.out.println("Enter amount to deposit: ");
                    double promptForUserToDeposit = userInput.nextDouble();
                    newAtm.deposit(promptForUserToDeposit);
//                    System.out.println("Your account has been credited with: " + promptForUserToDeposit+
//                            "\n---------------------");
                }
                case 2 -> {
                    System.out.println("Enter pin");
                    String userNeedsToEnterPinForPinConfirmation = userInput.next();
                    System.out.println("Enter amount to withdraw");
                    double withdrawal = userInput.nextInt();
                    newAtm.withdraw(withdrawal, userNeedsToEnterPinForPinConfirmation);
//                    System.out.println("Balance is: " + newAtm.getBalance()+ "\n---------------------");
                }
                case 3 -> {
                    System.out.println("Enter pin to continue");
                    String userNeedsToEnterPinForPinConfirmation = userInput.next();
                    System.out.println("Enter 10 Digits account number to transfer to");
                    String accountNumber = userInput.next();
                        System.out.println("""
                                Select bank to transfer to
                                1. Gtbank
                                2. EcoBank
                                3. First Bank
                                5. FCMB
                                6. Stanbic IBTC
                                7. Wema Bank
                                8. UBA""");
                    String bankTypeSelection = userInput.next();
                    System.out.println("Enter amount to transfer");
                    double userNeedsToTransfer = userInput.nextDouble();
                    newAtm.transfer(userNeedsToTransfer, userNeedsToEnterPinForPinConfirmation);
//                    System.out.println("Balance is:" + newAtm.getBalance());
                }
                case 4 -> {
                    System.out.println("Enter pin to continue");
                    String userShallBeAuthorisedForThisTransaction = userInput.next();
                    System.out.println("""
                            1: Press  to pay for your NEPA bill
                            2: Press 2 to buy airtime
                            """);
                    int rechargeCategories = userInput.nextInt();
                    switch (rechargeCategories) {
                        case 1 -> {
                            System.out.println("Enter your Electronic number to recharge");
                            String userMayNeedToEnterPaymentNumber = userInput.next();
                            System.out.println("Enter amount to recharge");
                            double paymentAmount = userInput.nextDouble();
                            newAtm.recharge(paymentAmount, userShallBeAuthorisedForThisTransaction);
                        }
                        case 2 -> {
                            System.out.println("Enter number to recharge");
                            String mobileNumber = userInput.next();
                            System.out.println("Select Network:\n1. 9mobile\n2. MTN\n3. Glo\n4. Airtel");
                            int userNetwork = userInput.nextInt();
                            System.out.println("Enter amount to recharge");
                            double rechargeAmount = userInput.nextDouble();
                            newAtm.recharge(rechargeAmount, userShallBeAuthorisedForThisTransaction);
                        }
                        default -> System.out.println("Pls Select the right Option");
                    }
                        }
                        case 5 -> {
                            System.out.println("Enter Current Pin");
                            String oldPin = userInput.next();
                            System.out.println("Enter New Pin:");
                            String newPin = userInput.next();
                            newAtm.changePin(newPin,oldPin);
//                            System.out.println("Your New Pin Is " + newAtm.getPin());
                            }
                        case 6 -> System.out.printf("Your Available Balance is %.2f", newAtm.getBalance());
                        case 7 -> {
                            System.out.println("Thank You for choosing Maven African Bank");
                            userDecidesIfTransactionHasEnded = false;
                            }
                        default -> System.out.println("Wasiu Behave Normal Na");
                         }
                    }
    }
}