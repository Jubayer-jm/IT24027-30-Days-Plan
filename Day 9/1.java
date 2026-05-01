import java.util.ArrayList;
import java.util.List;

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