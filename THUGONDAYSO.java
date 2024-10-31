import java.util.ArrayList;
import java.util.Scanner;

class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList al=new ArrayList();
        
        for (int i = 0; i < n; i++) {
            int tmp=sc.nextInt();
            al.add(tmp);
        }
        while(true){
            boolean flag=false;
            int i=0;
            while(i!=al.size()-1){
                if(i>=al.size()-1){
                    break;
                }
                if(((int)al.get(i)+(int)al.get(i+1))%2==0){               
                    al.remove(i);                
                    al.remove(i);      
                    flag=true;
                }else{
                    i++;               
                }
            }
            if(!flag){
                break;
            }
        }
        int ans= al.size();
        System.out.print(ans);
    }
}
