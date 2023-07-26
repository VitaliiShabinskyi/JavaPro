import com.github.javafaker.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Generator {
    private final Faker faker;

    public Generator() {
        this.faker = new Faker(new Locale("ru"));
    }

    public List<Developer> generateDevelopers(int count) {
        List<Developer> developers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            int age = faker.number().numberBetween(18, 65);
            double salary = faker.number().numberBetween(3000, 15000);
            char gender = faker.bool().bool() ? 'М' : 'Ж';
            Car car = generateCar();
            developers.add(new Developer(firstName, lastName, age, salary, gender, car));
        }
        return developers;
    }

    public Car generateCar() {
        String color = faker.color().name();
        boolean isSport = faker.bool().bool();
        CarBrand brand = CarBrand.values()[faker.number().numberBetween(0, CarBrand.values().length)];
        int maxSpeed = faker.number().numberBetween(150, 300);
        return new Car(color, isSport, brand, maxSpeed);
    }
}
