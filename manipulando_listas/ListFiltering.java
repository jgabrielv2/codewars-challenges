package manipulando_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
 * <p>
 * Example
 * <pre>{@Code
 * Kata.filterList(List.of ( 1, 2, " a ", " b ")) => List.of(1,2)
 * Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
 * Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
 * }</pre>
 */
public class ListFiltering {
    public static List<Object> filterListOld(final List<Object> list) {
        List<Object> inteiros = new ArrayList<>();
        list.forEach(object -> {
            if (object instanceof Integer) {
                inteiros.add(object);
            }
        });
        return inteiros;
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(o -> o instanceof Integer).collect(Collectors.toList());
    }

    public static List<Object> filterListNew(final List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).collect(Collectors.toList());
    }
}
