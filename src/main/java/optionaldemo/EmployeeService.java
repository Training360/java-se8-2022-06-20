package optionaldemo;

import java.util.Optional;

public class EmployeeService {

    public Optional<String> findById(Long id) {
        if (true) {
            return Optional.of("John");
        }
        else {
            return Optional.empty();
        }
    }

    public String getEmployee(Long id) {
        return findById(id).orElseThrow();
    }
}
