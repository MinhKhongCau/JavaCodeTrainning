import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SOKHACNHAUTRONGFILE {
/*
Cho file văn bản DATA.in có không quá 100000 số nguyên dương, giá trị các số nhỏ hơn 1000.

Hãy liệt kê các số khác nhau xuất hiện trong file và số lần xuất hiện của từng số đó.

Input

File DATA.in có không quá 100000 số nguyên dương.

Output

Ghi ra các số khác nhau và số lần xuất hiện theo thứ tự tăng dần
 */
    public static void main(String[] args) {
        File file = new File("DATA.in");
        try (Scanner sc = new Scanner(file)) {
            HashMap<Integer,Integer> map = new HashMap<>();
            while (sc.hasNext()) {
                Integer val = sc.nextInt();
                if (map.containsKey(val)) {
                    map.put(val, map.get(val)+1);
                } else {
                    map.put(val, 1);
                }
            }
            
            for (Map.Entry<Integer,Integer> item: map.entrySet()) {
                System.out.println(item.getKey()+" "+item.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
