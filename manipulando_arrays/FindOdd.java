package manipulando_arrays;

/**
 * <a href="https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java">Link do desafio</a>
 * <p>
 * Given an array of integers, find the one that appears an odd number of times.
 * <p>
 * There will always be only one integer that appears an odd number of times.
 * <p>
 * Examples
 * [7] should return 7, because it occurs 1 time (which is odd).
 * [0] should return 0, because it occurs 1 time (which is odd).
 * [1,1,2] should return 2, because it occurs 1 time (which is odd).
 * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
 * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */

public class FindOdd {
    public static int findIt(int[] a) {
        java.util.Map<Integer, Integer> nums = new java.util.HashMap<>();

        for (int num : a) {
            if (nums.containsKey(num)) {
                nums.put(num, nums.get(num) + 1);

            } else {
                nums.put(num, 1);
            }
        }
        return 0;
    }
}
