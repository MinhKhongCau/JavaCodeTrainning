import java.util.ArrayList;
import java.util.Scanner;

class Hang{
    private String ma;
    private double nhap;

    public Hang() {
    }

    public Hang(String ma, double nhap) {
        this.ma = ma;
        this.nhap = nhap;
    }
    
    public double getXuat(){
        double xuat=0;
        if(ma.charAt(0)=='A'){
            xuat=nhap*60/100;
        }else if(ma.charAt(0)=='B'){
            xuat=nhap*70/100;
        }
        return xuat;
    }
    
    public double getDonGia(){
        double donGia=0;
        if(ma.charAt(ma.length()-1)=='Y'){
            donGia=110000;
        }else if(ma.charAt(ma.length()-1)=='N'){
            donGia=135000;
        }
        return donGia;
    }
    
    public double getTien(){
        return Math.round(getXuat())*getDonGia();
    }
    
    public double getThue(){
        double thue=0;
        if(ma.charAt(0)=='A'){
            if(ma.charAt(ma.length()-1)=='Y'){
                thue=getTien()*8/100;
            }else{
                thue=getTien()*11/100;
            }
        }else{
            if(ma.charAt(ma.length()-1)=='Y'){
                thue=getTien()*17/100;
            }else{
                thue=getTien()*22/100;
            }
        }
        return thue;
    }

    @Override
    public String toString() {
        return ma+" "+Math.round(nhap)+" "+Math.round(getXuat())+" "+
                Math.round(getDonGia())+" "+Math.round(getTien())+" "+Math.round(getThue());
    }
    
}
public class THEODOINHAPSUAT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        ArrayList<Hang> list=new ArrayList<>();
        for (double i = 0; i < n; i++) {
            String tmp=sc.nextLine();
            String ma=sc.nextLine();
            double nhap=sc.nextInt();
            Hang h=new Hang(ma, nhap);
            list.add(h);
        }
        for(Hang a:list){
            System.out.println(a);
        }                
    }
}
