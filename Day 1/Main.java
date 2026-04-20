class Animal {

    // Encapsulation 
    private String name;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Method
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Inheritance
class Dog extends Animal {

    // Polymorphism (method overriding)
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        // Using encapsulation
        d1.setName("Tommy");

        System.out.println("Dog Name: " + d1.getName());

        // Polymorphism
        d1.sound();
    }
}