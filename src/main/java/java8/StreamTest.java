package java8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Azam", 18, 10000));
        employees.add(new Employee(2, "Ali", 20, 15000));
        employees.add(new Employee(3, "Ajamali", 22, 17000));
        employees.add(new Employee(3, "Azamali Shaikh", 24, 12000));
        employees.add(new Employee(3, "Ali Shaikh", 25, 17000));

//        System.out.println(employees);

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .skip(2)
                .forEach(System.out::println);

        Map<Long, Long> salaryCount = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));

        System.out.println(salaryCount);

//        if(!list.isEmpty()){
//            System.out.println(list);
//        }
    }
}

