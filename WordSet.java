import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String A = sc.nextLine();
            String B = sc.nextLine();
            if (A.length() <= 1000 && B.length()<=1000) {
                TreeSet<String> sumSet = new TreeSet<>();
                TreeSet<String> intersectionSet = new TreeSet<>();
                String[] spA = A.split("[\\s\\t]");
                String[] spB = B.split("[\\s\\t]");
                for (int i = 0; i < spA.length; i++) {
                    sumSet.add(spA[i].toLowerCase());
                }
                for (int i = 0; i < spB.length; i++) {
                    if (sumSet.contains(spB[i])) {
                        intersectionSet.add(spB[i]);
                    }
                    sumSet.add(spB[i].toLowerCase());
                }
                for (String i: sumSet) {
                    System.out.print(i+" ");
                }
                System.out.println();
                for (String i: intersectionSet) {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
