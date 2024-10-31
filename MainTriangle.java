
import java.text.DecimalFormat;
import java.util.Scanner;

class Point{
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Triangle{
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double firstSide(){
        return Math.sqrt(Math.pow(b.getX()-a.getX(), 2)+Math.pow(b.getY()-a.getY(), 2));
    }
    
    public double secondSide(){
        return Math.sqrt(Math.pow(c.getX()-a.getX(), 2)+Math.pow(c.getY()-a.getY(), 2));
    }
    
    public double thirdSide(){
        return Math.sqrt(Math.pow(b.getX()-c.getX(), 2)+Math.pow(b.getY()-c.getY(), 2));
    }
    
    public void Area(){
        double ab=firstSide();
        double ac=secondSide();
        double bc=thirdSide();
        double area=ab+bc+ac;
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String t = decimalFormat.format(area);
        if((ab+ac>bc) && (ac+bc>ab) && (ab+bc>ac)){
            System.out.println(t);
        }else{
            System.out.println("INVALID");
        }
    }
}
public class MainTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            double xa=sc.nextDouble();
            double ya=sc.nextDouble();
            double xb=sc.nextDouble();
            double yb=sc.nextDouble();
            double xc=sc.nextDouble();
            double yc=sc.nextDouble();
            Point a=new Point(xa, ya);
            Point b=new Point(xb, yb);
            Point c=new Point(xc, yc);
            Triangle tr=new Triangle(a, b, c);
            tr.Area();
        }
    }
}
