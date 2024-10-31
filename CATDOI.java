import java.util.Scanner;

public class CATDOI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();  

        for (int test = 0; test < t; test++) {
            String number = sc.nextLine();  

            StringBuilder result = new StringBuilder();
            boolean isValid = true;

            for (char digit : number.toCharArray()) {
                if (digit == '0' || digit == '1') {
                    result.append(digit);  
                } else if (digit == '8' || digit == '9') {
                    result.append('0');  
                } else {
                    isValid = false;  
                    break;
                }
            }

            if (!isValid || result.toString().replace("0", "").isEmpty()) {
                System.out.println("INVALID");
            } else {
                String finalResult = result.toString().replaceFirst("^0+", "");
                System.out.println(finalResult.isEmpty() ? "INVALID" : finalResult);
            }
        }
    }
}
