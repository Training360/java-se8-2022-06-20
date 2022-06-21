package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // Raw type - kerüljük
        List l = names;

        // Heap pollution
        l.add(Integer.valueOf(15));

        for (String s: names) {
            System.out.println(s);
        }

        List<Object> items;
        List<String> fruits = List.of("banana", "apple");

        items = (List)fruits;

    }
}
