package vehicles;

public class Motorcycle {
    private String make;
    private String model;
    private int year;
    private double price;

    public Motorcycle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Геттеры и сеттеры для свойств мотоцикла
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.print("МОТОЦИКЛ: " + make + ", ");
        System.out.print("Модель: " + model + ", ");
        System.out.print("Год: " + year + ", ");
        System.out.print("Цена: $" + price);
        System.out.println();
    }
}
