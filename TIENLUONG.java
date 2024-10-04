public class TIENLUONG {
    static class Employee {
        private static Integer cnt;
        private String id;
        private String name;
        private Integer salary;
        private Integer workDate;
        private String position;
        public Employee(String name, Integer salary, Integer workDate, String position) {
            this.id = setId();
            this.name = name;
            this.salary = salary;
            this.workDate = workDate;
            this.position = position;
        }
        private String setId() {
            return "NV" + String.format("%02", cnt);
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Integer getSalary() {
            return salary;
        }
        public void setSalary(Integer salary) {
            this.salary = salary;
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
        
    }
}
