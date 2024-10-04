import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TRE_GIA {
    static class Person {
        private String name;
        private LocalDate birthDate;
        public Person() {
        }
        public Person(String name, LocalDate birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public LocalDate getBirthDate() {
            return birthDate;
        }
        public void setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
        }
        @Override
        public String toString() {
            return "Person [name=" + name + ", birthDate=" + birthDate + "]";
        }
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            Person youngest = null;
            Person oldest = null;
            for (int i = 0 ; i < n; i++) {
                String name = sc.next();
                LocalDate date = LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Person person = new Person(name, date);
                if (youngest == null || date.isAfter(youngest.getBirthDate())) {
                    youngest = person;
                }
                if (oldest == null || date.isBefore(oldest.getBirthDate())) {
                    oldest = person;
                }
            }
            System.out.println(youngest.getName());
            System.out.println(oldest.getName());
        }
    }
}
