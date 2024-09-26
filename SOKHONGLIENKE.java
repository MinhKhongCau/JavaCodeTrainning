import java.util.Scanner;

public class SOKHONGLIENKE {
     public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int temp = in.nextInt();
            if (temp >= 0) {
                while (temp>0) {
                    String input = in.next();
                    boolean check = true;
                    int tong = 0; 
                    if (input.length() >= 3 && input.length() <= 18) {
                        for (int i = 0; i < input.length() - 1; i++) {
                            int t = input.charAt(i) - '0';
                            tong += t;
                            if (!lienke(t, input.charAt(i+1) - '0')) {
                                check = false;
                            }
                        }
                        tong += input.charAt(input.length()-1) - '0';
                    }
                    if (check && tong%10 == 0)
                        System.out.println("YES");
                    else 
                        System.out.println("NO");
                    temp--;
                }
            }
        }
    }

    public static boolean lienke(int a, int b) {
        if (a - b == 2 || a - b == -2) {
            return true;
        }
        return false;
    }
}
