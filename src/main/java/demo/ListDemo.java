package demo;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        String[] a = {"John", "Jack", "Jane"};
        // Ez egy tömb nézete, fix-sized, csúnya utility metódus
        List<String> names = Arrays.asList(a);
        names.set(1, "Jack2");
        System.out.println(names);
//        names.add("Joe");
        System.out.println(Arrays.toString(a));

        // Használjunk inkább List.of statikus metódust, de ez inmutable!
        // Használjunk copy-konstruktort!
        List<String> names2 = new ArrayList<>(List.of("John", "Jack", "Jane"));

        // Ne használjuk, csúnya utility metódus!
        // Collections.sort(names2);

        // Objektumorientáltabb, default példány metódus
        names2.sort(Comparator.naturalOrder());
//        System.out.println(names2);

    }
}
