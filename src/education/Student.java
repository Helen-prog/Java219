package education;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double avgMark;

    public Student() {}

    public Student(String firstName, String lastName, String group, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avgMark = avgMark;
    }

    void print(){
        System.out.print(this.firstName + " " + this.lastName + ", группа " + this.group);
    }

    public double getAvgMark() {
        return avgMark;
    }

    public double grants(){
        return avgMark == 5 ? 1000 : 800;
    }
}
