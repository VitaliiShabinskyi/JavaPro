class Suv extends Car {
    public Suv(String brand, String model, int year, double price) {
        super(brand, model, year, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("SUV: " + getBrand() + " " + getModel() + ", Год: " + getYear() + ", Цена: $" + getPrice());
    }
}