package demo;

public class Employee implements HasName, Human{

    @Override
    public String getName() {
        return Human.super.getName() + " " +
                HasName.super.getName();
    }

    public String getDetailedName() {
        return Human.super.getName() + " " +
                HasName.super.getName();
    }

    public static void main(String[] args) {
        System.out.println(new Employee().getName());
        System.out.println(new Employee().getDetailedName());
    }
}
