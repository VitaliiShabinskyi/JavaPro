package classStructure1;

import java.util.Arrays;
import java.util.List;

/**
 * Создайте папку classStructure1
 * Создайте классы
 * *
 * - Company
 *     - name
 *     - Set<Employee>
 *     - Set<Department>
 * *
 * - Employee
 *     - name
 *     - Department(энам)
 *     - Position(энам)
 *     - double salary
 * *
 * - Info
 *     - Map<Position, List<String>>
 *     - checker() - на вход сотрудника, на выходе String в зависимости от позишн
 *     - avgSalaryDep() - на вход Set<Employee>, Department, на выход средняя зп по департаменту
 *     - maxSalary() - на вход Set<Employee>, Department, на выход max зп по департаменту + у кого такая зп(имя)
 *     - minSalary() - на вход Set<Employee>, Department, на выход min зп по департаменту + у кого такая зп(имя)
 *     - getPromotion() - на вход сотрудника. в методе - засетить переход на одну позицию выше и зп на 25% больше.
 */
public class Main {

    public static void main(String[] args) {
        // Создаем компанию
        Company company = new Company("X-Files");

        // Создаем сотрудников
        Employee employee1 = new Employee("Dana Scully", Department.IT, Position.MIDDLE, 140);
        Employee employee2 = new Employee("Chris Carter", Department.ADMINISTRATION, Position.DIRECTOR, 310);
        Employee employee3 = new Employee("Walter Skinner", Department.MARKETING, Position.SENIOR, 135);
        Employee employee4 = new Employee("Smoking Man", Department.SALES, Position.JUNIOR, 80);
        Employee employee5 = new Employee("Fox Mulder", Department.IT, Position.SENIOR, 150);
        Employee employee6 = new Employee("John Doggett", Department.SALES, Position.JUNIOR, 110);

        // Добавляем сотрудников
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        company.addEmployee(employee4);
        company.addEmployee(employee5);
        company.addEmployee(employee6);

        Info info = new Info();
        List<String> position1Info = Arrays.asList("Info line 1", "Info line 2");
        List<String> position2Info = Arrays.asList("Info line 3", "Info line 4");
        List<String> position3Info = Arrays.asList("Info line 5", "Info line 6", "Info line 7");
        info.setPositionInfoMap(Position.JUNIOR, position1Info);
        info.setPositionInfoMap(Position.MIDDLE, position2Info);
        info.setPositionInfoMap(Position.SENIOR, position3Info);

        System.out.println("Компания " + company.getName());
        // Проверка информации
        for (Employee employee : company.getEmployees()) {
            System.out.println(employee.getName() + ": " + info.checker(employee) + "\tЗП: $" + employee.getSalary());

        }

        System.out.println();
        System.out.printf("Средняя зарплата по департаменту %s: $%.2f\n", Department.IT, info.avgSalaryDep(company.getEmployees(), Department.IT));

        System.out.println(info.maxSalary(company.getEmployees(), Department.IT));

        System.out.println(info.minSalary(company.getEmployees(), Department.SALES));

        // Повышаем сотрудника. 1 вариант
        info.getPromotion(employee4);
        System.out.println("У сотрудника " + employee4.getName() + " новая должность: " + employee4.getPosition());
        System.out.println("У сотрудника " + employee4.getName() + " новая ЗП: " + employee4.getSalary());

        // Повышаем сотрудника. 2 вариант с проверкой на максимум должности
        Position oldPosition = employee2.getPosition();
        info.getPromotion(employee2);
        if (oldPosition == employee2.getPosition()) {
            System.out.println("У сотрудника " + employee2.getName() + " максимальная должность: " + employee2.getPosition());
        } else {
            System.out.println("У сотрудника " + employee2.getName() + " новая должность: " + employee2.getPosition());
        }
        System.out.println("У сотрудника " + employee2.getName() + " новая ЗП: " + employee2.getSalary());

    }
}
