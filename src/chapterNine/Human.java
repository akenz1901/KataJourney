package chapterNine;

import chapterNine.Animal;

public class Human implements Animal {
    @Override
    public void move() {
        System.out.println("I walk and run like an human");
    }

    @Override
    public void speak() {
    }
}
