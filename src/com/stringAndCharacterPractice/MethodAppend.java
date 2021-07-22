package com.stringAndCharacterPractice;

public class MethodAppend {
    public static void main(String[] args) {
        Object objectRef = "man";
        String str = "goodbye";
        char[] charArray = {'a', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 100000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        StringBuilder lastBuffer = new StringBuilder("last buffer");
        StringBuilder buffer = new StringBuilder();
        buffer.append(objectRef).append("\n").append(str)
                .append("\n").append(charArray).append("\n").append(charArray, 0, 3)
                .append("\n").append(booleanValue).append("\n").append(characterValue)
                .append("\n").append(integerValue).append("\n").append(longValue).append("\n")
                .append(floatValue).append("\n").append(doubleValue).append("\n").append(lastBuffer);
        System.out.printf("buffer contains\n%s\n", buffer.toString());
    }
}
