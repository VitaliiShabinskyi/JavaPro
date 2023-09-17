import java.util.List;

public class DAta {

    public double calculateStandardDeviation(List<Double> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }

        double average = calculateAverage(numbers);
        double variance = calculateVariance(numbers, average);

        return Math.sqrt(variance);
    }

    private double calculateAverage(List<Double> numbers) {
        return numbers.stream().mapToDouble(num -> num).sum() / numbers.size();
    }

    private double calculateVariance(List<Double> numbers, double average) {
        double variance = 0;
        for (double num :
                numbers) {
            variance += Math.pow(num - average, 2);
        }

        return variance / numbers.size();
    }
}

/*
public class DAta {
    public double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.size();

        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - average, 2);
        }
        double standardDeviation = Math.sqrt(variance / numbers.size());

        return standardDeviation;
    }
}
*/