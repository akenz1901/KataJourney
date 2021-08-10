package chapterNine;

public class Reptile implements Animal{
    @Override
    public void move() {
        System.out.println("We craw on the flow");
    }

    @Override
    public void speak() {
        System.out.println("We his like human");
    }
}
