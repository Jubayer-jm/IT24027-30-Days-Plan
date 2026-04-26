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

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();

        c1.start();
        c1.stop();
    }
}