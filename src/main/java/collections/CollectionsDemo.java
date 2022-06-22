package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

    public static void main(String[] args) {
        var names = new ArrayList<String>();
        names.add("John");
        names.add("Jack");

        var l = Collections.unmodifiableList(names);
        names.add("Jane");
    }
}
