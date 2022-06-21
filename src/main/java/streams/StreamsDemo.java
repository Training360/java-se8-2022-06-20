package streams;

import sortdemo.Employee;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class StreamsDemo {

    public static void main(String[] args) {
        List<sortdemo.Employee> employees = new ArrayList<>(List.of(
                new sortdemo.Employee("Jane Doe x", 1980),
                new sortdemo.Employee("Jack Doe", 1990),
                new Employee("John Doe xxx", 1970)
        ));

        var names = employees.stream()
//                .peek(e -> System.out.println(e))
                .filter(e -> e.getYearOfBirth() <= 1980)
                .map(e -> e.getName())
                .sorted(Collator.getInstance(new Locale("hu", "HU")))
                .toList();

        System.out.println(names);

        System.out.println(IntStream.rangeClosed(1, 5).summaryStatistics());

    }
}
