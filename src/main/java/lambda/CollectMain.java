package lambda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        System.out.println(numbers.stream().reduce(0, (x, y) -> x + y, (x, y) -> x + y));

        System.out.println(numbers.stream().collect(
                () -> new ArrayList<>(),
                (l, x) -> l.add(x),
                (l, j) -> l.addAll(j)
                ));

        Map<String, String> words = new HashMap<>(Map.of("kutya", "dog" ));

        words.put("kutya", "puppy");

        words.compute("macska", (k, v) -> v == null ? "kitty" : v + ", " + "kitty");
        System.out.println(words);

        String s = "xxXyyxXXyzz";
        // Egy utasítás: melyik karakter hányszor szerepel

        System.out.println(Arrays.toString(s.split("")));


        System.out.println(
                s.chars().mapToObj(i -> Character.toLowerCase((char) i)).collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                        ))
        );

        System.out.println(
                s.chars()
                        .mapToObj(i -> (char) i)
                        .map(Character::toLowerCase)
                        .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ))
        );

        System.out.println(
                s.chars()
                        .mapToObj(i -> (char) i)
                        .collect(Collectors.groupingBy(
                                c -> Character.toLowerCase(c),
                                Collectors.counting()
                        ))
        );


        System.out.println(
                Arrays.stream(s.split(""))
                        .map(String::toLowerCase)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ))
                );
    }

}
