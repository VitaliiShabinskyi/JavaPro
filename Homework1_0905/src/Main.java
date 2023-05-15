/**
 *  1) Создать абстрактный класс(контракт) для автосалона. Придумать общие свойства для автомобилей
 *  2) Реализовать несколько конкретных классов автомобилей
 *  3) Создать работников автосалона: менеджер, продавец, охранник и т.д.
 *  4) Сделать класс для управления автосалоном
 *  5) Добавить в систему интерфейс. Вынести в него контракт для создания автомобилей и мотоциклов
 */

import vehicles.*;
import employees.*;

/**
 * Создал абстрактный класс vehicles.Car с общими свойствами автомобилей.
 * От него наследуются классы vehicles.Sedan и vehicles.Suv, которые представляют конкретные типы автомобилей.
 * Каждый класс автомобиля имеет свои собственные свойства и реализует абстрактный метод displayInfo(),
 * который выводит информацию об автомобиле.
 *
 * Определил классы работников автосалона: employees.Manager, employees.Seller и employees.Security.
 * Каждый из них имеет соответствующий метод для выполнения своих обязанностей.
 *
 * Создал класс CarDealership для управления автосалоном, который содержит экземпляры менеджера, продавца и охранника.
 * Метод manageDealership() в классе CarDealership вызывает методы работников для выполнения своих обязанностей.
 */
public class Main {

    public static void main(String[] args) {
        Car sedan = new Sedan("Toyota", "Camry", 2022, 25000.0);
        Car suv = new Suv("Honda", "CR-V", 2021, 30000.0);

        sedan.displayInfo();
        suv.displayInfo();

        // Создаем объекты работников автосалона
        Manager manager = new Manager("Иван", 40, 5000.0);
        Seller seller = new Seller("Алиса", 30, 2000.0, 0.05);
        Security security = new Security("Михаил", 35);


        // Создаем объект автосалона
        CarDealership carDealership = new CarDealership(manager, seller, security);

        // Создаем объект мотоцикла с помощью интерфейса VehicleFactory
        VehicleFactory vehicleFactory = carDealership;
        Motorcycle motorcycle = vehicleFactory.createMotorcycle("Honda", "CBR500R", 2021, 8000.0);
        NewCar mcv = vehicleFactory.createCar("Renault", "Logan MCV", 2015, 12500.0);

        // Управляем автосалоном
        carDealership.manageDealership();

        // Продавец повышается менеджером
        manager.promote(seller);

        // Расчет зарплаты менеджера и продавца
        manager.calculateSalary();
        seller.calculateSalary();

        // Вывод информации о мотоцикле
        motorcycle.displayInfo();
        mcv.displayInfo();

    }
}
