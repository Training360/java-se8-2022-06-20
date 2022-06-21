package streams;

import java.util.List;
import java.util.Optional;

public class Operations {

    public static List<String> getMiddleNames(List<String> names) {
        return names.stream().flatMap(name -> getMiddleName(name).stream()).toList();
    }

    public static void main(String[] args) {
        List<String> names = List.of("Aaaa Bbbb CCC", "John Doe", "Jack Doe", "Agre ewr ewrw");
        System.out.println(getMiddleNames(names));
    }

    public static Optional<String> getMiddleName(String name) {
        String[] parts = name.split(" ");
        if (parts.length == 3) {
            return Optional.of(parts[1]);
        }
        else {
            return Optional.empty();
        }
    }
}
