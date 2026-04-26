abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();
        d1.sound();
    }
}