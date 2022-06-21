package streams;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee implements Comparable<Employee> {

    private String name;

    private int yearOfBirth;

    @Override
    public int compareTo(Employee o) {
        // return name.compareTo(o.name);
        return yearOfBirth - o.yearOfBirth;
    }

    public int getNameLength() {
        return name.length();
    }
}
