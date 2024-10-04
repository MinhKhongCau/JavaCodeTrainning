import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class N22DCCN053_EX10 {

    public static void main(String[] args) {
        List<String> A = new LinkedList<>();
        A.add("Minh");
        A.add("B");
        A.add("C");
        A.add("D");
        A.add("E");
        Iterator<String> itr = A.iterator();
        System.out.println(itr.next());
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}