import java.util.Scanner;

class Pair{
    private static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static String sumPrice(int n){
        for (int i = 2; i <= n/2; i++) {
            if(isPrime(i) && isPrime(n-i)){
                return(i+" "+(n-i));               
            }
        }
        return "-1";
    }
}
public class CODEPTITPAIR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp=sc.nextInt();
            System.out.print(Pair.sumPrice(tmp));
            if(i!=n-1){
                System.out.println("");
            }
        }        
    }
}
