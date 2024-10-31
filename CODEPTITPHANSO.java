import java.math.BigInteger;
import java.util.Scanner;

class PhanSo {
    private BigInteger tu;  
    private BigInteger mau; 

    public PhanSo(BigInteger tu, BigInteger mau) {
        this.tu = tu;
        this.mau = mau;
        toiGian();  
    }

    private BigInteger gcd(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }

    private void toiGian() {
        BigInteger ucln = gcd(tu, mau); 
        tu = tu.divide(ucln);  
        mau = mau.divide(ucln); 
    }

    public void hienThi() {
        System.out.println(tu + "/" + mau);
    }
}

public class CODEPTITPHANSO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger tu = sc.nextBigInteger();
        BigInteger mau = sc.nextBigInteger();

        PhanSo phanSo = new PhanSo(tu, mau);

        phanSo.hienThi();
    }
}
