class AccessModifiers {
    public String publicVar = "Public Variable";
    protected String protectedVar = "Protected Variable";
    private String privateVar = "Private Variable";
    String defaultVar = "Default Variable"; // package-private

    void display() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(privateVar);
        System.out.println(defaultVar);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.display();
    }
}