package animals;

public class Main {
    public static void main(String[] args) {
        final int N = 2;
        Animal animals[] = new Animal[N];
        animals[0] = new Dog("Герда");
        animals[1] = new Cat("Том");

        for (Animal anim : animals) {
            anim.makeSound();
            anim.sleep();
        }
    }
}

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void sleep() {
        System.out.println(name + " спит!");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " гавкает!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " мяукает!");
    }
}
