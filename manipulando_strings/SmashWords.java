package manipulando_strings;

public class SmashWords {

    public static String smach(String... words) {
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String[] words = {"joão", "gabriel", "da", "silva", "vidal"};
        System.out.println(smach(words));
    }
}
