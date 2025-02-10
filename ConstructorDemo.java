class Car {
    String model;
    int year;

    // Constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020);
        car.displayInfo(); // Model: Toyota, Year: 2020
    }
}