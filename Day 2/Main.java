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

public class Main {
    public static void main(String[] args) {

        // Static method call
        Shape.info();

        Circle c1 = new Circle(5);
        c1.draw();
    }
}