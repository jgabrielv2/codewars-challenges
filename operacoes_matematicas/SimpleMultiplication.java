package operacoes_matematicas;

/**
 * This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
 */
public class SimpleMultiplication {
    public static int simpleMultiplication(int n) {
        return (n % 2 == 0) ? 8 * n : 9 * n;
    }
}
