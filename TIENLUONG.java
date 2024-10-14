import java.util.Scanner;

public class TIENLUONG {
    static class Employee {
        private static Integer cnt = 0;
        private String id;
        private String name;
        private Integer salaryDate;
        private Integer salary;
        private Integer workDate;
        private Integer reward;
        private String position;
        private Integer allowance;
        private Integer cost;
        public Employee(String name, Integer salaryDate, Integer workDate, String position) {
            this.id = setId();
            this.name = name;
            this.salaryDate = salaryDate;
            this.workDate = workDate;
            this.position = position;
            this.salary = setSalary();
            this.reward = setReward();
            setAllowance();
            setCost();
        }
        private String setId() {
            cnt++;
            return "NV" + String.format("%02d", cnt);
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Integer salaryDate() {
            return salaryDate;
        }
        public void salaryDate(Integer salaryDate) {
            this.salaryDate = salaryDate;
        }
        public Integer getReward() {
            return reward;
        }
        private Integer setReward() {
            if (workDate >= 25) {
                return salary/10*2; 
            } else if (workDate >= 22) {
                return salary/10; 
            }
            return 0;
        }
        public Integer getAllowance() {
            return allowance;
        }
        public void setAllowance() {
            switch (this.position) {
                case "GD":
                this.allowance = 250000;
                break;
                case "PGD":
                this.allowance = 200000;
                break;
                case "TP":
                this.allowance = 180000;
                break;
                case "NV":
                this.allowance = 150000;
                break;
            default:
                break;
            }
        }
        public Integer getSalary() {
            return salary;
        }
        private Integer setSalary() {
            return this.salaryDate*workDate;
        }
        public Integer getWorkDate() {
            return workDate;
        }
        public void setWorkDate(Integer workDate) {
            this.workDate = workDate;
        }
        public String getPosition() {
            return position;
        }
        public void setPosition(String position) {
            this.position = position;
        }
        public Integer getCost() {
            return cost;
        }
        private void setCost() {
            this.cost = salary + reward + allowance;
        }
        @Override
        public String toString() {
            return id + " " + name + " " + salary + " " + reward + " " + allowance + " " + cost;
        }
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            Integer sum = 0;
            while (n > 0) {
                String name = sc.nextLine();
                Integer salaryDate = Integer.parseInt(sc.nextLine());
                Integer workDate = Integer.parseInt(sc.nextLine());
                String position = sc.nextLine();
                Employee em = new Employee(name, salaryDate, workDate, position);
                System.out.println(em.toString());
                sum+=em.getCost();
                n--;
            }
            }
    }
}
