import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DANHSACHTHUCTAP {

    public static class Student {
        private static Integer count = 0;
        private Integer number;
        private String id;
        private String name;
        private String _class;
        private String email;
        private String buisiness;
        public Student() {
            count++;
        }
        public Student(String id, String name, String _class, String email, String buisiness) {
            count++;
            this.number = count;
            this.id = id;
            this.name = name;
            this._class = _class;
            this.email = email;
            this.buisiness = buisiness;
        }
        public String getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String get_class() {
            return _class;
        }
        public void set_class(String _class) {
            this._class = _class;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getBuisiness() {
            return buisiness;
        }
        public void setBuisiness(String buisiness) {
            this.buisiness = buisiness;
        }
        @Override
        public String toString() {
            return number + " " + id + " " + name + " " + _class + " " + email + " "
                    + buisiness;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<Student> students = new ArrayList<>();
            for (int i = 0; i<n; i++) {
                String id = sc.next();
                sc.nextLine();
                String name = sc.next();
                sc.nextLine();
                String classString = sc.next();
                sc.nextLine();
                String email = sc.next();
                sc.nextLine();
                String business = sc.next();
                sc.nextLine();
                Student student = new Student(id, name, classString, email, business);
                students.add(student);
            }
            students.sort(new Comparator<Student>() {
                @Override
                public int compare(DANHSACHTHUCTAP.Student o1, DANHSACHTHUCTAP.Student o2) {
                    // TODO Auto-generated method stub
                    return o1.getName().compareTo(o2.getName());
                }
                
            });
            int numberOfBusiness = sc.nextInt();
            sc.nextLine();
            if (numberOfBusiness <= 5) {
                while (numberOfBusiness > 0) {
                    String business = sc.nextLine();
                    for (Student item: students) {
                        if (item.getBuisiness().equals(business)) {
                            System.out.println(item.toString());
                        }
                    }
                    numberOfBusiness--;
                }
            }
        }
    }
}