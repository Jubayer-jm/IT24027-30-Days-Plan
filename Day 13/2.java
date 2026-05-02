import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Jahidul", 60);
        marks.put("Jubayer", 85);
        marks.put("Kobir", 65);

        for (String name : marks.keySet()) {
            System.out.println(name + " " + marks.get(name));
        }
    }
}