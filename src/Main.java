import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee newemployee1 = new Employee("Alice", 33, 50000.00);
        Employee newemployee2 = new Employee("Bob", 45, 60000.00);
        Employee newemployee3 = new Employee("Charlie", 28, 48000.00);
        Employee newemployee4 = new Employee("Diana", 35, 52000.00);
        Employee newemployee5 = new Employee("Eve", 25, 45000.00);

        employees.add(newemployee1);
        employees.add(newemployee2);
        employees.add(newemployee3);
        employees.add(newemployee4);
        employees.add(newemployee5);

        System.out.println("List of Employees");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\n");
        List<Employee> result = employees.stream()
                .filter(employee -> employee.getSalary() > 50000.00)
                .collect(Collectors.toList());
        System.out.println("List of Employees making over $50,000");
        for (Employee employee : result) {
            System.out.println(employee);
        }
        System.out.println("\n");

        OptionalDouble result1 = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .mapToDouble(employee -> employee.getSalary())
                .average();

        System.out.println("Average Salary of Employees Over 30");
        System.out.println(result1);
        System.out.println("\n");

        List<Double> result2 = employees.stream()
                .map(employee -> employee.getSalary() * 1.1)
                .collect(Collectors.toList());
        int count = 0;
        for (Employee employee : employees) {
            employee.setSalary(result2.get(count));
            count ++;
        }
        System.out.println("List of Employees with a universal 10% raise in salary");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}