import java.util.stream.Collectors;

/**
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 * <p>
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
 * <p>
 * Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)
 * <p>
 * Note: The function accepts an integer and returns an integer.
 * <p>
 * Happy Coding!
 */
public class SquareDigit {
    public int squareDigits(int n) {
        StringBuilder sb = new StringBuilder();

        for (char num : String.valueOf(n).toCharArray()) {
            sb.append((int)Math.pow(Character.getNumericValue(num), 2));
        }
        return Integer.parseInt(sb.toString());
    }

    public int newSquareDigit(int n){
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }
}
