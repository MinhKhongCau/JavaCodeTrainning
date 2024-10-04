import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class NHANVIEN {
    private static Integer count = 0;
    private String id;
    private String name;
    private String gender;
    private LocalDate birthDay;
    private String address;
    private String taxCode;
    private LocalDate contractDate;
    public NHANVIEN() {
    }
    public NHANVIEN(String name, String gender, LocalDate birthDay, String address, String taxCode,
            LocalDate contractDate) {
        this.id = genarateId();
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDate = contractDate;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public LocalDate getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTaxCode() {
        return taxCode;
    }
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
    public LocalDate getContractDate() {
        return contractDate;
    }
    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }
    private String genarateId() {
        count++;
        return String.format("%05d", count);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + birthDay.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " "
                + address + " " + taxCode + " " + contractDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            NHANVIEN employee;
            ArrayList<NHANVIEN> listEmployee = new ArrayList<>();
            if (n>=1 && n<=40)
                while (n>0) {
                    String name = sc.nextLine();
                    String gender = sc.nextLine();
                    LocalDate birthDay = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    String address = sc.nextLine();
                    String taxCode = sc.nextLine();
                    LocalDate contracDay = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    employee = new NHANVIEN(name, gender, birthDay, address, taxCode, contracDay); 
                    listEmployee.add(employee);
                    n--;
                }
            listEmployee.sort(new Comparator<NHANVIEN>() {
                @Override
                public int compare(NHANVIEN o1, NHANVIEN o2) {
                    if (o1.getBirthDay().isAfter(o2.getBirthDay())) {
                        return 1;
                    } else if (o1.getBirthDay().isBefore(o2.getBirthDay())) {
                        return -1;
                    }
                    return 0;
                }
            });
            for (NHANVIEN item: listEmployee) {
                System.out.println(item.toString());
            }
        }
        
    }
}
