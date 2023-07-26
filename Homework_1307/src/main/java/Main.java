import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        List<Developer> developers = generator.generateDevelopers(10);

        DeveloperHandler developerHandler = new DeveloperHandler();
        developerHandler.printMaleWithSportCars(developers);

        System.out.println("\u2015" . repeat(30));

        Map<Character, List<Car>> carsByGender = developerHandler.groupCarsByGender(developers);
        for (char gender : carsByGender.keySet()) {
            System.out.println("Пол: " + gender);
            List<Car> cars = carsByGender.get(gender);
            for (Car car : cars) {
                System.out.println(car.getBrand() + " - " + car.getColor());
            }
            System.out.println();
        }

        System.out.println("\u2015" . repeat(30));

        Map<Developer, Integer> developerMaxSpeed = developerHandler.getDevelopersMaxSpeed(developers);
        for (Developer developer : developerMaxSpeed.keySet()) {
            System.out.println(developer.getFirstName() + " - Максимальная скорость: " + developerMaxSpeed.get(developer));
        }

        developerHandler.writeToFile(developers, "developers.txt");
    }
}
