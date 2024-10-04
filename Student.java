import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Student {
    private static Integer count = 0;
    private String id;
    private String name;
    private Double math;
    private Double vietnamese;
    private Double english;
    private Double physic;
    private Double chemistry;
    private Double biology;
    private Double history;
    private Double geography;
    private Double civicEducation;
    private Double technology;
    private Double averange;
    private String rank;
    public Student(String name, Double math, Double vietnamese, Double english, Double physic,
    Double chemistry, Double biology, Double history, Double geography, Double civicEducation, Double technology) {
        this.id = genarateId();
        this.name = name;
        this.math = math*2;
        this.vietnamese = vietnamese*2;
        this.english = english;
        this.physic = physic;
        this.chemistry = chemistry;
        this.biology = biology;
        this.history = history;
        this.geography = geography;
        this.civicEducation = civicEducation;
        this.technology = technology;
        this.averange = calculatorAverange();
        this.rank = setRank();
    }
    private String genarateId() {
        count++;
        return "HS"+String.format("%02d", count);
    }
    public String getId() {
        return id;
    }
    private Double calculatorAverange() {
        Double sum = (math+vietnamese+english+technology+physic+chemistry+biology+civicEducation+history+geography)/12;
        return Double.valueOf(Math.round(sum*10))/10 ;
    }
    public Double getAverange() {
        return averange;
    }
    
    private String setRank() {
        if (averange >= 9.0) {
            return "XUAT SAC";
        } else if (8.0 <= averange && averange < 9.0) {
            return "GIOI";
        } else if (7.0 <= averange && averange < 7.9) {
            return "KHA";
        } else if (5.0 <= averange && averange < 6.9) {
            return "TB";
        } 
        return "YEU";
    }
    public String getRank() {
        return rank;
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
    public Double getVietnamese() {
        return vietnamese;
    }
    public void setVietnamese(Double vietnamese) {
        this.vietnamese = vietnamese;
    }
    public Double getEnglish() {
        return english;
    }
    public void setEnglish(Double english) {
        this.english = english;
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
    public Double getBiology() {
        return biology;
    }
    public void setBiology(Double biology) {
        this.biology = biology;
    }
    public Double getHistory() {
        return history;
    }
    public void setHistory(Double history) {
        this.history = history;
    }
    public Double getGeography() {
        return geography;
    }
    public void setGeography(Double geography) {
        this.geography = geography;
    }
    public Double getCivicEducation() {
        return civicEducation;
    }
    public void setCivicEducation(Double civicEducation) {
        this.civicEducation = civicEducation;
    }
    public Double getTechnology() {
        return technology;
    }
    public void setTechnology(Double technology) {
        this.technology = technology;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + averange + " " + rank;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<Student> listStudent = new ArrayList<>();
            if (n>=1 && n<=50)
                while (n>0) {
                    String name = sc.nextLine();
                    Double math = sc.nextDouble();
                    Double vietnamese = sc.nextDouble();
                    Double english = sc.nextDouble();
                    Double physic = sc.nextDouble();
                    Double chemistry = sc.nextDouble();
                    Double biology = sc.nextDouble();
                    Double history = sc.nextDouble();
                    Double geopraphy = sc.nextDouble();
                    Double civicEducation = sc.nextDouble();
                    Double technology = sc.nextDouble();
                    listStudent.add(new Student(name, math, vietnamese, english, physic, chemistry, biology, history,geopraphy, civicEducation, technology));
                    sc.nextLine();
                    n--;
                }
            listStudent.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if (o1.getAverange() < o2.getAverange()) 
                        return 1;
                    else if (o1.getAverange() > o2.getAverange()) 
                        return -1;
                    else if (o1.getId().compareTo(o2.getId()) > 0)
                        return 1;
                    else if (o1.getId().compareTo(o2.getId()) < 0)
                        return -1;
                    return 0;
                }
            });
            for (Student item: listStudent) {
                System.out.println(item.toString());
            }
        }
    }
}
