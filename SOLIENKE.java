import java.util.Scanner;

public class SOLIENKE {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int temp = in.nextInt();
            if (temp >= 0 && temp <= 20) {
                while (temp>0) {
                    String input = in.next();
                    boolean check = true;
                    if (input.length() >= 2 && input.length() <= 18) {
                        for (int i = 0; i < input.length() - 1; i++) {
                            int t = input.charAt(i) - '0';
                            if (!solancan(t, input.charAt(i+1) - '0')) {
                                check = false;
                                break;
                            }
                        }
                    }
                    if (check) 
                        System.out.println("YES");
                    else 
                        System.out.println("NO");
                    temp--;
                }
            }
        }
    }

    public static boolean solancan(int a, int b) {
        if (a - b == 1 || a - b == -1) {
            return true;
        }
        return false;
    }
}
