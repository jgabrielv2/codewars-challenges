package manipulando_listas;

import java.util.Arrays;

import static java.util.Arrays.stream;

/**
 * There was a test in your class and you passed it. Congratulations!
 * <p>
 * But you're an ambitious person. You want to know if you're better than the average student in your class.
 * <p>
 * You receive an array with your peers' test scores. Now calculate the average and compare your score!
 * <p>
 * Return true if you're better, else false!
 * <p>
 * Note:
 * Your points are not included in the array of your class's points. Do not forget them when calculating the average score!
 */

public class HowGoodAreYouReally {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints){
        return yourPoints > (stream(classPoints).sum() + yourPoints)/(classPoints.length + 1);
    }
}
