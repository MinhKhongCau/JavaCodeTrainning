import java.util.ArrayList;

class Student {
    String id;
    String name;

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


public class N22DCCN053_EX8 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("1","Minh"));
        students.add(new Student("3","Tu"));
        students.add(new Student("2","Tuan Anh"));
        students.sort((Student o1, Student o2) -> {
            return o1.id.compareTo(o2.id);
        });

        for (Student item: students) {
            System.out.println(item);
        }
    }
}