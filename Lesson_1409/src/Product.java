import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Product {
    private String name;
    private double price;

}