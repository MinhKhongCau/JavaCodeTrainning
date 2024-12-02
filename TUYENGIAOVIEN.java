import java.util.ArrayList;
import java.util.Scanner;

public class TUYENGIAOVIEN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in) ) {
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<Teacher> teachers = new ArrayList<>();
            while (n > 0) {
                String name = sc.nextLine();
                String code = sc.next();
                Double technonogyScore = sc.nextDouble();
                Double specialScore = sc.nextDouble();
                sc.nextLine();
                Teacher teacher = new Teacher(name, code, technonogyScore, specialScore);
                teachers.add(teacher);
                n--;
            }
            teachers.sort((Teacher o1, Teacher o2) -> {
                return (-1)*o1.getFinalScore().compareTo(o2.getFinalScore());
            });
            for (Teacher i: teachers) {
                System.out.println(i.toString());
            }
        }    
    }
}

class Teacher {
    private static int count = 1;
    private String id;
    private String name;
    private String code;
    private Double technologyScore;
    private Double professionalScore;
    private Double adminsionScore;
    private String subject;
    private Double finalScore;
    private String result;

    public Teacher() {
        id = "GV" + count;
        count++;
    }

    public Teacher(String name, String code, Double technologyScore, Double professionalScore) {
        id = "GV" + String.format("%02d", count);
        count++;
        this.name = name;
        this.code = code;
        this.technologyScore = technologyScore;
        this.professionalScore = professionalScore;
        this.adminsionScore = getAdminsionScore();
        this.subject = getSubject();
        this.finalScore = setFinaScore();
        this.result = getResult();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getTechnologyScore() {
        return technologyScore;
    }

    public void setTechnologyScore(Double technologyScore) {
        this.technologyScore = technologyScore;
    }

    public Double getSpecialScore() {
        return professionalScore;
    }

    public void setSpecialScore(Double specialScore) {
        this.professionalScore = specialScore;
    }

    private double getAdminsionScore() {
        
        Integer adscore = Integer.valueOf(this.code.substring(1));
        switch (adscore) {
            case 1 -> {
                return 2.0d;
            }
            case 2 -> {
                return 1.5d;
            }
            case 3 -> {
                return 1.0d;
            }
            case 4 -> {
                return 0.0d;
            }
            default -> {
            }
        }
        return 0.0d;
    }

    private String getSubject() {
        String sub = this.code.substring(0,1);
        switch (sub) {
            case "A" -> {
                return "TOAN";
            }
            case "B" -> {
                return "LY";
            }
            case "C" -> {
                return "HOA";
            }
            default -> {
            }
        }
        return sub;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + subject + " " + finalScore + " " + result;
    }

    private Double setFinaScore() {
        return technologyScore*2 + professionalScore + adminsionScore;
    }
    
    public Double getFinalScore() {
        return finalScore;
    }

    private String getResult() {
        if (finalScore > 18.0d) {
            return "TRUNG TUYEN";
        }
        return "LOAI";
    }
}
