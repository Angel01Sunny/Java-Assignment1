class MathOperations {
    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class AdvancedMathOperations extends MathOperations {
    // Method Overriding
    @Override
    int add(int a, int b) {
        System.out.println("Adding integers in AdvancedMathOperations");
        return super.add(a, b);
    }
}

public class OverloadingOverridingDemo {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 10)); // 15
        System.out.println(math.add(5.5, 10.5)); // 16.0

        AdvancedMathOperations advancedMath = new AdvancedMathOperations();
        System.out.println(advancedMath.add(5, 10)); // Adding integers in AdvancedMathOperations
    }
}