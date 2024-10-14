import java.util.Scanner;

public class MonitorMechandise {
    /**
     * Mechandise
     */ 
    static class Mechandise {
        private String id;
        private Integer inMechandise;
        private Integer outMechandise;
        private Integer unitPrice;
        private Integer cost;
        private Integer tax;
        public Mechandise() {
        }
        public Mechandise(String id, Integer inMechandise) {
            this.id = id;
            this.inMechandise = inMechandise;
            setOutMechandise();
            setUnitPrice();
            setCost();
            setTax();
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public Integer getInMechandise() {
            return inMechandise;
        }
        public void setInMechandise(Integer inMechandise) {
            this.inMechandise = inMechandise;
        }
        public Integer getOutMechandise() {
            return outMechandise;
        }
        private void setOutMechandise() {
            Character firsCharacter = this.id.charAt(0);
            if (firsCharacter == 'A') {
                outMechandise = inMechandise / 100 * 60;
            } else if (firsCharacter == 'B') {
                outMechandise = inMechandise / 100 * 70;
            }
        }
        public Integer getUnitPrice() {
            return unitPrice;
        }
        private void setUnitPrice() {
            Character lasCharacter = this.id.charAt(id.length()-1);
            if (lasCharacter == 'Y') {
                this.unitPrice = 110000;
            } else if (lasCharacter == 'N') {
                this.unitPrice = 135000;
            }
        }
        public Integer getCost() {
            return cost;
        }
        private void setCost() {
            this.cost = outMechandise*unitPrice;
        }
        public Integer getTax() {
            return tax;
        }
        private void setTax() {
            Character firsCharacter = this.id.charAt(0);
            Character lasCharacter = this.id.charAt(id.length()-1);
            if (firsCharacter == 'A' && lasCharacter == 'Y') {
                this.tax = cost/100*8;
            } else if (firsCharacter == 'A' && lasCharacter == 'N') {
                this.tax = cost/100*11;
            } else if (firsCharacter == 'B' && lasCharacter == 'Y') {
                this.tax = cost/100*17;
            } else if (firsCharacter == 'B' && lasCharacter == 'N') {
                this.tax = cost/100*22;
            } 
        }
        @Override
        public String toString() {
            return id + " " + inMechandise + " " + outMechandise
                    + " " + unitPrice + " " + cost + " " + tax;
        }        
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            while (n > 0) {
                String id = sc.nextLine();
                Integer inMechandise = sc.nextInt();
                sc.nextLine();
                Mechandise mechandise = new Mechandise(id, inMechandise);
                System.out.println(mechandise.toString());
                n--;
            }
        }
    }
}