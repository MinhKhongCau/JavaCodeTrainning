import java.io.*;
import java.util.*;

public class PrimeNumbersInBinaryFiles {

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Hàm đọc dữ liệu từ file nhị phân
    public static ArrayList<Integer> readDataFromFile(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        @SuppressWarnings("unchecked")
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();
        return list;
    }

    // Hàm đếm số lần xuất hiện của các số nguyên tố trong danh sách
    public static Map<Integer, Integer> countPrimeOccurrences(ArrayList<Integer> list) {
        Map<Integer, Integer> primeCount = new HashMap<>();
        for (int num : list) {
            if (isPrime(num)) {
                primeCount.put(num, primeCount.getOrDefault(num, 0) + 1);
            }
        }
        return primeCount;
    }

    public static void main(String[] args) {
        try {
            // Đọc dữ liệu từ hai file nhị phân
            ArrayList<Integer> data1 = readDataFromFile("DATA1.in");
            ArrayList<Integer> data2 = readDataFromFile("DATA2.in");

            // Đếm số lần xuất hiện của các số nguyên tố trong từng file
            Map<Integer, Integer> primeCount1 = countPrimeOccurrences(data1);
            Map<Integer, Integer> primeCount2 = countPrimeOccurrences(data2);

            // Tập hợp các số nguyên tố xuất hiện trong cả hai file
            Set<Integer> commonPrimes = new TreeSet<>(primeCount1.keySet());
            commonPrimes.retainAll(primeCount2.keySet());

            // In ra danh sách các số nguyên tố cùng số lần xuất hiện
            for (int prime : commonPrimes) {
                System.out.println(prime + " " + primeCount1.get(prime) + " " + primeCount2.get(prime));
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
