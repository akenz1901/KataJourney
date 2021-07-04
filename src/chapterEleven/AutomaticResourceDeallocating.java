package chapterEleven;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class AutomaticResourceDeallocating {
    public static void main(String[] args) {
        try(Formatter newFormat = new Formatter("newTest.txt"); Scanner sc = new Scanner("PlayerTest.txt")){
            newFormat.format("Hello Working ith File Little");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
