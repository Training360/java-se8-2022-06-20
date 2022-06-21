package sortdemo;

import java.util.Comparator;

public class ByYearCompartor implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getYearOfBirth() - o2.getYearOfBirth();
    }
}
