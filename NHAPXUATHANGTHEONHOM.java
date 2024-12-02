import java.util.ArrayList;
import java.util.Scanner;

public class NHAPXUATHANGTHEONHOM {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Integer cnt = sc.nextInt();
            ArrayList<Hang> arr = new ArrayList<>();
            while (cnt > 0) {
                String maHang = sc.next();
                Integer slNhap = sc.nextInt();
                Hang hang = new Hang(maHang, slNhap);
                arr.add(hang);
                cnt -= 1;
            }
            String lietke = sc.next();
            for (Hang item : arr) {
                if (item.getMaHang().charAt(0) == lietke.charAt(0)) {
                    System.out.println(item.toString());
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class Hang {
    private String maHang;
    private Integer donGia;
    private Integer slXuat;
    private Integer slNhap;
    private Integer thue;
    private Integer tien;
    public Hang() {
    }
    public Hang(String maHang, Integer slNhap) {
        this.maHang = maHang;
        this.slNhap = slNhap;
        setSlXuat();
        setDonGia();
        setTien();
        setThue();
    }
    public String getMaHang() {
        return maHang;
    }
    public Integer getDonGia() {
        return donGia;
    }
    public void setDonGia() {
        if (maHang.charAt(maHang.length()-1) == 'Y')
            this.slXuat = this.slNhap*6/10;
        else if (maHang.charAt(maHang.length()-1) == 'N')
            this.slXuat = this.slNhap*7/10;
    }
    public Integer getSlXuat() {
        return slXuat;
    }
    public void setSlXuat() {
        if (maHang.charAt(0) == 'A')
            this.slXuat = this.slNhap*6/10;
        else if (maHang.charAt(0) == 'B')
            this.slXuat = this.slNhap*7/10;
    }
    public Integer getSlNhap() {
        return slNhap;
    }
    public void setSlNhap(Integer slNhap) {
        this.slNhap = slNhap;
    }
    public Integer getThue() {
        return thue;
    }
    public void setThue() {
        if (maHang.charAt(0) == 'A' && maHang.charAt(maHang.length()-1) == 'Y')
            this.slXuat = this.tien*8/10;
        else if (maHang.charAt(0) == 'A' && maHang.charAt(maHang.length()-1) == 'N')
            this.slXuat = this.tien*11/10;
        else if (maHang.charAt(0) == 'B' && maHang.charAt(maHang.length()-1) == 'Y')
            this.slXuat = this.tien*17/10;
        else if (maHang.charAt(0) == 'B' && maHang.charAt(maHang.length()-1) == 'N')
            this.slXuat = this.tien*22/10;
    }
    public Integer getTien() {
        return tien;
    }
    public void setTien() {
        this.tien = slXuat*donGia;
    }
    @Override
    public String toString() {
        return maHang + " " + donGia + " " + slNhap + " " + slXuat + " " +
                tien + " " + thue;
    }
    
}