package manipulando_arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Can you find the needle in the haystack?
 * <p>
 * Write a function <pre>findNeedle()</pre> that takes an array full of junk but containing one "needle"
 * <p>
 * After your function finds the needle it should return a message (as a string) that says:
 * <p>
 * "found the needle at position " plus the index it found the needle, so:
 * <p>
 * Example(Input --> Output)
 * <pre>
 * ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
 * </pre>
 * Note: In COBOL, it should return "found the needle at position 6"
 */
public class ANeedleInTheHaystack {

    public static String findNeedleOld(Object[] haystack) {
        int position = 0;
        for (int i = 0; i < haystack.length; i++) {
            // if (haystack[i].equals("needle")) ==> isso vai lancar NullPointerException caso haystack[i] == null{
            if ("needle".equals(haystack[i])) { // foi preciso chamar o "needle" primeiro, para não lançar NullPointerException
                position = i;
                break;
            }
        }
        return "found the needle at position " + position;
    }

    public static String findNeedleNotSoGood(Object[] haystack) {
        return "found the needle at position " + IntStream
                .range(0, haystack.length)
                .filter(i -> "needle".equals(haystack[i]))
                .findFirst().getAsInt();
    }

    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}
