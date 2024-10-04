import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LangestNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            ArrayList<Integer> langest = new ArrayList<>();
            for (int i = 0; i<n; i++) {
                int temp = sc.nextInt();
                if (temp % 2 == 0) {
                    langest.add(temp);
                }
            }
            langest.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    // TODO Auto-generated method stub
                    return o2-o1;
                }
            }
            );
            int i = 0;
            if (langest.size() == 0)
                System.out.println(" ");
            else
                for (Integer item: langest) {
                    if (i == k) 
                        break;
                    System.out.print(item+" ");
                    i++; 
                }
        }
    }
}
