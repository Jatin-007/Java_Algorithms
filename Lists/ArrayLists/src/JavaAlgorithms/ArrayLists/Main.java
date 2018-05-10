package JavaAlgorithms.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Elon", "Musk", 123));
        employeeList.add(new Employee("Gary", "Vaynerchuk", 12333));
        employeeList.add(new Employee("Jeff", "Bezos", 332));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("Size of the list is: " + employeeList.size());
        System.out.println("Adding a new employee");
        employeeList.add(3, new Employee("Jatin", "Suneja", 777));
        System.out.println(employeeList.get(3));

        System.out.println("Converting the list to an array");

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee: employeeArray) {
            System.out.println(employee);
        }

        // contains certain data ...
        System.out.println(employeeList.contains(new Employee("Elon", "Musk", 123)));

        // indexOf method
        System.out.println(employeeList.indexOf(new Employee("Jeff", "Bezos", 332)));

        employeeList.remove(3);

        employeeList.forEach(employee -> System.out.println(employee));
    }
}
