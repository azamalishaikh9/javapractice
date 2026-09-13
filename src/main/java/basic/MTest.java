package basic;

import oops.Employee1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MTest {

    public static void main(String[] args) {
//        How would you group a list of employees by department and then by their role, and calculate the average salary for each role within each department?

        List<Employee1> employees = Arrays.asList(
                new Employee1("Alice", "Engineering", "Developer", 75000),
                new Employee1("Bob", "Engineering", "Developer", 80000),
                new Employee1("Charlie", "Engineering", "Manager", 90000),
                new Employee1("David", "HR", "Recruiter", 60000),
                new Employee1("Eve", "HR", "Manager", 85000)
        );

        Map<String, Map<String, Double>> averageSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee1::getDepartment,
                        Collectors.groupingBy(Employee1::getRole,
                                Collectors.averagingDouble(Employee1::getSalary))));

        averageSalaries.forEach((department, roles) -> {
            System.out.println("Department: " + department);
            roles.forEach((role, avgSalary) -> System.out.println("  Role: " + role + ", Average Salary: " + avgSalary));
        });

    }
}

