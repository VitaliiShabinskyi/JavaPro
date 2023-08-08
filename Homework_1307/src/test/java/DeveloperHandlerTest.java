import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class DeveloperHandlerTest {


    private static List<Developer> developersActualList = new ArrayList<>();
    private static DeveloperHandler developerHandler = new DeveloperHandler();

    @BeforeEach
    void setup() {
        developersActualList.add(new Developer("Name 1", "Lastname 1", 25, 15000, 'М', new Car("red", false, CarBrand.BMW, 270)));
        developersActualList.add(new Developer("Name 2", "Lastname 2", 35, 13000, 'Ж', new Car("red", true, CarBrand.BMW, 300)));
    }
    @Test
    void groupCarsByGenderTest() {
        Map<Character, List<Car>> developersExpectedList = new HashMap<>();
        List<Car> carsM = new ArrayList<>();
        List<Car> carsF = new ArrayList<>();
        carsM.add(new Car("red", false, CarBrand.BMW, 270));
        carsF.add(new Car("red", true, CarBrand.BMW, 300));
        developersExpectedList.put('Ж', carsF);
        developersExpectedList.put('М', carsM);

        Assertions.assertEquals(developersExpectedList, developerHandler.groupCarsByGender(developersActualList));
    }

    @Test
    void getDevelopersMaxSpeedTest() {
        Map<Developer, Integer> speedExpectedList = new HashMap<>();
        speedExpectedList.put(developersActualList.get(0), 270);
        speedExpectedList.put(developersActualList.get(1), 300);

        Assertions.assertEquals(speedExpectedList, developerHandler.getDevelopersMaxSpeed(developersActualList));
    }
}