package com.EasyScannerTest;

import com.scannerForMyJobs.EasyScanner;
import org.junit.jupiter.api.Test;

public class EasyScannerTest {


    public static void main(String[] args) {
        int num;
        System.out.println("Enter an Integer: ");
        num = EasyScanner.nextInt() * 2;

        System.out.println(num);

        double newNumber;
        System.out.println("Enter an Integer: ");
        newNumber = EasyScanner.nextDouble() * 2;

        System.out.println(newNumber);
    }
    @Test
    void myIntScannerCanBeTested(){
    }
}
