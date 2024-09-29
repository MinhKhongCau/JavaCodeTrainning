import java.util.Scanner;

public class XAUDOIXUNG {

/*
Cho trước một xâu S. Bạn thay đổi đúng 1 kí tự. Hãy kiểm tra xem liệu bạn có thể tạo ra được xâu đối xứng hay không.

Input:

Dòng đầu tiên là số lượng bộ test T (T <= 20).

Mỗi test gồm 1 xâu S có độ dài không quá 15 kí tự.

Output: 

Với mỗi test, in ra “YES” nếu có thể biến đổi xâu S thành xâu đối xứng, in ra “NO” trong trường hợp ngược lại.
    */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n <= 20 && n > 0) {
                while (n>0) {
                    String input = sc.next();
                    if (input.length() <= 15) {
                        if (symetryString(input)) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    }
                    n--;
                }

            }
        }
    }

    public static boolean symetryString(String in) {
        boolean check = true;
        int length = in.length();
        for (int i = 0; i<in.length()/2; i++) {
            if (in.charAt(i) != in.charAt(length - i - 1)) {
                if (check == false) {
                    return false;
                }
                check = false;
            }
        }
        return true;
    }
}