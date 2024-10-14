import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class SONGUYENTOTRONGFILE {
    private static FileInputStream file1;
    private static FileInputStream file2;
    private static ArrayList<Integer> arrays;
    private static HashMap<Integer,Integer[]> map;
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try {
            file1 = new FileInputStream("DATA1.in");
            file2 = new FileInputStream("DATA2.in");
            ObjectInputStream in = null;
            in = new ObjectInputStream(file1);
            arrays = (ArrayList<Integer>) in.readObject();
            map = new HashMap<>();
            for (Integer item : arrays) {
                if (isPrime(item)) {
                    Integer[] array = new Integer[2];
                    array[1] = 0;
                    if (map.containsKey(item)) {
                        array[0] = ++map.get(item)[0];
                        map.put(item, array);
                    } else {
                        array[0] = 1;
                        map.put(item, array);
                    }
                }
            }
            in.close();
            in = new ObjectInputStream(file2);
            arrays = (ArrayList<Integer>) in.readObject();
            for (Integer item : arrays) {
                if (isPrime(item)) {
                    Integer[] array = new Integer[2];
                    if (map.containsKey(item)) {
                        array = map.get(item);
                        array[1] = ++map.get(item)[1];
                        map.put(item, array);
                    } else {
                        array[0] = 0;
                        array[1] = 1;
                        map.put(item, array);
                    }
                }
            }
            for (Entry<Integer, Integer[]> item : map.entrySet()) {
                System.out.println(item.getKey()+" "+item.getValue()[0]+" "+item.getValue()[1]);
            }
            in.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i<Math.sqrt(n);i++) {
            if (n%i == 0)
                return false;
        }
        return true;
    }


}
