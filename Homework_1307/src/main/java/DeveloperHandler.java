import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeveloperHandler {
    /**
     * проходится по листу девелоперов и выводить всех мужчин у которых спортивная машина
     * @param developers
     */
    public void printMaleWithSportCars(List<Developer> developers) {
        for (Developer developer : developers) {
            if (developer.getGender() == 'М' && developer.getCar().isSport()) {
                System.out.println(developer.getFirstName() + " " + developer.getLastName());
            }
        }
    }

    /**
     * группировать по полу все машины. те у мужчин такие то у женщин такие то
     */
    public Map<Character, List<Car>> groupCarsByGender(List<Developer> developers) {
        Map<Character, List<Car>> carsByGender = new HashMap<>();
        for (Developer developer : developers) {
            char gender = developer.getGender();
            List<Car> cars = carsByGender.getOrDefault(gender, new ArrayList<>());
            cars.add(developer.getCar());
            carsByGender.put(gender, cars);
        }
        return carsByGender;
    }

    /**
     * Переводить в мапу ключ-девелопер, а значение - максимальная скорость авто
     * @param developers
     * @return
     */
    public Map<Developer, Integer> getDevelopersMaxSpeed(List<Developer> developers) {
        Map<Developer, Integer> developerMaxSpeed = new HashMap<>();
        for (Developer developer : developers) {
            developerMaxSpeed.put(developer, developer.getCar().getMaxSpeed());
        }
        return developerMaxSpeed;
    }

    /**
     * записывать в текстовый файл всех девелоперов в формате : Jonn-[auto: BMW ::: salary: 12345]
     * @param developers
     * @param filename
     */
    public void writeToFile(List<Developer> developers, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Developer developer : developers) {
                String line = developer.getFirstName() + "-[auto: " + developer.getCar().getBrand() + " ::: salary: " + developer.getSalary() + "]\n";
                writer.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
