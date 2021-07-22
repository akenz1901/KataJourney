package com.stringAndCharacterPractice;

public class InsertMethod {
    public static void main(String[] args) {
        Object objectRef = "man";
        String str = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 100000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        StringBuilder buffer = new StringBuilder();
        buffer.insert(0, objectRef);
        buffer.insert(0, " ");
        buffer.insert(0, str);
        buffer.insert(0, " ");
        buffer.insert(0, charArray);
        buffer.insert(0, " ");
        buffer.insert(0, charArray, 3, 3);
        buffer.insert(0, " ");
        buffer.insert(0, booleanValue);
        buffer.insert(0, " ");
        buffer.insert(0, characterValue);
        buffer.insert(0, " ");
        buffer.insert(0, integerValue);
        buffer.insert(0, " ");
        buffer.insert(0, longValue);
        buffer.insert(0, " ");
        buffer.insert(0, floatValue);
        buffer.insert(0, " ");
        buffer.insert(0, doubleValue);
        System.out.printf("buffer after inserts:%n%s%n%n", buffer.toString());
    }
}
