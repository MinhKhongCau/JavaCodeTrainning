import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Product {
/*Hãy sắp xếp danh sách các mặt hàng theo lợi nhuận giảm dần. Mỗi mặt hàng gồm các thông tin: Mã mặt hàng (là một số nguyên, tự động tăng, tính từ 1); Tên mặt hàng, nhóm hàng: là các xâu ký tự; Giá mua, giá bán: là các số thực (không quá 9 chữ số)

Dữ liệu vào

Dòng đầu chứa số mặt hàng. Mỗi mặt hàng viết trên 4 dòng: Dòng 1: Tên mặt hàng. Dòng 2: Nhóm hàng. Dòng 3: Giá mua. Dòng 4: Giá bán

Kết quả: Ghi ra danh sách mặt hàng đã sắp xếp theo lợi nhuận giảm dần (lợi nhuận tính bằng giá bán trừ đi giá mua). Mỗi mặt hàng viết trên một dòng gồm: mã, tên, nhóm hàng và lợi nhuận (với 2 chữ số sau dấu phẩy). Các thông tin cách nhau đúng 1 khoảng trống.
*/
    private static Integer count = 0;
    private Integer id = 0;
    private String name;
    private String type;
    private Double priceIn;
    private Double priceOut;
    private Double profit;
    public Product() {
        count++;
        this.id = count;
    }
    public Product(String name, String type, Double priceIn, Double priceOut) {
        count++;
        this.id = count;
        this.name = name;
        this.type = type;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.profit = setProfit();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Double getPriceIn() {
        return priceIn;
    }
    public void setPriceIn(Double priceIn) {
        this.priceIn = priceIn;
    }
    public Double getPriceOut() {
        return priceOut;
    }
    public void setPriceOut(Double priceOut) {
        this.priceOut = priceOut;
    }
    private Double setProfit() {
        return this.priceOut - this.priceIn;
    }
    public Double getProfit() {
        return this.profit;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + type + " "
                + String.format("%.2f", profit);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            Product product;
            ArrayList<Product> products = new ArrayList<>();
            while (n>0) {
                String name = sc.nextLine();
                String type = sc.nextLine();
                Double priceIn = sc.nextDouble();
                Double priceOut = sc.nextDouble();
                sc.nextLine();
                product = new Product(name, type, priceIn, priceOut);
                products.add(product);
                n--;
            }
            products.sort(new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    // TODO Auto-generated method stub
                    if (o2.getProfit() > o1.getProfit()) {
                        return 1;
                    } else if (o2.getProfit() < o1.getProfit()) {
                        return -1;
                    }
                    return 0;
                }
            });
            for (Product p : products) {
                System.out.println(p.toString());
            }
        } catch (java.util.InputMismatchException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
