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