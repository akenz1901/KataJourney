package polymophism;

public class Main {
    public static void main(String[] args) {
        Animal aja = new Dog();
        Object ruby = new Dog();
        Animal cat = new Cat();
        Animal eranko = new Animal();


        ruby = new Dog();
        ruby = 1;
        ruby = "";
        ruby = true;

        ruby = new Cat();
        aja.move();
        cat.move();
        eranko.move();
    }
}
