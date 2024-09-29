import java.util.Scanner;

public class GIAOVIEN {
    private String id;
    private String name;
    private String position;
    private Integer coefficient;
    private Integer allowance;
    private Integer salary;
    public GIAOVIEN() {
    }
    public GIAOVIEN(String id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.position = this.id.substring(0, 2);
        switch (this.position) {
            case "HT":
            allowance = 2000000;
            break;
            case "HP":
            allowance = 900000;
            break;
            case "GV":
            allowance = 500000;
            break;
        default:
            break;
        }
        this.coefficient = Integer.parseInt(this.id.substring(2));
        setSalary(salary);
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return this.position;
    }
    public Integer getCoefficient() {
        return this.coefficient;
    }
    public Integer getAllowance() {
        return allowance;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = this.coefficient * salary;
        this.salary += this.allowance;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + coefficient + " "
                + allowance + " " + salary;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            Integer salary = sc.nextInt();
            GIAOVIEN teacher = new GIAOVIEN(id,name,salary);
            System.out.println(teacher.toString());
        }
        
    }
}
