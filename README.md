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
Date : 21/04/2025

Day #02

Topic : Access Modifiers (public, private, protected, default), Non-Access Modifiers (static, final, abstract)

Source Code :https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%202

Video : https://www.youtube.com/watch?v=lWFzm8qIR1c

Example #01

// Code 1: Access Modifiers Example

class Student {

public String name;        // Public (anywhere access)
private int age;           // Private (only inside class)
protected String school;   // Protected (same package + subclass)
String city;               // Default (same package)

// Setter for private variable
public void setAge(int age) {
    this.age = age;
}

// Getter for private variable
public int getAge() {
    return age;
}

public void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("School: " + school);
    System.out.println("City: " + city);
}
}

public class Main { public static void main(String[] args) {

    Student s1 = new Student();

    s1.name = "Jadid";     // public
    s1.setAge(20);         // private via setter
    s1.school = "XYZ School"; // protected
    s1.city = "Dhaka";     // default

    s1.display();
}
}

Example #02

// Code 2: static, final, abstract Example

abstract class Shape {

// Abstract method (must be implemented)
abstract void draw();

// Static method
static void info() {
    System.out.println("This is Shape class");
}
}

class Circle extends Shape {

final double PI = 3.1416; // Final (constant)

double radius;

Circle(double radius) {
    this.radius = radius;
}

// Implement abstract method
void draw() {
    System.out.println("Drawing Circle");
    double area = PI * radius * radius;
    System.out.println("Area: " + area);
}
}

public class Main { public static void main(String[] args) {

    // Static method call
    Shape.info();

    Circle c1 = new Circle(5);
    c1.draw();
}
}

Date : 22/04/2025

Day #03

Topic : Encapsulation (Basic Example), Encapsulation + Access Modifiers (Full Example)

Source Code :https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%203
Video : https://www.youtube.com/watch?v=HZUUYnIZO_0

Example #01

// Code 1: Encapsulation Example

class BankAccount {

// Private variable (hidden data)
private double balance;

// Setter method (deposit money)
public void deposit(double amount) {
    if (amount > 0) {
        balance = balance + amount;
    }
}

// Getter method (check balance)
public double getBalance() {
    return balance;
}
}

public class Main { public static void main(String[] args) {

    BankAccount acc = new BankAccount();

    acc.deposit(1000); // add money

    System.out.println("Balance: " + acc.getBalance());
}
}

Example #02

// Code 2: Encapsulation + Access Modifiers

class Student {

private String name;     // private
private int age;         // private

public String university;    // public
protected String city;   // protected
String country;          // default

// Setter
public void setName(String name) {
    this.name = name;
}

public void setAge(int age) {
    if (age > 0) {
        this.age = age;
    }
}

// Getter
public String getName() {
    return name;
}

public int getAge() {
    return age;
}

// Method
public void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("University: " + university);
    System.out.println("City: " + city);
    System.out.println("Country: " + country);
}
}

public class Main { public static void main(String[] args) {

    Student s1 = new Student();

    // Using setters
    s1.setName("Khalid");
    s1.setAge(23);

    // Direct access (allowed ones)
    s1.university = "MBSTU";
    s1.city = "Tangail";
    s1.country = "Bangladesh";

    s1.display();
}
}

Day #04

Topic : Default / No-Argument Constructor, Parameterized Constructor

Source Code : https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%204

Video : https://www.youtube.com/watch?v=acfR5vRTZvc

Example #01

class Student {

String name;
int age;

// No-argument constructor
Student() {
    name = "jubayer";
    age = 23;
}

void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}
}

public class Main { public static void main(String[] args) {

    // Constructor automatically called
    Student s1 = new Student();

    s1.display();
}
}

Example #02

// Code 2: Parameterized Constructor

class Car {

String color;
int speed;

// Parameterized constructor
Car(String c, int s) {
    color = c;
    speed = s;
}

void display() {
    System.out.println("Color: " + color);
    System.out.println("Speed: " + speed);
}
}

public class Main { public static void main(String[] args) {

    // Passing values during object creation
    Car c1 = new Car("Red", 120);
    Car c2 = new Car("Blue", 100);

    c1.display();
    System.out.println("------");
    c2.display();
}
}

Date : 24/04/2025

Day #05

Topic : Single Inheritance + Method Overriding, Multilevel + Hierarchical Inheritance

Source Code : https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%205

Video : https://www.youtube.com/watch?v=j_VA2Rp6jM0

Example #01

// Code 1: Single Inheritance

class Animal {

String name = "Animal";

void eat() {
    System.out.println(name + " is eating");
}

void sound() {
    System.out.println("Animal makes sound");
}
}

// Dog inherits Animal class Dog extends Animal {

// Method overriding
@Override
void sound() {
    System.out.println("Dog barks");
}
}

public class Main { public static void main(String[] args) {

    Dog d1 = new Dog();

    // Inherited method
    d1.eat();

    // Overridden method
    d1.sound();
}
}

Example #02

// Code 2: Multilevel and Hierarchical Inheritance

class Animal {

void eat() {
    System.out.println("Animal eats food");
}
}

// Multilevel Inheritance class Dog extends Animal {

void bark() {
    System.out.println("Dog barks");
}
}

class Puppy extends Dog {

void weep() {
    System.out.println("Puppy weeps");
}
}

// Hierarchical Inheritance class Cat extends Animal {

void meow() {
    System.out.println("Cat meows");
}
}

public class Main { public static void main(String[] args) {

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

Date : 25/04/2025

Day #06

Topic : Compile-Time Polymorphism (Method Overloading), Runtime Polymorphism (Method Overriding)

Source Code : https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%206
Video : https://www.youtube.com/watch?v=bLke13zY4rg&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=7

Example #01

// Code 1: Compile-Time Polymorphism (Method Overloading)

class MathOperation {

// Method 1
void add(int a, int b) {
    System.out.println("Sum = " + (a + b));
}

// Method 2 (same name, different parameters)
void add(int a, int b, int c) {
    System.out.println("Sum = " + (a + b + c));
}
}

public class Main { public static void main(String[] args) {

    MathOperation obj = new MathOperation();

    obj.add(5, 10);
    obj.add(5, 10, 15);
}
}

Example #02

// Code 2: Runtime Polymorphism (Method Overriding)

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

public class Main { public static void main(String[] args) {

    Animal a;

    // Parent reference, child object
    a = new Dog();

    // Runtime decides which method runs
    a.sound();
}
}

Date : 26/04/2025

Day #07

Topic : Abstraction using Abstract Class, Abstraction using Interface

Source Code :https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%207

Video : https://www.youtube.com/watch?v=1SXyi3DK-88&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=8

Example #01

// Code 1: Abstraction using Abstract Class

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

public class Main { public static void main(String[] args) {

    Dog d1 = new Dog();

    d1.eat();
    d1.sound();
}
}

Example #02

// Code 2: Interface Example

interface Vehicle {

// Abstract methods
void start();
void stop();
}

class Car implements Vehicle {

public void start() {
    System.out.println("Car starts");
}

public void stop() {
    System.out.println("Car stops");
}
}

public class Main { public static void main(String[] args) {

    Car c1 = new Car();

    c1.start();
    c1.stop();
}
}

Date : 27/04/2025

Day #08

Topic : Non-Static Inner Class, Static Nested Class

Source Code : https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%208

Video : https://www.youtube.com/watch?v=lsJ9QjJPbx8&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=9

Example #01

// Code 1: Non-Static Inner Class

class Outer {

String message = "Hello from Outer Class";

// Inner Class
class Inner {

    void showMessage() {

        // Access outer class variable
        System.out.println(message);
    }
}
}

public class Main { public static void main(String[] args) {

    // Create outer class object
    Outer obj = new Outer();

    // Create inner class object
    Outer.Inner in = obj.new Inner();

    in.showMessage();
}
}

Example #02

// Code 2: Static Nested Class

class Outer {

static String university = "ICT Department";

// Static nested class
static class Inner {

    void display() {

        // Access static member
        System.out.println("University: " + university);
    }
}
}

public class Main { public static void main(String[] args) {

    // No outer object needed
    Outer.Inner obj = new Outer.Inner();

    obj.display();
}
}
Date : 27/04/2025

Day #09

Topic : ArrayList + LinkedList, HashSet + HashMap

Source Code :https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%209

Video : https://www.youtube.com/watch?v=TDHaeHAlPFg&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=10

Example #01

import java.util.ArrayList; import java.util.List;

public class IT24013 {

public static void main(String[] args) {

    List<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");

    System.out.println("Fruits: " + fruits);

    String firstFruit = fruits.get(0);
    System.out.println("First fruit: " + firstFruit);
}
}

Example #02

import java.util.*;

public class IT24013 {

public static void main(String[] args) {

    // LinkedList
    LinkedList<String> animals = new LinkedList<>();
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Elephant");

    System.out.println("Animals: " + animals);

    // HashSet
    HashSet<String> colors = new HashSet<>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");
    colors.add("Red"); // duplicate

    System.out.println("Colors: " + colors);

    // HashMap
    HashMap<String, Integer> ageMap = new HashMap<>();
    ageMap.put("Alice", 30);
    ageMap.put("Bob", 25);
    ageMap.put("Charlie", 35);

    System.out.println("Age Map: " + ageMap);

    int age = ageMap.get("Alice");
    System.out.println("Alice's Age: " + age);
}
}

Date : 28/04/2025

Day #10

Topic : ArrayList Example, LinkedList Example

Source Code : https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%2010
Video : https://www.youtube.com/watch?v=q-5D9Z9BCVI&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=12

Example #01

import java.util.ArrayList;

public class IT24013 {

public static void main(String[] args) {

    // Create ArrayList
    ArrayList<String> fruits = new ArrayList<>();

    // Add elements
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");

    // Access element
    System.out.println("First fruit: " + fruits.get(0));

    // Remove element
    fruits.remove("Banana");

    // Print all elements
    System.out.println("Fruits List: " + fruits);
}
}

Example #02

import java.util.LinkedList;

public class IT24013 {

public static void main(String[] args) {

    // Create LinkedList
    LinkedList<String> colors = new LinkedList<>();

    // Add elements
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");

    // Access element
    System.out.println("First color: " + colors.get(0));

    // Remove element
    colors.remove("Green");

    // Print all elements
    System.out.println("Colors List: " + colors);
}
}
Day :11

Date : 29 - 04 - 2026

Topic : Sets : Queues in Java

Video Link : https://www.youtube.com/watch?v=PccU1wAdnlM\\\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\\\&index=13

Day :12

Date : 30 - 04 - 2026

Topic : Maps : HashMap & TreeMap

Video Link : https://www.youtube.com/watch?v=ZarOdaT7P2k\\\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\\\&index=14

Day #13

Date : 01 - 05 - 2026

Topic : Maps : Using collection in real world scenario

Video Link : https://www.youtube.com/watch?v=gtmBSl10DvY\\\&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj\\\&index=15
Date : 02/05/2025

Day #14

Topic : Library Management using ArrayList, Order Management using HashMap

Source Code :https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%2014

Video : https://www.youtube.com/watch?v=gtmBSl10DvY&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=15

Example #01

import java.util.ArrayList;

public class IT24013 {

private ArrayList<String> books;

// Constructor
public IT24013() {
    books = new ArrayList<>();
}

// Add book
public void addBook(String book) {
    books.add(book);
}

// Display books
public void displayBooks() {

    System.out.println("Books in the Library:");

    for(String book : books){
        System.out.println(book);
    }
}

public static void main(String[] args) {

    IT24013 myLibrary = new IT24013();

    myLibrary.addBook("The Great Gatsby");
    myLibrary.addBook("To Kill a Mockingbird");

    myLibrary.displayBooks();
}
}

Example #02

import java.util.HashMap;

public class IT24013 {

private HashMap<Integer, String> orders;

// Constructor
public IT24013() {
    orders = new HashMap<>();
}

// Add order
public void addOrder(int orderId, String customerName) {

    orders.put(orderId, customerName);
}

// Display orders
public void displayOrders() {

    System.out.println("Customer Orders:");

    for(int orderId : orders.keySet()) {

        System.out.println("Order ID: " +
                orderId +
                ", Customer Name: " +
                orders.get(orderId));
    }
}

public static void main(String[] args) {

    IT24013 orderManagement =
            new IT24013();

    orderManagement.addOrder(101, "Alice");
    orderManagement.addOrder(102, "Bob");

    orderManagement.displayOrders();
}
}

Date : 03/05/2025

Day #15

Topic : Write to File, Read from File

Source Code :https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%2015
Video : https://www.youtube.com/watch?v=63c8XmiOrzo&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=16

Example #01

import java.io.BufferedWriter; import java.io.FileWriter; import java.io.IOException;

public class IT24013 {

public static void main(String[] args) {

    try {

        FileWriter writer =
                new FileWriter("output.txt");

        BufferedWriter bufferedWriter =
                new BufferedWriter(writer);

        bufferedWriter.write("Hello, World!");
        bufferedWriter.newLine();

        bufferedWriter.write(
                "This is a Java file handling example.");

        bufferedWriter.close();

        System.out.println(
                "Data written to file successfully.");

    } catch (IOException e) {

        System.out.println(
                "An error occurred: " + e.getMessage());
    }
}
}

Example #02

import java.io.BufferedReader; import java.io.FileReader; import java.io.IOException;

public class IT24013 {

public static void main(String[] args) {

    try {

        FileReader reader =
                new FileReader("output.txt");

        BufferedReader bufferedReader =
                new BufferedReader(reader);

        String line;

        while((line = bufferedReader.readLine()) != null){

            System.out.println(line);
        }

        bufferedReader.close();

    } catch (IOException e) {

        System.out.println(
                "An error occurred: " + e.getMessage());
    }
}
}

Date : 04/05/2025

Day #16

Topic : Check File Exists, Write to File, Read from File

Source Code :https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%2016
Video : https://www.youtube.com/watch?v=63c8XmiOrzo&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=16&t=1s

Example #01

import java.io.File;

public class IT24013 {

public static void main(String[] args) {

    File myFile = new File("example.txt");

    // Check file exists
    if(myFile.exists()){

        System.out.println("File exists.");
    }
    else{

        System.out.println("File does not exist.");
    }
}
}

Example #02

import java.io.BufferedWriter; import java.io.FileWriter; import java.io.IOException;

public class IT24013 {

public static void main(String[] args) {

    try{

        FileWriter writer =
                new FileWriter("output.txt");

        BufferedWriter bufferedWriter =
                new BufferedWriter(writer);

        bufferedWriter.write("Hello, World!");
        bufferedWriter.newLine();

        bufferedWriter.write(
                "This is a Java file handling example.");

        bufferedWriter.close();

        System.out.println(
                "Data written successfully.");

    }
    catch(IOException e){

        System.out.println(
                "An error occurred: " +
                        e.getMessage());
    }
}
}

Example #03

import java.io.BufferedReader; import java.io.FileReader; import java.io.IOException;

public class IT24013 {

public static void main(String[] args) {

    try{

        FileReader reader =
                new FileReader("output.txt");

        BufferedReader bufferedReader =
                new BufferedReader(reader);

        String line;

        while((line =
                bufferedReader.readLine()) != null){

            System.out.println(line);
        }

        bufferedReader.close();
    }

    catch(IOException e){

        System.out.println(
                "An error occurred: " +
                        e.getMessage());
    }
}
}

Date : 05/05/2025

Day #17

Topic : Read Bytes from File, Write Bytes to File, Copy File Using Byte Stream

Source Code :https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%2017

Video : https://www.youtube.com/watch?v=NIxcCzJOj3c&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=17

Example #01

import java.io.FileInputStream; import java.io.IOException;

public class IT24013 {

public static void main(String[] args) {

    FileInputStream fileInputStream = null;

    try {

        // Open file
        fileInputStream =
                new FileInputStream("example.txt");

        int byteData;

        // Read bytes until end of file
        while((byteData =
                fileInputStream.read()) != -1) {

            // Convert byte to character
            System.out.print((char) byteData);
        }

    }
    catch (IOException e) {

        e.printStackTrace();
    }

    finally {

        // Close stream
        if(fileInputStream != null) {

            try {

                fileInputStream.close();
            }
            catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}
}

Example #02

import java.io.FileOutputStream; import java.io.IOException;

public class IT24013 {

public static void main(String[] args) {

    FileOutputStream fileOutputStream = null;

    try {

        // Create output stream
        fileOutputStream =
                new FileOutputStream("output.txt");

        String data = "Hello, World!";

        // Convert string to bytes
        byte[] byteData = data.getBytes();

        // Write bytes
        fileOutputStream.write(byteData);

        System.out.println(
                "Data written successfully.");

    }
    catch (IOException e) {

        e.printStackTrace();
    }

    finally {

        // Close stream
        if(fileOutputStream != null) {

            try {

                fileOutputStream.close();
            }
            catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}
}

Example #03

import java.io.FileInputStream; import java.io.FileOutputStream; import java.io.IOException;

public class IT24013 {

public static void main(String[] args) {

    FileInputStream inputFile = null;
    FileOutputStream outputFile = null;

    try {

        // Read source file
        inputFile =
                new FileInputStream("source.txt");

        // Write destination file
        outputFile =
                new FileOutputStream("destination.txt");

        int byteData;

        // Copy bytes
        while((byteData =
                inputFile.read()) != -1) {

            outputFile.write(byteData);
        }

        System.out.println(
                "File copied successfully.");

    }
    catch (IOException e) {

        e.printStackTrace();
    }

    finally {

        // Close streams
        try {

            if(inputFile != null)
                inputFile.close();

            if(outputFile != null)
                outputFile.close();

        }
        catch (IOException e) {

            e.printStackTrace();
        }
    }
}
}

Date : 06/05/2025

Day #18

Topic : Check if File Exists, Write Data to File using BufferedWriter, Read Data from File using BufferedReader

Source Code : https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%2018

Video : https://www.youtube.com/watch?v=u0SsmS1wFWA&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=18

Example #01

import java.io.File;

public class IT24013 {

public static void main(String[] args) {

    File myFile = new File("example.txt");

    if(myFile.exists()) {

        System.out.println("File exists.");
    }
    else {

        System.out.println("File does not exist.");
    }
}
}

Example #02

import java.io.BufferedWriter; import java.io.FileWriter; import java.io.IOException;

public class IT24013 {

public static void main(String[] args) {

    try {

        FileWriter writer =
                new FileWriter("output.txt");

        BufferedWriter bufferedWriter =
                new BufferedWriter(writer);

        bufferedWriter.write("Hello, World!");

        bufferedWriter.newLine();

        bufferedWriter.write(
                "This is a Java file handling example.");

        bufferedWriter.close();

        System.out.println(
                "Data written to file successfully.");

    }
    catch(IOException e) {

        System.out.println(
                "An error occurred: "
                + e.getMessage());
    }
}
}

Example #03 import java.io.BufferedReader; import java.io.FileReader; import java.io.IOException;

public class IT24013 {

public static void main(String[] args) {

    try {

        FileReader reader =
                new FileReader("output.txt");

        BufferedReader bufferedReader =
                new BufferedReader(reader);

        String line;

        while((line =
                bufferedReader.readLine()) != null) {

            System.out.println(line);
        }

        bufferedReader.close();
    }
    catch(IOException e) {

        System.out.println(
                "An error occurred: "
                + e.getMessage());
    }
}
}

Date : 07/05/2025

Day #19

Topic : Create Directory using File Class, List Directory Contents, Delete Directory

Source Code : https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%2019

Video : https://www.youtube.com/watch?v=svLv3q-_Fl0&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=19

Example #01

import java.io.File;

public class IT24013 {

public static void main(String[] args) {

    // Directory path
    String directoryPath = "Projects/Java";

    // Create File object
    File directory =
            new File(directoryPath);

    // Check and create directory
    if(!directory.exists()) {

        boolean created =
                directory.mkdirs();

        if(created) {

            System.out.println(
                    "Directory created successfully.");
        }
        else {

            System.out.println(
                    "Failed to create directory.");
        }
    }
    else {

        System.out.println(
                "Directory already exists.");
    }
}
}

Example #02

import java.io.File;

public class IT24013 {

public static void main(String[] args) {

    String directoryPath =
            "Projects/Java";

    File directory =
            new File(directoryPath);

    // Get all files/folders
    String[] contents =
            directory.list();

    if(contents != null) {

        System.out.println(
                "Directory Contents:");

        for(String fileName : contents) {

            System.out.println(fileName);
        }
    }
    else {

        System.out.println(
                "Directory is empty or not found.");
    }
}
}

Example #03

import java.io.File;

public class IT24013 {

public static void main(String[] args) {

    String directoryPath =
            "Projects/Java";

    File directory =
            new File(directoryPath);

    if(directory.exists()) {

        boolean deleted =
                directory.delete();

        if(deleted) {

            System.out.println(
                    "Directory deleted successfully.");
        }
        else {

            System.out.println(
                    "Failed to delete directory.");
        }
    }
    else {

        System.out.println(
                "Directory does not exist.");
    }
}
}

Date : 08/05/2025

Day #20

Topic : LocalDate, LocalDateTime, ZonedDateTime

Source Code :https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%2020
Video : https://www.youtube.com/watch?v=rs1WKrln-9U&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=20

Example #01

import java.time.LocalDate;

public class IT24013 {

public static void main(String[] args) {

    // Get current date
    LocalDate today =
            LocalDate.now();

    System.out.println(
            "Today's date: " + today);
}
}

Example #02

import java.time.LocalDateTime;

public class IT24013 {

public static void main(String[] args) {

    // Get current date and time
    LocalDateTime now =
            LocalDateTime.now();

    System.out.println(
            "Current date and time: "
            + now);
}
}

Example #03

import java.time.ZonedDateTime;

public class IT24013 {

public static void main(String[] args) {

    // Get date and time with timezone
    ZonedDateTime zonedNow =
            ZonedDateTime.now();

    System.out.println(
            "Current date and time with zone: "
            + zonedNow);
}
}

Date : 09/05/2025

Day #21

Topic : Formatting Date using DateTimeFormatter, Parsing and Formatting User Birthdate,

Source Code : https://github.com/Jubayer-jm/IT24027-30-Days-Plan/tree/main/Day%2021

Video : https://www.youtube.com/watch?v=ieveCaLfrlE&list=PLSGubLIO9kuDMrAqU8bVQx4Zv-E-6AEnj&index=21

Example #01

import java.time.LocalDate; import java.time.format.DateTimeFormatter;

public class IT24013 {

public static void main(String[] args) {

    // Current date
    LocalDate currentDate =
            LocalDate.now();

    // Define format
    DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(
                    "dd/MM/yyyy");

    // Format date
    String formattedDate =
            currentDate.format(formatter);

    // Print result
    System.out.println(
            "Formatted Date: "
            + formattedDate);
}
}

Example #02

import java.time.LocalDate; import java.time.format.DateTimeFormatter; import java.util.Scanner;

public class IT24013 {

public static void main(String[] args) {

    Scanner scanner =
            new Scanner(System.in);

    // User name
    System.out.print(
            "Enter your name: ");

    String name =
            scanner.nextLine();

    // User birthdate
    System.out.print(
            "Enter birthdate (yyyy-MM-dd): ");

    String birthdateInput =
            scanner.nextLine();

    // Parse string to LocalDate
    LocalDate birthdate =
            LocalDate.parse(birthdateInput);

    // Output format
    DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(
                    "EEEE, MMM dd, yyyy");

    // Format birthdate
    String formattedBirthdate =
            birthdate.format(formatter);

    // Display result
    System.out.println(
            "Hello " + name
            + "! Your birthdate is: "
            + formattedBirthdate);

    scanner.close();
}
}