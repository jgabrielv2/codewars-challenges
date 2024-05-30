public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int contador = 0;
        for (Boolean hasSheep : arrayOfSheeps) {
            if (hasSheep != null && hasSheep)
                contador += 1;
        }
        return contador;
    }

    public static void main(String[] args) {

        Boolean[] arrayOfSheeps = {true, true, null, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};

        System.out.println(countSheeps(arrayOfSheeps));

    }
}
