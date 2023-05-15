import employees.*;
import vehicles.*;

// Класс для управления автосалоном
public class CarDealership implements VehicleFactory {
    private Manager manager;
    private Seller seller;
    private Security security;

    public CarDealership(Manager manager, Seller seller, Security security) {
        this.manager = manager;
        this.seller = seller;
        this.security = security;
    }

    public void manageDealership() {
        manager.manage();
        seller.sell();
        security.guard();
    }

    // Геттеры и сеттеры для свойств автосалона
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    @Override
    public NewCar createCar(String make, String model, int year, double price) {
        // Создание объекта автомобиля
        return new NewCar(make, model, year, price);
    }

    @Override
    public Motorcycle createMotorcycle(String make, String model, int year, double price) {
        // Создание объекта мотоцикла
        return new Motorcycle(make, model, year, price);
    }
}
