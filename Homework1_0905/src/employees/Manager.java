package employees;

public class Manager {
    private String name;
    private int age;
    private double salary;

    public Manager(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void manage() {
        System.out.println("Менеджер " + name + " управляет автосалоном.");
    }

    public void promote(Seller seller ) {
        System.out.println("Менеджер " + name + " поставил продавцу " + seller.getName() + " 5 звёзд.");
        // Дополнительная логика для повышения продавца
    }

    public void calculateSalary() {
        System.out.println("Менеджеру " + name + " назначена зарплата $" + salary);
        // Дополнительная логика для расчета зарплаты менеджера
    }

    // Геттеры и сеттеры для свойств менеджера
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
