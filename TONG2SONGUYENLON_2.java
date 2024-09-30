import java.util.Scanner;

public class TONG2SONGUYENLON_2 {
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
                res = summary2Number(in1, in2);
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

    public static String summary2Number(String A, String B) {
        int carry = 0;
        String res = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            int d = (A.charAt(i) - '0') + (B.charAt(i) - '0') + carry;
            if (d >= 10) {
                d = d%10;
                carry = 1;
            } else {
                carry = 0;
            }
            res = (char) (d + '0') + res;
        }
        if (carry == 1) {
            res = "1" + res;
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
