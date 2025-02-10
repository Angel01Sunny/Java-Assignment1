public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);
        
        str.concat(" World");
        System.out.println("After concat: " + str); // Original string remains unchanged
        
        String newStr = str.concat(" World");
        System.out.println("New String: " + newStr); // Hello World
    }
}