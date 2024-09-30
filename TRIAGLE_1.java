import java.util.Scanner;

class Point {
    private Double x;
    private Double y;
    public Point() {
    }
    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public Double getX() {
        return x;
    }
    public void setX(Double x) {
        this.x = x;
    }
    public Double getY() {
        return y;
    }
    public void setY(Double y) {
        this.y = y;
    }
}
public class TRIAGLE_1 {
    private Point A;
    private Point B;
    private Point C;
    private Double AB;
    private Double AC;
    private Double BC;
    private String perimeter;
    public TRIAGLE_1() {
    }
    public TRIAGLE_1(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
        AB = calculateStraightLine(a,b);
        AC = calculateStraightLine(a,c);
        BC = calculateStraightLine(b,c);
        this.perimeter = setPerimeter();
    }
    public Point getA() {
        return A;
    }
    public void setA(Point a) {
        A = a;
    }
    public Point getB() {
        return B;
    }
    public void setB(Point b) {
        B = b;
    }
    public Point getC() {
        return C;
    }
    public void setC(Point c) {
        C = c;
    }
    
    public Double getAB() {
        return AB;
    }
    public Double getAC() {
        return AC;
    }
    public Double getBC() {
        return BC;
    }
    public String getPerimeter() {
        return perimeter;
    }
    private String setPerimeter() {
        if (this.A.getX() == this.B.getX() && this.A.getX() == this.C.getX()) {
            return "INVALID";
        } else if (this.A.getY() == this.B.getY() && this.A.getY() == this.C.getY()) {
            return "INVALID";
        } else if (this.A.getX().equals(this.A.getY()) && this.B.getX().equals(this.B.getY()) && this.C.getX().equals(this.C.getY())) {
            return "INVALID";
        }
        Double rel = this.AB + this.AC + this.BC;
        return String.format("%.3f", rel);
    }
    private Double calculateStraightLine(Point a, Point b) {
        Double straightLine = Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
        return straightLine;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while (n>0 && n<=10) {
                Point A = new Point(sc.nextDouble(), sc.nextDouble());
                sc.nextLine();
                Point B = new Point(sc.nextDouble(), sc.nextDouble());
                sc.nextLine();
                Point C = new Point(sc.nextDouble(), sc.nextDouble());
                TRIAGLE_1 triagle = new TRIAGLE_1(A, B, C);
                System.out.println(triagle.getPerimeter());
                n--;
            }
        }
    }
}

