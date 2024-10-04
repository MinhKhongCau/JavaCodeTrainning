/*
Khai báo lớp Pair mô tả các thao tác với cặp số nguyên. Sử dụng lớp Pair để giải quyết bài toán sau (chú ý viết hàm main đúng theo mẫu).

Nhập số tự nhiên N, hãy tìm cặp số nguyên tố đầu tiên có tổng là N.

Nếu không tồn tại cặp số nguyên tố có tổng bằng N, hãy đưa ra -1.

Input:

Dòng đầu tiên đưa vào số lượng bộ test T.
Những dòng kế tiếp đưa vào các bộ test. Mỗi bộ test gồm là một số N được ghi trên một dòng.
T, N thỏa mãn ràng buộc: 1≤T≤100; 1≤ N ≤106
Output:

Đưa ra kết quả mỗi test theo từng dòng.
*/

import java.util.Scanner;

public class Pair {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n >= 1 && n <= 100) {
                while (n>0) {
                    int test = sc.nextInt();
                    sc.nextLine();
                    if (test <= 100000 && test >= 1) {
                        int sumPrime = sumPrime(test);
                        if (sumPrime != -1) {
                            System.out.println(sumPrime + " " + (test-sumPrime));
                        } else {
                            System.out.println(-1);
                        }
                    } else {
                        System.out.println(-1);
                    }
                    n--;
                }
            } else {
                System.out.println(-1);
            }
        }
    }

    public static boolean prime(Integer n) {
        for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n%i == 0) 
                return false;
        }
        return true;
    }

    public static Integer sumPrime(Integer n) {
        for (int i = 2; i<=n/2; i++) {
            if (prime(i) && prime(n-i)) {
                return i;
            }
        }
        return -1;
    }
}
