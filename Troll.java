public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String... args) {
        System.out.println(disemvowel("helena gomes vidal"));
    }

}
