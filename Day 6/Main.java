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

public class Main {
    public static void main(String[] args) {

        MathOperation obj = new MathOperation();

        obj.add(5, 10);
        obj.add(5, 10, 15);
    }
}