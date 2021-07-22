package com.stringAndCharacterPractice;

public class UsingStartWithAndEndWith {
    public static void main(String[] args) {
        String[] elements = {"begin", " beginning", "end", "ending"};

        for (String element : elements) {

            if (element.startsWith("beg")) {
                System.out.println("1: It's there ooo");
            } else
                System.out.println("1: Not Valid");
            if (element.startsWith("egin", 1)){
                System.out.println("2: It's there oo");
            }
            else
                System.out.println("it's not there");

            if (element.endsWith("nd")){
                System.out.println("We Got One");
            }
            else
                System.out.println("It doesn't end with nd");
        }
    }
}
