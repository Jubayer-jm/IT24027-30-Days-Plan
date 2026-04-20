Date : 20/04/2025

Day #01

Topic : Class, Object, Properties, Methods, Inheritance + Encapsulation + Polymorphism

Source Code :https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%201

Video : https://www.youtube.com/watch?v=s2hoJkIz3RQ

Example #01

// Code 1: Class, Object, Properties, Methods

class Student {
    // Properties (Attributes)
    String name;
    int age;

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Assigning values
        s1.name = "Jadid";
        s1.age = 20;

        // Calling method
        s1.displayInfo();
    }
}


Example #02

// Code 2: Inheritance, Encapsulation, Polymorphism

class Animal {

    // Encapsulation (private variable)
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