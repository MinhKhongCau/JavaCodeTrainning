import java.util.Scanner;

public class TINHCONG {
    private static Integer count = 0;
    private String id;
    private String name;
    private Integer personalSalary;
    private Integer workingDay;
    private String position;
    private Integer bonus = 0;
    private Integer allowance = 0;
    private Integer income = 0;
    public TINHCONG() {
    }
    public TINHCONG(String name, Integer personalSalary, Integer workingDay, String position) {
        this.id = genarateId();
        this.name = name;
        this.personalSalary = personalSalary * workingDay;
        this.workingDay = workingDay;
        this.position = position;
        payroll();
        payAllowance();
        this.income = this.personalSalary + bonus + allowance;
    }
    private String genarateId() {
        count++;
        String id = "NV" + String.format("%02d", count);
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPersonalSalary() {
        return personalSalary;
    }
    public void setPersonalSalary(Integer personalSalary) {
        this.personalSalary = personalSalary;
    }
    public Integer getWorkingDay() {
        return workingDay;
    }
    public void setWorkingDay(Integer workingDay) {
        this.workingDay = workingDay;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public Integer getBonus() {
        return bonus;
    }
    public Integer getAllowance() {
        return allowance;
    }
    public Integer getIncome() {
        return income;
    }
    private void payroll() {
        if (this.workingDay >= 25) {
            this.bonus += (int) (this.personalSalary*0.2);
        } else if (this.workingDay >= 22 ) {
            this.bonus += (int) (this.personalSalary*0.1);
            System.out.println(this.personalSalary);
        } else {
            bonus = 0;
        }
    }
    private void payAllowance() {
        switch (this.position) {
            case "GD":
            allowance = 250000;
            break;
            case "PGD":
            allowance = 200000;
            break;
            case "TP":
            allowance = 180000;
            break; 
            case "NV":
            allowance = 150000;
            break;
        default:
            break;
        }
    }
    @Override
    public String toString() {
        return id + " " + name + " " + personalSalary + " "
                + bonus +" " + allowance + " " + income;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                Integer salary = sc.nextInt();
                sc.nextLine();
                Integer workingtime = sc.nextInt();
                sc.nextLine();
                String position = sc.nextLine(); 
                TINHCONG tinhcong = new TINHCONG(name, salary, workingtime, position);
                System.out.println(tinhcong.toString());
            }
        }
    }
}