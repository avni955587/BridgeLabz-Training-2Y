package Map;

import java.util.*;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}

public class GroupEmployees {
    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<String>> map = new HashMap<>();

        for (Employee e : list) {
            map.computeIfAbsent(e.dept, k -> new ArrayList<>()).add(e.name);
        }

        System.out.println(map);
    }
}
