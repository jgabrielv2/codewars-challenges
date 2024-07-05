import java.util.stream.*;

/**
 * If you can't sleep, just count sheep!!
 * <p>
 * Task:
 * Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
 */
public class CountingSheeps {

    public static String countingSheepOld(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i).append(" sheep...");
        }
        return sb.toString();
    }

    public static String countingSheep(int num) {
        return IntStream.rangeClosed(1, num).mapToObj(i -> i + " sheep...").collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(5));
    }

}
