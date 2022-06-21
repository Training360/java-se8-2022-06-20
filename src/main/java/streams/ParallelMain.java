package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelMain {

    public static void main(String[] args) {
//        IntStream
//                .range(0, 100)
//                .mapToDouble(i -> Math.random())
//                .mapToObj(d -> d)
//                .toList();

        DoubleStream
                .generate(() -> Math.random())
                .limit(100)
                .mapToObj(d -> d)
                .toList();

        Stream.generate(Math::random).limit(100).toList();


    }
}
