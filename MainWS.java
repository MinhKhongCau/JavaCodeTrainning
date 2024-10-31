import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class WordSet{
    private String[] s1;
    private String[] s2;

    public WordSet(String s1, String s2) {
        this.s1 = s1.toLowerCase().split("\\s");
        this.s2 = s2.toLowerCase().split("\\s");
    }
    
    public void hop(){
        Set<String> setA = new HashSet<>();
        for (int i = 0; i < s1.length; i++) {
            setA.add(s1[i]);
        }
        
        Set<String> setB = new HashSet<>();
        for (int i = 0; i < s2.length; i++) {
            setB.add(s2[i]); 
        }
        
//        System.out.println(setA);
//        System.out.println(setB);
        
        setA.addAll(setB); 
        
        
        List<String> resultList = new ArrayList<>(setA);
        Collections.sort(resultList);
        
        for (String s : resultList) {
            System.out.print(s + " ");
        }
    }
    
    public void giao(){
        Set<String> setA = new HashSet<>();
        for (int i = 0; i < s1.length; i++) {
            setA.add(s1[i]);
        }
        
        Set<String> setB = new HashSet<>();
        for (int i = 0; i < s2.length; i++) {
            setB.add(s2[i]); 
        }

        setA.retainAll(setB); 
        
        List<String> resultList = new ArrayList<>(setA);
        Collections.sort(resultList);
        
        for (String num : resultList) {
            System.out.print(num + " ");
        }
    }     
    
    public void Xuat(){
        hop();
        System.out.println("");
        giao();
    }
}
public class MainWS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        WordSet w=new WordSet(s1, s2);
        w.Xuat();
    }
}
