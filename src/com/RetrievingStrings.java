package com;

import java.util.Arrays;

public class RetrievingStrings {
    public static String getName() {
        String name = "michael";
        char [] newName = new char[5];
        for (int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(i));
        }
        name.getChars(0,2, newName , 0);
        
        char goodTime = 0;
        for (char character:newName) {
            goodTime = character;
        }
        return Arrays.toString(newName) + "ke";
    }

    public static void main(String[] args) {
        System.out.println(getName());
    }
}
