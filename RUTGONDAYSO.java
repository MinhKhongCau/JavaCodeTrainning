import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RUTGONDAYSO {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            if (n >= 1 && n <= 100000) {
                for (int i = 0; i<n ; i++) {
                    int temp = sc.nextInt();
                    if (temp >= 0 && temp <= 100)
                        A.add(temp);
                }
            }
            // Logic retrieve
            int rel = A.size();
            Iterator<Integer> itr = A.iterator();
            if (A.size() > 2) {
                    int current = itr.next(), next = itr.next();
                while (itr.hasNext()) {
                    if (tonglachan(current, next)) {
                        rel = rel - 2;
                        if (itr.hasNext())
                            current = itr.next();
                        if (itr.hasNext()) {
                            next = itr.next();
                            // when iterator retrive all of element in list
                            if (!itr.hasNext() && tonglachan(current, next)) {
                                rel -= 2;
                            }
                        }
                    } else {
                        current = next;
                        if (itr.hasNext())
                            next = itr.next();
                    }
                }
                System.out.println(rel);
            } else if (A.size() == 1) {
                System.out.println(A.iterator().next());
            } else {
                if (tonglachan(itr.next(), itr.next())) {
                    System.out.println(0);
                } else {
                    System.out.println(2);
                }
            }
        }
    }

    public static boolean tonglachan(int m, int n) {
        if ((m+n)%2 == 0) {
            return true;
        }
        return false;
    }
}
