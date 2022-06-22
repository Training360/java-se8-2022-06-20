package lambda;

import java.util.List;
import java.util.stream.Collectors;

public class CountMain {

    public static void main(String[] args) {
        var numbers = List.of(1, -1, 1, -1, 1, 0);

//        System.out.println(
//                numbers.stream()
//                        .collect(
//                                Counts::new,
//                                Counts::classify,
//                                Counts::addAll
//                        )
//        );

        System.out.println(numbers.stream().collect(Counts.count()));
    }
}
