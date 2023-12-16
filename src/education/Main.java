package education;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создать класс Student, от него будет унаследован класс Aspirant. Необходимо найти сумму стипендии, \nкоторая" +
                "зависит от полученного балла. Если средняя оценка студента равна 5, то сумма 1000, иначе 800.\n" +
                "Если средняя оценка аспиранта равна 5, то сумма 2000, иначе 1800.\n");

        Student student = new Student("Виктор", "Вербов", "Gr111", 5);
        Aspirant aspirant1 = new Aspirant("Александр", "Невзоров", "Gr222", 4.5, "Work1");
        Student student2 = new Aspirant("Антон", "Бобров", "Gr333", 5, "Work2");

        Student[] students = {student, aspirant1, student2};
        for (Student s: students){
            s.print();
            System.out.print(", сумма стипендии: ");
            System.out.println(s.grants());
        }
    }
}
