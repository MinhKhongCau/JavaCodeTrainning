public class Person {
    private String name;
    private int age;

    // Instance Initialization Block
    {
        name = "Unknown";
        age = 0;
        System.out.println("Instance Initialization Block executed");
    }

    // Constructor 1: Initializes the object with specific values
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor executed");
    }

    // Constructor 2: Default constructor
    public Person() {
        System.out.println("Default constructor executed");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person(); // Will trigger the initialization block and the default constructor
        person1.displayInfo();

        Person person2 = new Person("Alice", 25); // Will trigger the initialization block and the parameterized constructor
        person2.displayInfo();
    }
}
