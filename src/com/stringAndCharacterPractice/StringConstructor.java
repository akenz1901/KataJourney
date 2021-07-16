package com.stringAndCharacterPractice;

public class StringConstructor {
    public static void main(String[] args) {
        char[] letters = {'h', 'e', 'l', 'l', 'o', ' ', 'm', 'i', 'c', 'h', 'a', 'e', 'l'};
        String school = "Unilag";

        String sObject = new String(letters);
        String newObject = new String(letters, 6, 7);
        String referencingObject = new String(school);

        System.out.printf("%s%n%s%n%s%n", sObject, newObject, referencingObject);
    }
}
