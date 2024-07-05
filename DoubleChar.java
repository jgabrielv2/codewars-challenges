/**
 * Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
 * <p>
 * Examples (Input -> Output):
 * <pre>
 * * "String"      -> "SSttrriinngg"
 * * "Hello World" -> "HHeelllloo  WWoorrlldd"
 * * "1234!_ "     -> "11223344!!__  "
 * </pre>
 * Good Luck!
 */
public class DoubleChar {
    public static String doubleCharOld(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            sb.append(c);
            sb.append(c);
        }
        return sb.toString();
    }

    public static String doubleCharNotSoGood(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) sb.append(c).append(c);
        return sb.toString();
    }


    // o regex "." corresponde a qualquer caracter. O regex '$0' representa o caractere correspondente
    public static String doubleChar(String s) {
        return s.replaceAll(".", "$0$0");
    }
}
