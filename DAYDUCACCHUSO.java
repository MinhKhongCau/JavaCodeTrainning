import java.util.ArrayList;
import java.util.Arrays;

public class DAYDUCACCHUSO {        
        public static void main(String[] args) {
            Integer[] check = {1,2,3,4,5,6,7,8,9};
    }

    public boolean timkiem(Character k, String str) {
        for (Character i: str.toCharArray()) {
            if (i.equals(k)) {
                return true;
            }
        }
        return false;
    }
}
