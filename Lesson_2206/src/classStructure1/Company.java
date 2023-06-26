package classStructure1;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Company {
    private final String name;
    private final Set<Employee> employees;
    private final Set<Department> departments;

    public Company(String name) {
        this.name = name;
        this.employees = new HashSet<>();
        this.departments = new HashSet<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        departments.add(employee.getDepartment());
    }

    @Override
    public String toString() {
        return "Company{" +
                "\nname='" + name + '\'' +
                ", \nemployees=" + employees +
                ", \ndepartments=" + departments +
                '}';
    }
}
