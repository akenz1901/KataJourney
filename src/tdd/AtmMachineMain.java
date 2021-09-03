package tdd;

import java.util.Scanner;

public class AtmMachineMain {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        AtmMachine machine = new AtmMachine();
        machine.powerOn(1);
        System.out.println("Create A Pin: ");
        String newPin = sc.nextLine();
        machine.createPin(newPin);
        machine.pin();

    }
}
