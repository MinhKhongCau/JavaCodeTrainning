import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
/*
Giá trị độ đo thời gian được biểu diễn bởi ba thành phần: giờ, phút, giây.

Cho N giá trị thời gian, hãy sắp xếp danh sách theo thứ tự tăng dần.

Input

Dòng đầu ghi số nguyên dương N (không quá 5000) là số lượng giá trị thời gian cần sắp xếp.

Mỗi giá trị thời gian biểu diễn trên một dòng bằng ba số nguyên dương, lần lượt là số giờ, số phút, số giây. Trong đó số giờ đảm bảo nhỏ hơn 100, số phút và số giây đảm bảo đúng quy tắc (tức là không quá 59).

Output

In ra danh sách đã sắp xếp theo thứ tự tăng dần
 */
public class THOIGIAN {
    private Integer hour;
    private Integer minute;
    private Integer second;
    public THOIGIAN() {
    }
    public THOIGIAN(Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Integer n = sc.nextInt();
            ArrayList<THOIGIAN> rel = new ArrayList<>();
            while (n > 0) {
                THOIGIAN time = new THOIGIAN(sc.nextInt(),sc.nextInt(),sc.nextInt());
                rel.add(time);
                n--;
            }
            rel.sort(new Comparator<THOIGIAN>() {
                @Override
                public int compare(THOIGIAN o1, THOIGIAN o2) {
                    // TODO Auto-generated method stub
                    if (o1.getHour() > o2.getHour()) {
                        return 1;
                    } else if (o1.getHour() < o2.getHour()) {
                        return -1;
                    } else if (o1.getMinute() > o2.getMinute()) {
                        return 1;
                    } else if (o1.getMinute() < o2.getMinute()) {
                        return -1;
                    } else if (o1.getSecond() > o2.getSecond()) {
                        return 1;
                    } else if (o1.getSecond() < o2.getSecond()) {
                        return -1;
                    }
                    return 0;
                }
            });
            for (THOIGIAN thoigian : rel) {
                System.out.println(thoigian.getHour()+" "+thoigian.getMinute()+" "+thoigian.getSecond());
            }
        }
        
    }
}
