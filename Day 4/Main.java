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

public class Main {
    public static void main(String[] args) {

        // Passing values during object creation
        Car c1 = new Car("Red", 120);
        Car c2 = new Car("Blue", 100);

        c1.display();
        System.out.println("------");
        c2.display();
    }
}