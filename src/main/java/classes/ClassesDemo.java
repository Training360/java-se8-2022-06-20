package classes;

import java.util.Comparator;

public class ClassesDemo {

    // Member inner class
    class A {

    }

    // Static nested class
    static class B {

    }

    void doSomething() {
        // Local inner class
        class C {

        }

        // Anonymous inner class
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        } ;


    }
}

class Apple {

}
