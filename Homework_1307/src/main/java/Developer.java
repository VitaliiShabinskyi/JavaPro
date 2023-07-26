import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Developer {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private char gender;
    private Car car;
}
