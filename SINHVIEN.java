import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class SINHVIEN {
    /*
    Viết chương trình khai báo lớp Sinh Viên gồm các thông tin: Mã SV, Họ tên, Lớp, Ngày sinh và Điểm GPA (dạng số thực float). Hàm khởi tạo không có tham số, gán các giá trị thuộc tính ở trạng thái mặc định (xâu ký tự rỗng, giá trị số bằng 0).

    Đọc thông tin 1 sinh viên từ bàn phím (không có mã sinh viên) và in ra màn hình. Trong đó Mã SV được gán là B20DCCN001. Ngày sinh được chuẩn hóa về dạng dd/mm/yyyy.

    Input

    Gồm 4 dòng lần lượt là Họ tên, Lớp, Ngày sinh và Điểm GPA.

    Trong đó:

    Họ tên không quá 30 chữ cái.
    Lớp theo đúng định dạng thường dùng ở PTIT
    Ngày sinh có đủ 3 phần ngày tháng năm nhưng có thể chưa đúng chuẩn dd/mm/yyyy.
    Điểm GPA đảm bảo trong thang điểm 4 với 2 nhiều nhất 2 số sau dấu phẩy. 
    Output

    Ghi thông tin sinh viên trên 1 dòng, mỗi thông tin cách nhau 1 khoảng trống.
     */
    private String studentId;
    private String name;
    private String classId;
    private LocalDate birthDate;
    private Double GPA;
    public SINHVIEN() {
        this.studentId = "B20DCCN001";
        this.name = "";
        this.birthDate = null;
        this.classId = "";
        this.GPA = 0.0;
    }
    public SINHVIEN(String studentId, String name, String classId, LocalDate birthDate, Double gPA) {
        this.studentId = studentId;
        this.name = name;
        this.classId = classId;
        this.birthDate = birthDate;
        GPA = gPA;
    }
    public String getstudentId() {
        return studentId;
    }
    public void setstudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClassId() {
        return classId;
    }
    public void setClassId(String classId) {
        this.classId = classId;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDay) {
        String[] sp = birthDay.split("[/]");
        if (sp[0].length() == 1) {
            sp[0] = "0" + sp[0];
        }
        if (sp[1].length() == 1) {
            sp[1] = "0" + sp[1];
        }
        this.birthDate = LocalDate.parse(sp[0]+"/"+sp[1]+"/"+sp[2], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public Double getGPA() {
        return GPA;
    }
    public void setGPA(Double gPA) {
        GPA = gPA;
    }
    @Override
    public String toString() {
        return studentId + " " + name + " " + classId + " "
                + birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + String.format("%.2f", GPA);
    }
    public static void main(String[] args) {
        SINHVIEN sv = new SINHVIEN();
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            if (name.length() <= 30) {
                sv.setName(name);
                sv.setClassId(sc.next());
                sv.setBirthDate(sc.next());
                Double GPA = Double.parseDouble(sc.next());
                sv.setGPA(GPA);
                System.out.println(sv.toString());
            }
        }
    }
    
}
