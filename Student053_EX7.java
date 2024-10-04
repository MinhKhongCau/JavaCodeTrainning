import java.util.ArrayList;

class Animal implements Comparable<Animal> {
    private String color;

    public Animal() {
    }

    public Animal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String eat() {
        return "I can eat";
    }
    @Override
    public String toString() {
        return "Animal [color=" + color + "]";
    }

    @Override
    public int compareTo(Animal o) {
        return this.color.compareTo(o.getColor());
    }
}

public class Student053_EX7 {
    public static void main(String[] args) {
        ArrayList<Animal> A = new ArrayList<>();
        A.add(new Animal("Red"));
        A.add(new Animal("Blue"));
        A.add(new Animal("Green"));
        A.add(new Animal("Yellow"));
        A.add(new Animal("Purple"));
        System.out.println(A.get(0).toString());
        A.get(A.size()-1).setColor("unknown");
        A.add(new Animal("mixed"));
        for (Animal temp: A) {
            System.out.println(temp.toString());
        }
    }
}

