package animal;

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("Информация о животном");
    }

    public void makeSound() {
        System.out.println("Что говорит животное");
    }

    @Override
    public String toString(){
        return "Животное: " + name;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Animal)){
            return false;
        }
        Animal a = (Animal)obj;
        return this.name.equals(a.name);
    }
}

class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void info() {
        System.out.printf("Я кот. Меня зовут %s. Мой возраст %d.%n", super.getName(), super.getAge());
    }

    @Override
    public void makeSound() {
        System.out.printf("%s мяукает.%n", super.getName());
    }
}

class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void info() {
        System.out.printf("Я собака. Меня зовут %s. Мой возраст %d.%n", super.getName(), super.getAge());
    }

    @Override
    public void makeSound() {
        System.out.printf("%s гавкает.%n", super.getName());
    }
}

public class Main {
    public static void main(String[] args) {
//        final int N = 2;
//        Animal anim[] = new Animal[N];
//        anim[0] = new Cat("Пушок", 2);
//        anim[1] = new Dog("Мухтар", 4);
//
//        for (int i = 0; i < N; ++i) {
//            anim[i].info();
//            anim[i].makeSound();
//    }
        Animal an = new Animal("Терри", 5);
        Animal an2 = new Animal("Барсик", 2);
        System.out.println(an.equals(an2));  // false

        Animal an1 = new Animal("Терри", 5);
        System.out.println(an.equals(an1));  // false
    }
}
