import java.util.Scanner;
import java.util.TreeSet;

public class DANHDAUCHUCAI {
    /*
    Cho một xâu ký tự S chỉ có các chữ cái Tiếng Anh viết thường. Hãy đếm xem có bao nhiêu ký tự chữ cái khác nhau trong S.

    Input: Có duy nhất một dòng chứa xâu ký tự S, độ dài không quá 100.

    Output: Ghi ra số ký tự chữ cái khác nhau
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.next();
            TreeSet<Character> rel = new TreeSet<>();
            for (int i = 0; i < input.length(); i++) {
                rel.add(input.charAt(i));
            }
            System.out.println(rel.size());
        }
    }
}
