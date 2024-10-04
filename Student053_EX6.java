import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * Viết chương trình thực hiện các chức năng sau:
1. Nhập thông tin chiều dài và chiều rộng của 1 hình chữ nhật từ bàn phím.
2. Tính chu vi và diện tích của hình chữ nhật.
3. Lưu thông tin chiều dài, chiều rộng, chu vi, diện tích của hình chữ nhật vào file có tên dạng MãSV.txt (ví dụ: N22DCCN001.txt)

Chương trình được lưu vào file có tên MaSV.java (ví dụ: N22DCCN001.java)
 */
class Animal {
    private String color;

    public Animal() {
    }

    public Animal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public String eat() {
        return "I can eat";
    }
}
class Student053_EX6 {
    public static void main(String[] args) {
        Animal[] A = new Animal[5];
        A[0] = new Animal("Red");
        A[1] = new Animal("Blue");
        A[2] = new Animal("Green");
        A[3] = new Animal("Yellow");
        A[4] = new Animal("Purple");

        Arrays.sort(A, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return a1.getColor().compareTo(a2.getColor());
            }
        });
        for (Animal tmp : A) {
            System.out.println(tmp.getColor());
        }
    }
}