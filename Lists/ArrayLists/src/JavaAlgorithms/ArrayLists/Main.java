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



    }
}
