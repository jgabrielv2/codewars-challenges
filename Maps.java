import java.util.Arrays;

public class Maps {
    /*
    Given an array of integers, return a new array with each value doubled.
    For example:
            [1, 2, 3] --> [2, 4, 6]
     */
    public static int[] map(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] *= 2;
//        }
//        return arr;
        return Arrays.stream(arr).map(numero -> numero*2).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(map(arr)));
    }
}
