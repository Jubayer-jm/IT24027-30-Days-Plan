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