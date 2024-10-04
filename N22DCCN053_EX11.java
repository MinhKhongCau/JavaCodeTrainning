import java.util.Map;
import java.util.TreeMap;

/**
 * N22DCCN053_EX11
 */
public class N22DCCN053_EX11 {
//   Write a Java program (StudentID_EX11.java) to
// - Create a tree map (called treeMapStudents) of <student id: String, student name: String>.
// - Add 5 elements into treeMapStudents
// - Print all keys of treeMapStudents
// - Print all values of treeMapStudents
// - Get the first (lowest) key and the last (highest) key currently treeMapStudents
    public static void main(String[] args) {
        TreeMap<String,String> treeMapStudent = new TreeMap<>();
        treeMapStudent.put("1", "Minh");
        treeMapStudent.put("2", "Tu");
        treeMapStudent.put("3", "Quang");
        treeMapStudent.put("4", "Thi");
        treeMapStudent.put("5", "Dat");
        for (Map.Entry<String,String> item: treeMapStudent.entrySet()) {
            System.out.println("key: "+item.getKey()+ " value: "+item.getValue());
        }
        System.out.println("first: "+ treeMapStudent.firstKey());
        System.out.println("last: "+ treeMapStudent.lastKey());
    }
}