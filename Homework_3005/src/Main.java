import java.util.*;

/**
 * Задачи на ArrayList:
 * Удаление дубликатов: Напишите метод, который принимает массив int и возвращает ArrayList,
 *                      содержащий все уникальные элементы исходного массива, сохраняя их порядок. Уровень сложности: 4.
 * Обратный порядок:    Напишите метод, который принимает массив int и возвращает ArrayList,
 *                      содержащий элементы исходного массива в обратном порядке. Уровень сложности: 4.
 *
 * Задачи на Set:
 * Поиск пересечения:   Напишите метод, который принимает два массива int и возвращает Set,
 *                      содержащий элементы, которые присутствуют и в первом, и во втором массивах. Уровень сложности: 5.
 * Подсчет уникальных элементов: Напишите метод, который принимает массив int и возвращает количество уникальных
 *                      элементов в этом массиве, используя Set для хранения уникальных значений. Уровень сложности: 5.
 */
public class Main {
    static Random random = new Random();

    public static void main(String[] args) {

        // Удаление дубликатов
        System.out.println(removeDuplicate(getRandomArray(30, 7)));

        // Обратный порядок
        System.out.println(reverseArray(getRandomArray(10, 20)));

        // Поиск пересечения
        System.out.println(mergeArrays(getRandomArray(10, 15), getRandomArray(15, 15)));

        // Подсчет уникальных элементов
        System.out.println(countUniques(getRandomArray(10, 5)));

    }

    private static ArrayList<Integer> removeDuplicate(int[] array) {
        System.out.println("Метод, который принимает массив int и возвращает ArrayList, содержащий все уникальные элементы исходного массива, сохраняя их порядок.");
        System.out.println(Arrays.toString(array));

        ArrayList<Integer> result = new ArrayList<>();
        result.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            boolean isContain = false;
            for (int j = 0; j < result.size(); j++) {
                if (array[i] == result.get(j)) {
                    isContain = true;
                }
            }
            if (!isContain) {
                result.add(array[i]);
            }
        }

        return result;
    }

    private static ArrayList<Integer> reverseArray(int[] array) {
        System.out.println("Метод, который принимает массив int и возвращает ArrayList, содержащий элементы исходного массива в обратном порядке.");
        System.out.println(Arrays.toString(array));

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = array.length - 1; i >= 0; i--) {
            result.add(array[i]);
        }

        return result;
    }

    private static Set<Integer> mergeArrays(int[] array1, int[] array2) {
        System.out.println("Метод, который принимает два массива int и возвращает Set, содержащий элементы, которые присутствуют и в первом, и во втором массивах.");
        System.out.println("1 => " + Arrays.toString(array1));
        System.out.println("2 => " + Arrays.toString(array2));

        Set<Integer> result = new LinkedHashSet<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    result.add(array1[i]);
                    break;
                }
            }
        }

        return result;
    }

    private static int countUniques(int[] array) {
        System.out.println("Метод, который принимает массив int и возвращает количество уникальных элементов в этом массиве");
        System.out.println(Arrays.toString(array));

        Set<Integer> uniqueSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            uniqueSet.add(array[i]);
        }

        return uniqueSet.size();
    }

    /**
     * Создание нового случайного массива int[]
     * @param length длина массива
     * @param bound максимальное рандомное число
     * @return int[length]
     */
    private static int[] getRandomArray(int length, int bound) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(bound);
        }
        return result;
    }
}
