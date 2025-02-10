interface CanRun {
    void run();
}

interface CanBark {
    void bark();
}

class Dog implements CanRun, CanBark {
    public void run() {
        System.out.println("Dog runs fast");
    }

    public void bark() {
        System.out.println("Dog barks");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run(); // Dog runs fast
        dog.bark(); // Dog barks
    }
}