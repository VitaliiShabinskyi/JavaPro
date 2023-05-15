package vehicles;

import vehicles.Car;

public class Sedan extends Car {
    public Sedan(String brand, String model, int year, double price) {
        super(brand, model, year, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Седан: " + getBrand() + " " + getModel() + ", Год: " + getYear() + ", Цена: $" + getPrice());
    }
}