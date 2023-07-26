import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car {
    private String color;
    private boolean isSport;
    private CarBrand brand;
    private int maxSpeed;

}
