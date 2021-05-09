package chapterFive;

import java.util.Scanner;

public class FairTaxPlanTax {

    private double fairTax;

    public FairTaxPlanTax(){
    }
    public FairTaxPlanTax(int housing, int transportation, int food, int healthCare){
        int sum = housing + transportation + food + healthCare;
        fairTax = sum * 0.23;
    }

    public void calculateExpense(int expense){
        Scanner sc = new Scanner(System.in);
        int housing = 0;
        int food = 0;
        int healthCare = 0;
        int transportation = 0;
        int vacations = 0;

        int count = 0;
        while(count < 5){
            if (count == 0){
                System.out.println("Enter Housing Expense");
                expense = sc.nextInt();
                housing = expense;
            }
            if (count == 1){
                System.out.println("Enter Food Expense");
                expense = sc.nextInt();
                food = expense;
            }
            if (count == 2){
                System.out.println("Enter healthCare Expense");
                expense = sc.nextInt();
                healthCare = expense;
            }
            if (count == 3){
                System.out.println("Enter TFare Expense");
                expense = sc.nextInt();
                transportation = expense;
            }
            if (count == 4){
                System.out.println("Enter vacation Expense");
                expense = sc.nextInt();
                vacations = expense;
            }
            count++;
        }
        int sum = healthCare + food + vacations + transportation + housing;
        fairTax = sum * 0.23;
    }

    public double getFairTaxExpense() {
        return fairTax;
    }
}
