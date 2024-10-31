package codeptit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Daydu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {                   
            int N = scanner.nextInt();
            if (N == 0) {
                System.out.println("Impossible");
                continue;
            }

            Set<Character> digits = new HashSet<>();
            for (char c = '0'; c <= '9'; c++) {
                digits.add(c);
            }

            Set<Character> foundDigits = new HashSet<>();
            long current = N;
            int multiplier = 1;  
            boolean flag=false;
            while (multiplier < Integer.MAX_VALUE) {
                String numberString = String.valueOf(current);

                for (char digit : numberString.toCharArray()) {
                    foundDigits.add(digit);
                }

                if (foundDigits.containsAll(digits)) {
                    flag=true;
                    break;
                }

                multiplier++;
                current = multiplier * N;
            }

            if(!flag){
                System.out.println("Impossible");
            }else{
                System.out.println(current);
            }
        }
        scanner.close();
    }
}

