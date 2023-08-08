import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Car {
    private String color;
    private boolean isSport;
    private CarBrand brand;
    private int maxSpeed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isSport == car.isSport && maxSpeed == car.maxSpeed && Objects.equals(color, car.color) && brand == car.brand;
    }

}
