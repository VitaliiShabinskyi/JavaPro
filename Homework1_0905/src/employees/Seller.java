package employees;

public class Seller {
    private String name;
    private int age;
    private double baseSalary;
    private double commissionRate;

    public Seller(String name, int age, double baseSalary, double commissionRate) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
    }

    public void sell() {
        System.out.println("Продавец " + name + " продал автомобиль.");
        // Дополнительная логика для продажи автомобилей
    }

    public double calculateCommission(double totalSales) {
        double commission = totalSales * commissionRate;
        System.out.println("Продавец " + name + " заработал комиссию $" + commission);
        // Дополнительная логика для расчета комиссии
        return commission;
    }

    public void calculateSalary() {
        double totalSalary = baseSalary + calculateCommission(100000.0); // Расчет комиссии для общей продажи в $100,000
        System.out.println("Продавцу " + name + " начислена зарплата $" + totalSalary);
        // Дополнительная логика для расчета зарплаты продавца
    }

    // Геттеры и сеттеры для свойств продавца
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
