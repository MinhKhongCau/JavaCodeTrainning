import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class GIAOCUA2DAYSO {
    public static void main(String[] args) {
        int m,n;
        try (Scanner sc = new Scanner(System.in)) {
            m = sc.nextInt();
            n = sc.nextInt();
            TreeSet<Integer> A = new TreeSet<>(), B = new TreeSet<>();
            for (int i = 0; i<m; i++) {
                int temp = sc.nextInt();
                if (temp < 1000 && temp > 0)
                    A.add(temp);
            }
            for (int i = 0; i<n; i++) {
                int temp = sc.nextInt();
                if (temp < 1000 && temp > 0)
                    B.add(temp);
            }
            TreeSet<Integer> rel = timgiao(A, B);
            for (Integer item: rel) {
                System.out.print(item + " ");
            }
        }
    }

    public static TreeSet<Integer> timgiao(TreeSet<Integer> A, TreeSet<Integer> B) {
        TreeSet<Integer> rel = new TreeSet<>();
        Iterator<Integer> itrA = A.iterator(), itrB = B.iterator();
        Integer tA = itrA.next(), tB = itrB.next();
        while (itrA.hasNext() || itrB.hasNext()) {
            if (tA < tB && itrA.hasNext()) {
                tA = itrA.next();
            } else if (tA > tB && itrB.hasNext()) {
                tB = itrB.next();
            } else if (tA.equals(tB)) {
                rel.add(tB);
                if (itrA.hasNext())
                    tA = itrA.next();
                if (itrB.hasNext())
                    tB = itrB.next();
            } else if (itrA.hasNext()) {
                tA = itrA.next();
            } else {
                tB = itrB.next();
            }
        }
        if (tA.equals(tB)) {
            rel.add(tB);
        }
        return rel;
    }
}
