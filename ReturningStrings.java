public class ReturningStrings {
    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }

    public static void main(String[] args) {
        System.out.println(greet("João"));
    }
}
