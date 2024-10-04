import java.util.Scanner;
import java.util.TreeSet;

public class IntSet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (0 < m && m < 100 && 0 < n && n < 100 ) {
                TreeSet<Integer> A = new TreeSet<>();
                for (int i = 0; i < n; i++) {
                    Integer k = sc.nextInt();
                    A.add(k);
                }
                for (int i = 0; i < m; i++) {
                    Integer k = sc.nextInt();
                    A.add(k);
                }
                for (Integer item: A) {
                    System.out.print(item+" ");
                }
            }
        }
    }
}
