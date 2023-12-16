package education;

public class Aspirant extends Student{
    private String work;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String work) {
        super(firstName, lastName, group, avgMark);
        this.work = work;
    }

    @Override
    void print() {
        super.print();
        System.out.print(", тема работы: '" + this.work + "'");
    }

    @Override
    public double grants() {
        return getAvgMark() == 5 ? 2000 : 1800;
    }
}
