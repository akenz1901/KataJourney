package chapterNine;

public interface Animal {
    default void move(){
        System.out.println("I can't move you must Implement me using a concrete class");
    }
    void speak();
}
