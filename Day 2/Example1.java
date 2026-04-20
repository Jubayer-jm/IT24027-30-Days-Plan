class Student {

    public String name;        // Public (anywhere access)
    private int age;           // Private (only inside class)
    protected String university;   // Protected (same package + subclass)
    String city;               // Default (same package)

    // Setter for private variable
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for private variable
    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("University: " + university);
        System.out.println("City: " + city);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Khalid";     // public
        s1.setAge(23);         // private via setter
        s1.university = "MBSTU"; // protected
        s1.city = "Tangail";     // default

        s1.display();
    }
}