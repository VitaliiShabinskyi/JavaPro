package classStructure1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Info {

    private final Map<Position, List<String>> positionInfoMap = new HashMap<>();

    public void setPositionInfoMap(Position position, List<String> info) {
        positionInfoMap.put(position, info);
    }

    public String checker(Employee employee) {
        List<String> info = positionInfoMap.get(employee.getPosition());
        if (info != null && !info.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
//            for (String row : info) {
//                stringBuilder.append(row).append(", ");
//            }
            for (int i = 0; i < info.size(); i++) {
                stringBuilder.append(info.get(i));
                if (i == info.size() - 1) {
                    stringBuilder.append(".");
                } else {
                    stringBuilder.append(", ");
                }
            }
            return stringBuilder.toString();
        } else {
            return "Описание позиции не найдено.";
        }
    }

    public double avgSalaryDep(Set<Employee> employees, Department department) {
        double salarySumm = 0;
        int count = 0;

        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                salarySumm += employee.getSalary();
                count++;
            }
        }
        if (count > 0) {
            return salarySumm / count;
        } else {
            return 0;
        }
    }

    public String maxSalary(Set<Employee> employees, Department department) {
        double maxSalary = 0;
        String employeeMax = "";

        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeMax = employee.getName();
            }
        }

        if (!employeeMax.isEmpty()) {
            return "Максимальная ЗП по департаменту " + department + ": у сотрудника " + employeeMax + " и составляет $" + maxSalary;
        } else {
            return "В департаменте " + department + " сотрудники не найдены";
        }
    }

    public String minSalary(Set<Employee> employees, Department department) {
        double minSalary = Double.MAX_VALUE;
        String employeeMin = "";

        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeMin = employee.getName();
            }
        }

        if (!employeeMin.isEmpty()) {
            return "Минимальная ЗП по департаменту " + department + ": у сотрудника " + employeeMin + " и составляет $" + minSalary;
        } else {
            return "В департаменте " + department + " сотрудники не найдены";
        }
    }

    public void getPromotion(Employee employee) {
        Position currentPosition = employee.getPosition();
        double currentSalary = employee.getSalary();

        Position newPosition = null;
        for (Position position : Position.values()) {
            if (position.ordinal() == currentPosition.ordinal() + 1) {
                newPosition = position;
                break;
            }
        }

        if (newPosition != null) {
            double newSalary = currentSalary * 1.25;
            employee.setPosition(newPosition);
            employee.setSalary(newSalary);
        }
    }

}
