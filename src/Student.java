public class Student {
    private String name;
    private String major;
    private double GPA;

    public Student(String name, String major, double GPA) {
        this.name = name;
        this.major = major;
        this.GPA = GPA;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
