package com.stringAndCharacterPractice;

public class OtherStringMethods {

    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "WEALTH";
        String string3 = "   blessing";

        System.out.println("String string1 = " + string1.toUpperCase());
        System.out.println("String string2 = " + string2.toLowerCase());
        System.out.println("String string2 = " + string2.replace('A', 'a'));
        System.out.println("String string3 = " + string3.trim());
        System.out.println(string3.trim().toCharArray());


        char [] charArray = {'w', 'e', ' ', 'b', 'e', 'l', 'i', 'e', 'v', 'e'};
        char single = 'Y';
        int number = 89;
        long longNum = 200000000L;
        float decimalNum = 4.8f;
        boolean isItActive = false;
        double longDecimal = 3.567;
        Object str = "Hello Bro";

        System.out.println("Value of charArray is " + String.valueOf(charArray));
        System.out.println("Value of charArray is " + String.valueOf(charArray, 3, 0));
        System.out.println("Value of number is " + String.valueOf(number));
        System.out.println("Value of long is " + String.valueOf(longNum));
        System.out.println("Value of float is " + String.valueOf(decimalNum));
        System.out.println("Value of boolean is " + String.valueOf(isItActive));
        System.out.println("Value of double is " + String.valueOf(longDecimal));
        System.out.println("Value of Class Object is " + String.valueOf(str));



    }
}
