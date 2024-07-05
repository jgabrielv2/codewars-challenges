public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        return a < b + c && b < a + c && c < a + b && a > 0 && b > 0 && c > 0;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(1, 2, 3));
    }
}

