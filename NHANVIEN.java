import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NHANVIEN {
    private String id;
    private String name;
    private String gender;
    private LocalDate birthDay;
    private String address;
    private String taxCode;
    private LocalDate contractDate;
    public NHANVIEN() {
        id = "00001";
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
    public NHANVIEN(String name, String gender, LocalDate birthDay, String address, String taxCode,
            LocalDate contractDate) {
        this.id = "00001";
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.address = address;
        this.taxCode = taxCode;
        this.contractDate = contractDate;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + birthDay.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " "
                + address + " " + taxCode + " " + contractDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            String gender = sc.nextLine();
            LocalDate birthDay = LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            String address = sc.nextLine();
            String taxCode = sc.next();
            LocalDate contracDay = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            NHANVIEN employee = new NHANVIEN(name, gender, birthDay, address, taxCode, contracDay); 
            System.out.println(employee.toString());
        }
        
    }
}
