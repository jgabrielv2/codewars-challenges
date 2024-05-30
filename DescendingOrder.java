import java.util.*;

public class DescendingOrder {

        public static int sortDesc(final int num) {

        char[] numeros = Integer.toString(num).toCharArray();
        List<Integer> listNumeros = new ArrayList<>();
        StringBuilder numDesc = new StringBuilder();
        for (char numero : numeros) {
            listNumeros.add(Integer.parseInt(String.valueOf(numero)));
        }
        listNumeros.sort(Comparator.reverseOrder());

        for (int numero : listNumeros) {
            numDesc.append(numero);
        }
        return Integer.parseInt(numDesc.toString());

    }


    public static void main(String[] args) {
        System.out.println(sortDesc(826953714));

    }

}
