package polymophism;

public class Main {
    public static void main(String[] args) {
        Animal aja = new Dog();
        Object ruby = new Dog();
        Animal cat = new Cat();

        ruby = new Dog();
        ruby = 1;
        ruby = "";
        ruby = true;

        ruby = new Cat();
        aja.move();
    }
}
