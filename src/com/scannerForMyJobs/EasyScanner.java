package com.scannerForMyJobs;

import java.util.Scanner;

public class EasyScanner {
    private static Scanner scanner = new Scanner(System.in);

    public static int nextInt(){
        return scanner.nextInt();
    }
    public static double nextDouble(){
        return scanner.nextDouble();
    }
    public static String nextLine(){
        return scanner.nextLine();
    }
    public static char nextChar(){
        return scanner.next().charAt(0);
    }

}
