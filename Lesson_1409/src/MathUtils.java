import java.util.List;

public class MathUtils {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    
    public static Integer calculateSum(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        return calculateSum(numbers.stream()
                .mapToInt(n -> n)
                .toArray());
    }
}

/*
public class MathUtils {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }
}
*/