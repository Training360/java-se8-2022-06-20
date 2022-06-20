package lambda;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class NameQueryCriteria implements QueryCriteria {

    private String name;

    @Override
    public boolean match(Employee employee) {
        return employee.getName().equals(name);
    }
}
