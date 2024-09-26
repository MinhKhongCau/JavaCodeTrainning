import java.util.Scanner;
/*
3

1890

3681

8919
 */
public class CATDOI {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int cnt = sc.nextInt();
            while (cnt>0) {
                String input = sc.next();
                if (input.length() <= 18 && Integer.parseInt(input) >= 0) {
                    if (Integer.parseInt(input) == 0) {
                        System.out.println("INVALID");
                        cnt--;
                        continue;
                    }
                    int temp = 0;
                    for (int i = 0; i<input.length(); i++) {
                        int t = input.charAt(i) - '0';
                        if (t == 8 || t == 9 || t == 0) 
                            temp *= 10;
                        else if (t == 1) {
                            temp += 1;
                            temp *= 10;
                        } else {
                            temp = -1;
                            break;
                        }
                    }
                    if (temp == -1 || temp == 0) {
                        System.out.println("INVALID");
                    } else {
                        temp/=10;
                        System.out.println(temp);
                    }
                } else {
                    System.out.println("INVALID");
                }
                cnt--;
            }
        }
    }
}
/*
10
8190
100
2876
INVALID
8000
INVALID
01890
1000
908
INVALID
1
1
19898001
10000001
2765
INVALID
1234567890
INVALID
111111111111111111
 */