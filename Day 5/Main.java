class Animal {

    String name = "Animal";

    void eat() {
        System.out.println(name + " is eating");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        // Inherited method
        d1.eat();

        // Overridden method
        d1.sound();
    }
}