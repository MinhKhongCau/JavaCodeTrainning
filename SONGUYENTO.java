import java.util.Scanner;

// test case
/*
3
123456
997
111111111
*/
public class SONGUYENTO {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while (n!=0) {
                if (n>0 && n<100000000) {
                    int x = sc.nextInt();
                    if (songuyento(x)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
                n--;
            }
        }
    }

    private static boolean songuyento(int n) {
        if (n == 0) return false;
        if (n == 1 || n == 2) return true;
        for (int i = 2 ; i<=n/2; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
