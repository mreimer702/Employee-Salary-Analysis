import java.util.ArrayList;

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

        ArrayList<String> employeeInfo = new ArrayList<>();
        for (Employee employee : employees) {
            String info = "Name: " + employee.getName() +
                    ", Age: " + employee.getAge() +
                    ", Salary: $" + employee.getSalary() +"0";
            employeeInfo.add(info);
        }

        System.out.println("Employee Info:");
        for (String info : employeeInfo) {
            System.out.println(info);
        }
    }
}
