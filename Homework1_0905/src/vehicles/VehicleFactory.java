package vehicles;

public interface VehicleFactory {
    NewCar createCar(String make, String model, int year, double price);
    Motorcycle createMotorcycle(String make, String model, int year, double price);
}
