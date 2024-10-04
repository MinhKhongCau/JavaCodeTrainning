import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SOKHACNHAUTRONGFILE_3 {
    public static void main(String[] args) {
        ObjectInputStream in;
        try {
            FileInputStream file = new FileInputStream("DATA.in");
            in = new ObjectInputStream(file);
            @SuppressWarnings("unchecked")
            ArrayList<Integer> array = (ArrayList<Integer>) in.readObject();
            HashMap<Integer,Integer> map = new HashMap<>();
            for (Integer item: array) {
                Integer val = item;
                if (map.containsKey(val)) {
                    map.put(val, map.get(val)+1);
                } else {
                    map.put(val, 1);
                }
            }
            for (Map.Entry<Integer,Integer> item: map.entrySet()) {
                System.out.println(item.getKey()+" "+item.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            
        }
        
    }
}
