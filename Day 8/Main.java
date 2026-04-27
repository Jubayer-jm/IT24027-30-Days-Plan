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

public class Main {
    public static void main(String[] args) {

        // No outer object needed
        Outer.Inner obj = new Outer.Inner();

        obj.display();
    }
}