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

public class Main {
    public static void main(String[] args) {

        // Create outer class object
        Outer obj = new Outer();

        // Create inner class object
        Outer.Inner in = obj.new Inner();

        in.showMessage();
    }
}