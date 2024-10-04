import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class HOPCUA2DAYSO {
    public static void main(String[] args) {
        int m,n;
        try (Scanner sc = new Scanner(System.in)) {
            m = sc.nextInt();
            n = sc.nextInt();
            TreeSet<Integer> A = new TreeSet<>(), B = new TreeSet<>();
            if (n>1 && m<100) {
                for (int i = 0; i<m; i++) {
                    int temp = sc.nextInt();
                    if (temp > 0 && temp < 1000)
                        A.add(temp);
                }
                for (int i = 0; i<n; i++) {
                    int temp = sc.nextInt();
                    if (temp > 0 && temp < 1000)
                        B.add(temp);
                }
                TreeSet<Integer> rel = timHop(A, B);
                for (Integer item: rel) {
                    System.out.print(item + " ");
                }
            }
        }
    }

    private static TreeSet<Integer> timHop(TreeSet<Integer> A, TreeSet<Integer> B) {
        TreeSet<Integer> rel = new TreeSet<>();
        Iterator<Integer> itrA = A.iterator(), itrB = B.iterator();
        Integer tA = itrA.next(), tB = itrB.next();
        while (itrA.hasNext() || itrB.hasNext()) {
            if (tA < tB && itrA.hasNext()) {
                rel.add(tA);
                tA = itrA.next();
            } else if (tA > tB && itrB.hasNext()) {
                rel.add(tB);
                tB = itrB.next();
            } else if (tA.equals(tB)) {
                rel.add(tB);
                if (itrA.hasNext())
                    tA = itrA.next();
                if (itrB.hasNext())
                    tB = itrB.next();
            } else if (itrA.hasNext()) {
                rel.add(tA);
                tA = itrA.next();
            } else {
                rel.add(tB);
                tB = itrB.next();
            }
        }
        rel.add(tA);
        rel.add(tB);
        return rel;
    }
}
