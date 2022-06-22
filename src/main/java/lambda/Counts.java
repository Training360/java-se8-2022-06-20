package lambda;

import lombok.ToString;

import java.text.Collator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@ToString
public class Counts {

    private int numberOfPositives;

    private int numberOfZeros;

    private int numberOfNegatives;

    public void classify(int number) {
        if (number > 0) {
            numberOfPositives++;
        }
        else if (number == 0) {
            numberOfZeros++;
        }
        else {
            numberOfNegatives++;
        }
    }

    public Counts addAll(Counts another) {
        numberOfPositives += another.numberOfPositives;
        numberOfZeros += another.numberOfZeros;
        numberOfNegatives += another.numberOfNegatives;
        return this;
    }

    public static Collector<Integer, Counts, Counts> count() {
        return
                Collector.of(Counts::new, Counts::classify, Counts::addAll);
    }
}
