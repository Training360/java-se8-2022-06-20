package lambda;

import java.util.List;

public class EmployeeServiceMain {

    public static void main(String[] args) {
        var service = new EmployeeService(List.of(
                new Employee("John Doe", 1970),
                new Employee("Jane Doe", 1980),
                new Employee("Jack Doe", 1990)
        ));

//        System.out.println(service.findEmployee(new NameQueryCriteria("Jn Doe")));

//        System.out.println(service.findEmployee(QueryCriteria.byName("John Doe")));
//
//        // Anonymous inner class
//        System.out.println(service.findEmployee(new QueryCriteria() {
//            @Override
//            public boolean match(Employee employee) {
//                return employee.getName().startsWith("Ja");
//            }
//        }));

        System.out.println(service.findEmployee((Employee employee) -> {return employee.getName().startsWith("Ja");}));

        System.out.println(service.findEmployee(employee -> employee.getName().startsWith("Ja")));


    }
}
