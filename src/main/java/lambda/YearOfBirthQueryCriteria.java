package lambda;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class YearOfBirthQueryCriteria implements QueryCriteria {

    private int yearOfBirth;

    @Override
    public boolean match(Employee employee) {
        return employee.getYearOfBirth() == yearOfBirth;
    }
}
