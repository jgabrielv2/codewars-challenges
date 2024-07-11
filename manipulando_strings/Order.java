package manipulando_strings;

import java.util.Arrays;
import java.util.List;

/**
 * <a href=https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java>link da kata</a>
 * Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
 * <p>
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * <p>
 * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 * <p>
 * Examples
 * <pre>
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 * </pre>
 */
public class Order {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            List<String> list = Arrays.stream(words.split(" ")).toList();
            for (String texto : list) {
                texto.
            }

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.stream("is2 Thi1s T4est 3a".split(" ")).toList());
    }

}
