package com.stringAndCharacterPractice;

public class StringMethodsCharGetCharLength{

    public static void main(String[] args) {
        String words = "Hello There";
        char[] extractedChar = new char[5];

        System.out.println(words);
        System.out.print("The reverse chars are: ");
        for (int i = words.length() -1; i >=0 ; i--) {
            System.out.printf("%s", words.charAt(i));
        }
        words.getChars(6, 11, extractedChar, 0);
        System.out.println();
        System.out.print("The extracted chars are:");
        for (int i = 0; i < extractedChar.length; i++) {
            System.out.printf("%s", extractedChar[i]);
        }
    }

}
