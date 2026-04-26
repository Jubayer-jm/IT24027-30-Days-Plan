class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}

// Multilevel Inheritance
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {

        Puppy p1 = new Puppy();

        p1.eat();   // from Animal
        p1.bark();  // from Dog
        p1.weep();  // own method

        System.out.println("------");

        Cat c1 = new Cat();

        c1.eat();   // from Animal
        c1.meow();  // own method
    }
}