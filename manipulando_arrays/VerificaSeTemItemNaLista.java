package manipulando_arrays;

import java.util.Arrays;

/**
 * You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
 * <p>
 * Array can contain numbers or strings. X can be either.
 * <p>
 * Return true if the array contains the value, false if not.
 */
public class VerificaSeTemItemNaLista {

    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a).toList().contains(x);
    }
}
