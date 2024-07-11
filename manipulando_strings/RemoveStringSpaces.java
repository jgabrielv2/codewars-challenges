package manipulando_strings;

public class RemoveStringSpaces {

    public static String noSpace(String x) {
        return x.replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(noSpace(" joao gabriel da silva   vidal "));
    }
}
