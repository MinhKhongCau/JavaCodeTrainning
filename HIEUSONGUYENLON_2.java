import java.util.Scanner;

public class HIEUSONGUYENLON_2 {
    /*
     * Cho hai xâu ký tự A và B mô tả hai số nguyên dương lớn có thể có đến 1000 chữ số.

        Có thể có các chữ số 0 ở đầu của A và B.
        Hãy tính A - B.

        Kết quả có thể âm, khi ghi ra cần loại bỏ các chữ số 0 ở đầu nếu có.

        Tất nhiên nếu kết quả là -0 thì ghi ra là 0.

        Input

        Có hai dòng ghi 2 số A và B.

        Output

        Ghi ra kết quả A - B.
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String in1 = sc.next(), in2 = sc.next();
            if (in1.length() >= 0 && in1.length() <= 1000 && in2.length()>= 0 && in2.length() <= 1000) {
                String res = "";
                // balance array
                if (in1.length() < in2.length())
                    in1 = balance(in1, in2.length());
                else 
                    in2 = balance(in2, in1.length());
                res = negative2Number(in1, in2);
                res = removeFront(res);
                System.out.println(res);
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
        if (carry == 1) {
            carry = 0;
            num1 = balance("0", res.length());
            num2 = res;
            res = "";
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
            res = "-" + res;
        }
        return res;
    }

    public static String removeFront (String val) {
        int i = 0;
        if (val.charAt(i) == '-' && val.charAt(i+1) == '0') {
            i++;
        }
        while (val.charAt(i) == '0' && i < val.length()-1) {
            i++;
        }
        String res = val.substring(i);
        return res;
    }
}
/*
 * 187
 * 121
 * 4
 */