import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int y = sc.nextInt();
            boolean bool = false;
            if (y % 4 == 0) {
                if (y % 100 == 0) {
                    if (y % 400 == 0) {
                        bool = true;
                    }    
                } else
                    bool = true;
            } else {
                bool = false;
            }
            if (bool)
                System.out.println("True");
            else 
                System.out.println("False");
        }
    }
}