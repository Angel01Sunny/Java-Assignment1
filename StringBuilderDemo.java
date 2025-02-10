public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 12, "Java");
        sb.delete(5, 6);
        
        System.out.println(sb.toString()); // HelloJava
    }
}