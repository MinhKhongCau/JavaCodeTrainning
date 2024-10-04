import java.text.DecimalFormat;
import java.util.Scanner;

public class TUYENSINH {
    private String id;
    private String name;
    private Double math;
    private Double physic;
    private Double chemistry;
    private Double priority;
    private Double score;
    private String state;
    public TUYENSINH() {
    }
    public TUYENSINH(String id, String name, Double math, Double physic, Double chemistry) {
        this.id = id;
        this.name = name;
        this.math = math*2;
        this.physic = physic;
        this.chemistry = chemistry;
        setPriority();
        setScore();
        setState();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getMath() {
        return math;
    }
    public void setMath(Double math) {
        this.math = math;
    }
    public Double getPhysic() {
        return physic;
    }
    public void setPhysic(Double physic) {
        this.physic = physic;
    }
    public Double getChemistry() {
        return chemistry;
    }
    public void setChemistry(Double chemistry) {
        this.chemistry = chemistry;
    }
    public Double getScore() {
        return score;
    }
    private void setPriority() {
        String priority = this.id.substring(0,3);
        switch (priority) {
            case "KV1":
                this.priority = 0.5;
                break;
            case "KV2":
                this.priority = 1.0;
                break;
            case "KV3":
                this.priority = 2.5;
                break;
            default:
                break;
        }
    }
    private void setScore() {
        this.score = this.math+this.physic+this.chemistry;
    }
    private void setState() {
        if (this.score + this.priority >= 24.0) 
            this.state = "TRUNG TUYEN";
        else {
            this.state = "TRUOT";
        }
    }
    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        return id + " " + name + " " + format.format(priority) + " " + format.format(score) + " " + state;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            Double math = sc.nextDouble();
            Double physic = sc.nextDouble();
            Double chemistry = sc.nextDouble();
            TUYENSINH ts = new TUYENSINH(id, name, math, physic, chemistry);
            System.out.println(ts.toString());
        }
    }
}
