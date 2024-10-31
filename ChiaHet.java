import java.util.Scanner;
public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s=sc.nextLine();
            String[] ss= s.split("\\s");
            String max="";
            String min="";
            if(ss[0].length()>ss[1].length()){
                max=ss[0]; min=ss[1];
            }else if(ss[0].length()<ss[1].length()){
                max=ss[1]; min=ss[0];
            }else{
                for (int j = 0; j < ss[1].length(); j++) {
                    if(ss[0].charAt(j)>ss[1].charAt(j)){
                       max=ss[0]; min=ss[1]; break;
                    }else if(ss[0].charAt(j)<ss[1].charAt(j)){
                        max=ss[1]; min=ss[0]; break;
                    }else{
                        continue;
                    }
                }
            }
            if(Integer.parseInt(max)%Integer.parseInt(min)==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
