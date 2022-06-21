package sortdemo;

import java.text.Collator;
import java.util.*;

public class EmployeeMain {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Jane Doe x", 1980),
                new Employee("Jack Doe", 1990),
                new Employee("John Doe xxx", 1970)
        ));

        // Natural order szerint - compareTo szerint
//        Collections.sort(employees);

        Collections.sort(employees, new ByNameComparator());
        System.out.println(employees);

        Collections.sort(employees, new ByYearCompartor());
        System.out.println(employees);

        List<String> names = new ArrayList<>(List.of("Alma", "Béla", "Cecil", "Ádám", "Éva"));
//        names.sort(Comparator.naturalOrder());
        names.sort(Collator.getInstance(new Locale("hu", "HU")));
        System.out.println(names);


//        employees.sort(Comparator.comparingInt(o -> o.getName().length()));

        employees.sort(Comparator.comparingInt(EmployeeMain::nameLength));

        employees.sort(Comparator.comparing(Employee::getName));

        employees.sort(Comparator.comparingInt(Employee::getNameLength));

        System.out.println(employees);

    }

    public void sortEmployees() {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Jane Doe x", 1980),
                new Employee("Jack Doe", 1990),
                new Employee("John Doe xxx", 1970)
        ));
        employees.sort(Comparator.comparingInt(this::nameLengthOfEmployee));

        doSomething();
    }

    private void doSomething() {
    }

    private int nameLengthOfEmployee(Employee o) {
        return o.getName().length();
    }

    private static int nameLength(Employee o) {
        return o.getName().length();
    }
}
