import java.util.Arrays;
import java.util.Random;

public class TaskArray {
    public static void main(String[] args) {
        System.out.println("Вычислить сумму всех элементов в массиве int[] и вывести результат.");
        System.out.println("Сумма: " + sumAllElem(singleArray()));

        System.out.println("*".repeat(20));
        System.out.println("Найти наименьший и наибольший элементы в массиве int[] и вывести их.");
        findMinMax(singleArray());

        System.out.println("*".repeat(20));
        System.out.println("Подсчитать количество четных элементов в массиве int[] и вывести результат.");
        System.out.println(countEven(singleArray()));

        System.out.println("*".repeat(20));
        System.out.println("Отсортировать массив int[] в порядке убывания и вывести отсортированный массив.");
        sortDesc(singleArray());

        System.out.println("*".repeat(20));
        System.out.println("Подсчитать сумму квадратов всех элементов в массиве int[] и вывести результат.");
        System.out.println(sumSquare(singleArray()));

        System.out.println("*".repeat(20));
        System.out.println("Посчитать сумму всех элементов во всем массиве.[][]");
        System.out.println(sumAllDouble(doubleArray()));

        System.out.println("*".repeat(20));
        System.out.println("Найти максимальное значение в каждой строке и вывести его.[][]");
        System.out.println("Максимальные значения:\n" + Arrays.toString(maxInRow(doubleArray())));

        System.out.println("*".repeat(20));
        System.out.println("Найти среднее значение элементов в каждом столбце и вывести его.[][]");
        System.out.println("Средние значения: \n" + Arrays.toString(findAvgCol(doubleArray())));

        System.out.println("*".repeat(20));
        System.out.println("Посчитать количество элементов, кратных заданному числу, во всем массиве.[][]");
        System.out.println("Чисел, кратных 3: " + countMultiples(doubleArray(), 3));

        System.out.println("*".repeat(20));
        System.out.println("Найти сумму элементов только в нечетных строках массива.[][]");
        System.out.println(sumInOddRow(doubleArray()));

    }

    private static int sumAllElem(int[] array) {
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static void findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Минимум:  " + min);
        System.out.println("Максимум: " + max);
    }

    private static int countEven(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static void sortDesc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив:\n" + Arrays.toString(array));
    }

    private static int sumSquare(int[] array) {
        int result = 0;
        for (int elem : array) {
            result += elem * elem;
        }
        return result;
    }

    private static int sumAllDouble(int[][] array) {
        int result = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                result += anInt;
            }
        }
        return result;
    }

    private static int[] maxInRow(int[][] array) {
        int[] max = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    max[i] = array[i][j];
                }
                if (array[i][j] > max[i]) {
                    max[i] = array[i][j];
                }
            }
        }
        return max;
    }

    private static double[] findAvgCol(int[][] array) {
        int[] sum = new int[array[0].length];
        double[] avg = new double[array[0].length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum[j] += array[i][j];
                if (i == array.length - 1) {
                    avg[j] = (double) sum[j] / array.length;
                }
            }
        }
        return avg;
    }

    private static int countMultiples(int[][] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % number == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int sumInOddRow(int[][] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i+=2) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    private static int[] singleArray() {
        Random random = new Random();
        int x = random.nextInt(5, 15);
        int[] result = new int[x];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(20);
        }
        for (String s : Arrays.asList("Сгенерированный массив:", Arrays.toString(result))) {
            System.out.println(s);
        }

        return result;
    }
    private static int[][] doubleArray() {
        Random random = new Random();
        int x = random.nextInt(2, 5);
        int y = random.nextInt(2, 7);
//        int side = random.nextInt(2, 7);

        int[][] result = new int[y][x];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = random.nextInt(30);
            }
        }
        System.out.println("Сгенерированный массив:");
        System.out.println(Arrays.deepToString(result));

        return result;
    }
}
