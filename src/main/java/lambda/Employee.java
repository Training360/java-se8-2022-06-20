package lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private String name;

    private int yearOfBirth;
}
