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
                        String res = "";
                        // balance array
                        if (in1.length() < in2.length() ) {
                            in1 = balance(in1, in2.length());
                            res = negative2Number(in2, in1);
                        } else {
                            in2 = balance(in2, in1.length());
                            res = negative2Number(in1, in2);
                        }
                        rel.add(res);
                    }
                }
                for (String item: rel) {
                    System.out.println(item);
                }
            }
        }
    }

    public static String balance (String A, int length) {
        int temp = length - A.length();
        while (temp > 0) {
            A = "0" + A;
            temp--;
        }
        return A;
    }

    public static String negative2Number (String num1, String num2) {
        String res = "";
        Integer carry = 0;
        for (int j = num1.length() - 1; j >= 0; j--) {
            int d = (num1.charAt(j) - '0') - (num2.charAt(j) - '0') - carry;
            if (d < 0) {
                d += 10;
                carry = 1;
            } else {
                carry = 0;
            }
            res = (char) (d + '0') + res;
        }
        return res;
    }
}
/*
 * 187
 * 121
 * 4
 */