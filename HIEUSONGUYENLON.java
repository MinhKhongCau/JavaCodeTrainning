import java.util.ArrayList;
import java.util.Scanner;

public class HIEUSONGUYENLON {
    /*
     * Cho hai số rất lớn X và Y được biểu diễn như hai xâu ký tự. Nhiệm vụ của bạn là tìm |X-Y|?
     * Input:

        Dòng đầu tiên đưa vào số lượng test T.
        Những dòng kế tiếp đưa vào các bộ test. Mỗi test gồm hai dòng: dòng thứ nhất đưa xâu X; dòng tiếp theo đưa vào xâu Y.
        T, X, Y  thỏa mãn ràng buộc : 1≤T≤100; 0≤length(X), length(Y)≤103.
        Output:

        Đưa ra số kết quả mỗi test theo từng dòng.
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n<=100 && n >= 1) {
                ArrayList<String> rel = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    String in1 = sc.next(), in2 = sc.next();
                    if (in1.length() >= 0 && in1.length() <= 1000 && in2.length()>= 0 && in2.length() <= 1000) {
                        int int1 = Integer.parseInt(in1), int2 = Integer.parseInt(in2);
                        int length = Math.max(in1.length(), in2.length());
                        String format = "%0"+length+"d";
                        if (int1<int2) {
                            rel.add(String.format(format, int2-int1));
                        } else {
                            rel.add(String.format(format, int1-int2));
                        }
                    }
                }
                for (String item: rel) {
                    System.out.println(item);
                }
            }
        }
    }
}
