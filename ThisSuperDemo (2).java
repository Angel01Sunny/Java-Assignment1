class Parent {
    String name;

    Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    String name;

    Child(String name) {
        super(name); // Calls Parent constructor
        this.name = name; // Refers to the Child's name
    }

    void display() {
        System.out.println("Parent Name: " + super.name);
        System.out.println("Child Name: " + this.name);
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        Child child = new Child("Alice");
        child.display();
    }
}