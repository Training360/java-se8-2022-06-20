package employees;

public class EmployeeRepository {

    public long saveEmployee(String name) {
        // JDBC vagy JPA - insert
        System.out.println("Save employee: " + name);
        return 1;
    }
}
