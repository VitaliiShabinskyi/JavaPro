package classStructure1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private String name;
    private Department department;
    private Position position;
    private double salary;

    public Employee(String name, Department department, Position position, double salary) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
