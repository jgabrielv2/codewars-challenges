package manipulando_strings;

/**
 * In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.
 * <p>
 * The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning that the printer used three times color a, four times color b, one time color h then one time color a...
 * <p>
 * Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.
 * <p>
 * You have to write a function printer_error which given a string will return the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.
 * <p>
 * The string has a length greater or equal to one and contains only letters from ato z.
 * <p>
 * Examples:
 * s="aaabbbbhaijjjm"
 * printer_error(s) => "0/14"
 * <p>
 * s="aaaxbbbbyyhwawiwjjjwwm"
 * printer_error(s) => "8/22"
 */
public class Printer {

    public static String printerErrorOld(String s) {
        int count = 0;
        char[] letras = s.toCharArray();
        for (char letra : letras) {
            if (letra == 'a' || letra == 'b' || letra == 'c' || letra == 'd' || letra == 'e' || letra == 'f' || letra == 'g' || letra == 'h' || letra == 'i' || letra == 'j' || letra == 'k' || letra == 'l' || letra == 'm') {
            } else {
                count++;
            }
        }
        return count + "/" + letras.length;
    }

    public static String printerErrorTwo(String s){
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
    public static String printerError(String s) {
        return s.chars().filter(letra -> letra < 'a' || letra > 'm').count() + "/" + s.length();
    }
}
