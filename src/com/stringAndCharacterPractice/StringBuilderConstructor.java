package com.stringAndCharacterPractice;

public class StringBuilderConstructor {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder(10);
        StringBuilder builder3 = new StringBuilder("Hello");

        System.out.println(builder);
        System.out.println(builder2);
        System.out.println(builder3);

        System.out.println(builder.capacity());
        System.out.println(builder2.capacity());
        System.out.println(builder3.capacity());
    }
}

