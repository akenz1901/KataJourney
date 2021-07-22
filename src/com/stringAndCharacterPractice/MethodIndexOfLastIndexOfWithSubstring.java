package com.stringAndCharacterPractice;

public class MethodIndexOfLastIndexOf {
    public static void main(String... michael) {
        String alphabet = "abcdefghijklmabcdefghijklm";

        System.out.println("'a' is located at " + alphabet.indexOf("a"));

        System.out.println("'a' is located at " + alphabet.indexOf("a", 1));

        System.out.println("'z' is located at " + alphabet.indexOf("z"));

        System.out.println("The last 'a' is located at " + alphabet.lastIndexOf("f"));

        System.out.println("The last 'a' is located at " + alphabet.lastIndexOf("f", 25));

        System.out.println("The last 'a' is located at " + alphabet.lastIndexOf("t"));

        System.out.println("The new String from an existing alphabet string is " + alphabet.substring(15));
        System.out.println("The new String from an existing alphabet string is " + alphabet.substring(3, 10));

    }
}
