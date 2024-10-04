import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class GIABAN_2 {
    static class Product {
        private static Integer cnt = 0;
        private String id;
        private String name;
        private String unit;
        private Integer feeTransfer;
        private Integer cost;
        private Integer price;
        private Integer unitPrice;
        private Integer quantity;
        public Product(String name, String unit, Integer unitPrice, Integer quantity) {
            cnt++;
            this.id = "MH"+String.format("%02d", cnt);
            this.name = name;
            this.unit = unit;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            this.feeTransfer = setFeeTransfer();
            this.cost = setCost();
            this.price = setPrice();
        }
        public Integer setFeeTransfer() {
            return (int) Math.round(unitPrice*quantity*0.05);
        }
        public Integer setCost() {
            return unitPrice*quantity + feeTransfer;
        }
        public Integer setPrice() {
            double price = Math.ceil((cost+cost*0.02)/quantity/100);
            return (int) price*100;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getUnit() {
            return unit;
        }
        public void setUnit(String unit) {
            this.unit = unit;
        }
        public Integer getFeeTransfer() {
            return feeTransfer;
        }
        public Integer getCost() {
            return cost;
        }
        public Integer getPrice() {
            return price;
        }
        public void setPrice(Integer price) {
            this.price = price;
        }
        public Integer getUnitPrice() {
            return unitPrice;
        }
        public void setUnitPrice(Integer unitPrice) {
            this.unitPrice = unitPrice;
        }
        public Integer getQuantity() {
            return quantity;
        }
        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
        @Override
        public String toString() {
            return id + " " + name + " " + unit + " " + feeTransfer
                    + " " + cost + " " + price;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<Product> products = new ArrayList<>();
            while (n>0 && n<=50) {
                String name = sc.nextLine();
                String unit = sc.nextLine();
                Integer feeTransfer = sc.nextInt();
                sc.nextLine();
                Integer cost = sc.nextInt();
                sc.nextLine();
                Product product = new Product(name, unit, feeTransfer, cost);
                products.add(product);
                n--;
            }
            products.sort(new Comparator<Product>() {
                @Override
                public int compare(GIABAN_2.Product o1, GIABAN_2.Product o2) {
                    // TODO Auto-generated method stub
                    return o2.getPrice()-o1.getPrice();
                }
            });
            for (Product item: products) {
                System.out.println(item);
            }
        }
    }
}
