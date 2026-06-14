package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employees {

    private long id;
    private String name;
    private double salary;
    private List<Department> departments;
    private List<Address> address;

    public Employees(long id, String name, double salary, List<Department> departments, List<Address> address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departments = departments;
        this.address = address;
    }

    public static void main(String[] args) {

        Department department = new Department(1, "HR");
        Department department1 = new Department(2, "IT");
        Department department2 = new Department(3, "Finance");
        Department department3 = new Department(4, "HR");
        Department department4 = new Department(5, "Admin");

        Employees employee = new Employees(1, "Alex", 30000, null, null);
        Employees employee1 = new Employees(2, "Tom", 40000, null, null);

        employee.setDepartments(Arrays.asList(department, department1, department2, department3));
        employee1.setDepartments(Arrays.asList(department, department1, department2, department3, department4));

        List<Employees> employees = Arrays.asList(employee, employee1);

        //Fetch all Department names
        List<String> departmentNames = employee.getDepartments().stream().map(Department::getName).toList();

        //[HR, IT, Finance, HR, IT]
        System.out.println(departmentNames);

        //Unique Department names or remove duplicate department names
        List<String> uniqueDepartmentNames = employee.getDepartments().stream().map(Department::getName).distinct().toList();

        //[HR, IT, Finance]
        System.out.println(uniqueDepartmentNames);

        //Fetch particular department by department name e.g. "IT"
        boolean hasITDepartment = employee.getDepartments().stream().anyMatch(d -> d.getName().equals("IT"));

        //true
        System.out.println(hasITDepartment);

        //Sort Departments by their names
        List<Department> departments = employee.getDepartments().stream().sorted(Comparator.comparing(Department::getName)).toList();

        //[Finance, HR, HR, IT, IT]
        System.out.println(departments.stream().map(Department::getName).toList());

        //Group department by their name & count
        Map<String, Long> departmentCount = employee.getDepartments().stream().collect(Collectors.groupingBy(Department::getName, Collectors.counting()));

        //{Finance=1, HR=2, IT=2}
        System.out.println(departmentCount);

        //Find first Department in the list
        Optional<Department> optionalDepartment = employee.getDepartments().stream().findFirst();

        //true
        System.out.println(optionalDepartment.isPresent());

        //Concatenate all department names into single string seperated by commas
        String departmentName = employee.getDepartments().stream().map(Department::getName).collect(Collectors.joining(", "));

        //HR, IT, Finance, HR, IT
        System.out.println(departmentName);

        //Filter Departments name longer than 3 character
        List<Department> filteredDepartments = employee.getDepartments().stream().filter(d -> d.getName().length() > 3).toList();

        //[Finance, Admin]
        System.out.println(filteredDepartments.stream().map(Department::getName).toList());

        //Filter the longest department name
        Optional<Department> filteredDepartments1 = employee.getDepartments().stream().max(Comparator.comparing(dept -> dept.getName().length()));

        //[Finance]
        System.out.println(filteredDepartments1.stream().map(Department::getName).toList());

        //Filter the shortest department name
        Optional<Department> filteredDepartments2 = employee.getDepartments().stream().min(Comparator.comparing(dept -> dept.getName().length()));

        //[HR]
        System.out.println(filteredDepartments2.stream().map(Department::getName).toList());

        //Partitioned Department into two groups by names starting with 'A'
        Map<Boolean, List<Department>> partitionedDepartment = employee.getDepartments().stream().collect(Collectors.partitioningBy(d -> d.getName().startsWith("A")));

        // false [HR, IT, Finance, HR] true [Admin]
        partitionedDepartment.forEach((k, v) -> System.out.println(k + " " + v.stream().map(Department::getName).toList() + " "));

        //Calculate total numbers of departments
        long countDepartment = employee.getDepartments().stream().distinct().count();

        //Count Unique Departments
        System.out.println(countDepartment);

        //FlatMap Nested Departments
        List<String> allDepartments = employees.stream().flatMap(emp -> emp.getDepartments().stream()).map(Department::getName).distinct().toList();

        //[HR, IT, Finance, Admin]
        System.out.println(allDepartments);

        //Sort employee by number of departments
        List<Employees> sortedEmp = employees.stream().sorted(Comparator.comparing(emp -> emp.getDepartments().size())).toList();

        //[Employee{id=1, name='Alex', salary=30000.0, departments=[Department{deptId=1, name='HR'}, Department{deptId=2, name='IT'}, Department{deptId=3, name='Finance'}, Department{deptId=4, name='HR'}], address=null}, Employee{id=2, name='Tom', salary=40000.0, departments=[Department{deptId=1, name='HR'}, Department{deptId=2, name='IT'}, Department{deptId=3, name='Finance'}, Department{deptId=4, name='HR'}, Department{deptId=5, name='Admin'}], address=null}]
        System.out.println(sortedEmp);

        //get the average salary of employees
        double avgSalary = employees.stream().mapToDouble(Employees::getSalary).average().orElse(0.0);

        //35000.0
        System.out.println(avgSalary);

        //Find the highest paid salary of employee
        Optional<Employees> highestPaid = employees.stream().max(Comparator.comparingDouble(Employees::getSalary));

        //40000.0
        System.out.println(highestPaid.get().getSalary());

        //Find the lowest paid salary of employee
        Optional<Employees> lowestPaid = employees.stream().min(Comparator.comparingDouble(Employees::getSalary));

        //30000.0
        System.out.println(lowestPaid.get().getSalary());

        Map<String, Long> collectByDept = employee.getDepartments().stream().collect(Collectors.groupingBy(Department::getName, Collectors.counting()));

        System.out.println(collectByDept);

        collectByDept.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);


    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", departments=" + departments +
                ", address=" + address +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }


}


