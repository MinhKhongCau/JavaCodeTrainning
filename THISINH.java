import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class THISINH {
    /*
    Viết chương trình khai báo lớp Thí Sinh gồm các thông tin: Họ tên, Ngày sinh, Điểm môn 1, Điểm môn 2, Điểm môn 3 và Tổng điểm.

    Đọc thông tin 1 thí sinh từ bàn phím và in ra màn hình 3 thông tin: Họ tên, Ngày sinh, Tổng điểm.

    Input

    Gồm 5 dòng lần lượt, mỗi dòng ghi 1 thông tin: Họ tên, Ngày sinh, Điểm môn 1, Điểm môn 2, Điểm môn 3. Họ tên không quá 50 chữ cái, Ngày sinh viết đúng chuẩn dd/mm/yyyy. Các giá trị điểm là số thực (float).

    Output

    Ghi ra Họ tên, Ngày sinh và Tổng điểm. Mỗi thông tin cách nhau một khoảng trống. Điểm được ghi ra với 1 số sau dấu phẩy.
    */
    private String name;
    private LocalDate birthDate;
    private Double pointCourse1;
    private Double pointCourse2;
    private Double pointCourse3;
    public THISINH() {
    }
    public THISINH(String name, LocalDate birthDate, Double pointCourse1, Double pointCourse2, Double pointCourse3) {
        this.name = name;
        this.birthDate = birthDate;
        this.pointCourse1 = pointCourse1;
        this.pointCourse2 = pointCourse2;
        this.pointCourse3 = pointCourse3;
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
    public Double getPointCourse1() {
        return pointCourse1;
    }
    public void setPointCourse1(Double pointCourse1) {
        this.pointCourse1 = pointCourse1;
    }
    public Double getPointCourse2() {
        return pointCourse2;
    }
    public void setPointCourse2(Double pointCourse2) {
        this.pointCourse2 = pointCourse2;
    }
    public Double getPointCourse3() {
        return pointCourse3;
    }
    public void setPointCourse3(Double pointCourse3) {
        this.pointCourse3 = pointCourse3;
    }
    public Double pointSum() {
        return pointCourse1+pointCourse2+pointCourse3;
    }
    @Override
    public String toString() {
        return "THISINH [name=" + name + ", birthDate=" + birthDate + ", pointCourse1=" + pointCourse1
                + ", pointCourse2=" + pointCourse2 + ", pointCourse3=" + pointCourse3 + "]";
    }
    public static void main(String[] args) {
        THISINH thiSinh = new THISINH();
        try (Scanner sc = new Scanner(System.in)) {
            thiSinh.name = sc.nextLine();
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            thiSinh.birthDate = LocalDate.parse(sc.next(),dateFormat);
            thiSinh.pointCourse1 = sc.nextDouble();
            thiSinh.pointCourse2 = sc.nextDouble();
            thiSinh.pointCourse3 = sc.nextDouble();
            System.out.println(thiSinh.name + " " + thiSinh.birthDate.format(dateFormat) + " " + String.format("%.1f", thiSinh.pointSum()));
        }
        
    }
}
