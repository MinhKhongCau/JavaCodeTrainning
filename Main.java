import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp=sc.nextInt();
            al.add(tmp);
        }
                
        int max;
        for (int i = 0; i < k; i++) {
            int flag = 0;
            max=0;
            for (int j = 0; j < n; j++) {
                if((al.get(j)>max) && (al.get(j)%2==0)){
                    max=al.get(j);
                    flag=j;
                }
            }
            System.out.print(max);
            al.remove(flag); n--;
            if(i!=k-1){
                System.out.print("+");
            }
        }
                
        sc.close();
    }
}
