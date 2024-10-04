import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * N22DCCN053_EX9
 */
public class N22DCCN053_EX9 {
    public static void main(String[] args) {
        ArrayList<Double> nums = readFile("readFile.txt");
        for (Double item : nums) {
            System.out.println(String.format("%.5f", item));
        }
    }

    public static ArrayList<Double> readFile(String fileName) {
        ArrayList<Double> nums = new ArrayList<>();
        File file = new File(fileName);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNext()) {
                double num = sc.nextFloat();
                num = Math.sqrt(num);
                nums.add(num);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
        return nums;
    }
}