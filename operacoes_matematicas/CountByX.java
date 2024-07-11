package operacoes_matematicas;

import java.util.Arrays;

public class CountByX {

    public static int[] countBy(int x, int n) {
        int[] multiplos = new int[n];
        for (int i = 1; i <= n; i++) {
            multiplos[i - 1] = x * i;
        }
        return multiplos;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(2, 5)));
    }

}
