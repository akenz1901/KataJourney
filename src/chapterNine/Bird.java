package chapterNine;

import chapterNine.Animal;

public class Bird implements Animal {
    @Override
    public void move() {
        System.out.println("I fly like a bird");
    }

    @Override
    public void speak() {
        System.out.println("I speak like human");
    }
}
