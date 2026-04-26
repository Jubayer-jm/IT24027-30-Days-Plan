class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a;

        // Parent reference, child object
        a = new Dog();

        // Runtime decides which method runs
        a.sound();
    }
}