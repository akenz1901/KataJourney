package chapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionExample {

    public static void performPreferenceException(){
        Scanner sc = new Scanner(System.in);
        boolean maintainSystemTermination = true;

        do {
            try {
                System.out.print("Enter an integer numerator: ");
                int numerator = sc.nextInt();
                System.out.print("Enter an integer denominator: ");
                int denominator = sc.nextInt();

                System.out.print(numerator + " / " + denominator + "=" + quotient(numerator, denominator));
                maintainSystemTermination = false;
            }
            catch (InputMismatchException inputMismatchException){
                System.out.println(inputMismatchException.getMessage());
                sc.nextLine();
            }
            catch (ArithmeticException arithmeti){
                System.err.println(arithmeti.getMessage());

            }
        }while (maintainSystemTermination);
    }
    public static int quotient(int num, int num2) throws ArithmeticException{
        return  num/num2;
    }
    public static void main(String[] args) {
        performPreferenceException();
    }

}
