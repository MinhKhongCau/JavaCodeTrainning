import java.util.Scanner;

public class sumInteger {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n>=0 && n<=100000)
                System.out.println(readInteger(n));
        }
    }

    private static int readInteger(int n) {
        int rel = 0;
        while (n>0) {
            rel += n%10;
            n/=10;
        }
        return rel;
    }
}
