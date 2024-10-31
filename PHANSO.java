import java.util.Scanner;

class PHANSO {
    private Integer numerator;
    private Integer denominator;
    public PHANSO(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public PHANSO() {
    }
    public Integer getNumerator() {
        return numerator;
    }
    public void setNumerator(Integer numerator) {
        this.numerator = numerator;
    }
    public Integer getDenominator() {
        return denominator;
    }
    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }
    @Override
    public String toString() {
        return "PHANSO [numerator=" + numerator + ", denominator=" + denominator + "]";
    }
    public String getFraction() {
        int greaterCommonDivisor = greaterCommonDivisor();
        this.numerator /= greaterCommonDivisor;
        this.denominator /= greaterCommonDivisor;
        return this.numerator + "/" + this.denominator;
    }
    private int greaterCommonDivisor() {
        for (int i = Math.min(this.numerator, this.denominator); i >= 1; i--) {
            if (this.numerator%i == 0 && this.denominator%i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            PHANSO fraction = new PHANSO();
            fraction.numerator = sc.nextInt();
            fraction.denominator = sc.nextInt();
            System.out.println(fraction.getFraction());
        }
    }
}
