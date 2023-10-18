import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Azam
 */
public class StreamPractice {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1, "Yash", 20000L, 2)
                , new Employee(2, "Greet", 90000L, 2)
                , new Employee(3, "XYZ", 80000L, 3)
                , new Employee(4, "LMN", 15000L, 4)
                , new Employee(5, "JKL", 10000L, 5));

        //Calculate average salary
        double average = employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("Average salary : " + average);

        //Calculate largest salary
        double highestSalary = employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0);

        System.out.println("Highest Salary : " + highestSalary);

        //List of employee who's salary is max
        List<Employee> highestSalaryEmployees = employees
                .stream()
                .filter(emp -> emp.getSalary() == highestSalary)
                .collect(Collectors.toList());

        highestSalaryEmployees.stream().forEach(System.out::println);

        String[] text = {"ABC", "JKL", "BLANK", "XYZ", "BLANK", "ABC"};

        //Remove Duplicate strings from list
        List<String> collect = Arrays.stream(text).distinct().collect(Collectors.toList());

        System.out.println(collect);

        //Duplicate String list
        List<String> duplicates = Arrays.stream(text)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicates);

        employees.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));

        System.out.println(63 + " " + employees);

        HashMap<Integer, Employee> empMap = new HashMap<>();
        for(Employee emp : employees){
            empMap.put(emp.getId(), emp);
        }

        System.out.println(empMap);

        Map<Integer, Employee> map = employees.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));

        System.out.println(map);

    }
}
