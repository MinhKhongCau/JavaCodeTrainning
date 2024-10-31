import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

class SinhVien{
    private String ma;
    private String ten;
    private String sdt;
    private String bt;
    private String sttNhom;

    public SinhVien(String ma, String ten, String sdt, String bt, String sttNhom) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.bt = bt;
        this.sttNhom=sttNhom;
    }

    public String getMa() {
        return ma;
    }
    
    @Override
    public String toString() {
        return ma+" "+ten+" "+sdt+" "+sttNhom+" "+bt;
    }
    
}
public class BaiTapNhom {
    public static void main(String[] args) {
        File baitap=new File("src/codeptit/BAITAP.in");
        File nhom=new File("src/codeptit/NHOM.in");
        File sinhvien=new File("src/codeptit/SINHVIEN.in");
        try{
            BufferedReader br1=new BufferedReader(new FileReader(baitap));
            BufferedReader br2=new BufferedReader(new FileReader(nhom));
            BufferedReader br3=new BufferedReader(new FileReader(sinhvien));
            
            int n=Integer.parseInt(br3.readLine());
            String[][] sv=new String[n][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                   sv[i][j]=br3.readLine();
                }
            }
            
            int m=Integer.parseInt(br1.readLine());
            String[] btap=new String[m];
            for (int i = 0; i < m; i++) {
                btap[i]=br1.readLine();
            }
            
            ArrayList<SinhVien> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String line=br2.readLine();
                String[] tmp=line.split("\\s");
                String ma=""; String ten=""; String sdt=""; String sttNhom=""; String bt="";
                for (int j = 0; j < n; j++) {
                    if(tmp[0].equals(sv[j][0])){
                        ma=sv[j][0]; ten=sv[j][1]; sdt=sv[j][2];
                    }
                    sttNhom=tmp[1];
                    bt=btap[Integer.parseInt(sttNhom)-1];
                }
                SinhVien s=new SinhVien(ma, ten, sdt, bt, sttNhom);
                list.add(s);
            }
            
            list.sort(new Comparator<SinhVien>(){
                @Override
                public int compare(SinhVien o1, SinhVien o2) {
                    return o1.getMa().compareTo(o2.getMa());
                }                
            });
            
            for(SinhVien p:list){
                System.out.println(p);
            }
            br1.close(); br2.close(); br3.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }   
}
