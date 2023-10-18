/**
 * @author Azam
 */
public class Employee {
    private Integer id;
    private String name;
    private Long Salary;
    private Integer DepartmentId;

    public Employee(Integer id, String name, Long salary, Integer departmentId) {
        this.id = id;
        this.name = name;
        Salary = salary;
        DepartmentId = departmentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

    public Integer getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        DepartmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                ", DepartmentId=" + DepartmentId +
                '}';
    }
}
