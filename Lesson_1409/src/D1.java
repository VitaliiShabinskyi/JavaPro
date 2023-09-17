import java.util.List;

public class D1 {
    public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
        if (listOfNumbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }

        return listOfNumbers.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);
    }
}

/*
public class D1 {
    public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
        double sumOfAllValues = 0;
        for (double currentValue : listOfNumbers) {
            sumOfAllValues += currentValue;
        }
        return sumOfAllValues / listOfNumbers.size();
    }
}
*/