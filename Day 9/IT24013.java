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