import java.util.Arrays;

/**
 *    Уровень сложности 1 из 10:
 *+ 1. Найти сумму элементов в заданном одномерном массиве.
 *+ 2. Найти наибольший элемент в заданном одномерном массиве.
 *+ 3. Подсчитать количество четных элементов в заданном одномерном массиве.
 *    Уровень сложности 2 из 10:
 *+ 1. Проверить, является ли заданный одномерный массив симметричным (элементы симметрично расположены относительно центра).
 *+ 2. Найти произведение элементов в заданном одномерном массиве.
 *+ 3. Проверить, есть ли в заданном одномерном массиве повторяющиеся элементы.
 *    Уровень сложности 3 из 10:
 *+ 1. Отсортировать заданный одномерный массив по возрастанию.
 *+ 2. Проверить, является ли заданный одномерный массив палиндромом (читается одинаково слева направо и справа налево).
 *+ 3. Удалить все отрицательные элементы из заданного одномерного массива.
 *    Уровень сложности 4 из 10:
 *+ 1. Найти наименьший и наибольший элементы в заданном одномерном массиве и поменять их местами.
 *+ 2. Подсчитать количество элементов, которые больше среднего значения всех элементов в заданном одномерном массиве.
 *+ 3. Проверить, является ли заданный одномерный массив упорядоченным по возрастанию.
 *    Уровень сложности 5 из 10:
 *+ 1. Найти второй по величине элемент в заданном одномерном массиве.
 *+ 2. Перевернуть заданный одномерный массив (элементы располагаются в обратном порядке).
 *+ 3. Найти наименьшую сумму двух соседних элементов в заданном одномерном массиве.
 *
 * Помните, что эти задачи представляют лишь примеры, и вы можете варьировать условия и требования в соответствии
 * с вашими предпочтениями и требованиями задачи.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 3, 2, 1};
        int[] array3 = {1, 2, 3, 4, 3, 2, 1};
        int[] array4 = {10, 9, -8, 7, 6, 5, -4, 3, 2, 1};
        int[] array5 = {9, -8, 7, 6, 5, -4, 3, 2, 1};


        System.out.println(sum(array));

        System.out.println(max(array));

        System.out.println(evenCount(array));

        System.out.println(isSymmetry(array)); // он же палиндром

        System.out.println(mult(array2));

        System.out.println(isDuplicate(array2));

        sort(array3);

        System.out.println(Arrays.toString(removeNegatives(array4)));

        changeMinMax(array4);

        System.out.println(countHighNumbers(array4));

        System.out.println(isLowToHigh(array));

        System.out.println(nextHigh(array));

        reverse(array5);

        System.out.println(minSum(array));

    }

    private static int sum(int[] arr) {
        System.out.println("1. Найти сумму элементов в заданном одномерном массиве.");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int max(int[] arr) {
        System.out.println("2. Найти наибольший элемент в заданном одномерном массиве.");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int evenCount(int[] arr) {
        System.out.println("3. Подсчитать количество четных элементов в заданном одномерном массиве.");
        int even_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2 == 0) {
                even_count++;
            }
        }
        return even_count;
    }

    private static boolean isSymmetry(int[] arr) {
        System.out.println("1. Проверить, является ли заданный одномерный массив симметричным.");
        int middle = arr.length / 2;
        if (arr.length %2 != 0) {
            middle++;
        }
        for (int i = 0; i < middle; i++) {
            if (arr.length %2 != 0 && i == middle-1) {
                return true;
            } else {
                if (arr[i] != arr[(arr.length - 1) - i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int mult(int[] arr) {
        System.out.println("2. Найти произведение элементов в заданном одномерном массиве.");
        int mult = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mult *= arr[i];
        }
        return mult;
    }

    private static boolean isDuplicate(int[] arr) {
        System.out.println("3. Проверить, есть ли в заданном одномерном массиве повторяющиеся элементы.");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void sort(int[] arr) {
        System.out.println("1. Отсортировать заданный одномерный массив по возрастанию.");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int[] removeNegatives(int[] arr) {
        System.out.println("3. Удалить все отрицательные элементы из заданного одномерного массива.");
        int positiveCount = 0;
        for (int num : arr) {
            if (num >= 0) {
                positiveCount++;
            }
        }
        int[] newArr = new int[positiveCount];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                newArr[index] = num;
                index++;
            }
        }
        return newArr;
    }

    private static void changeMinMax(int[] arr) {
        System.out.println("1. Найти наименьший и наибольший элементы в заданном одномерном массиве и поменять их местами.");
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int tmp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = tmp;

        System.out.println(Arrays.toString(arr));
    }

    private static int countHighNumbers(int[] arr) {
        System.out.println("2. Подсчитать количество элементов, которые больше среднего значения всех элементов в заданном одномерном массиве.");
        int count = 0, sum = 0;
        float average;
        for (int num : arr) {
            sum += num;
        }
        average = (float) sum / arr.length;
        for (int num : arr) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }

    private static boolean isLowToHigh(int[] arr) {
        System.out.println("3. Проверить, является ли заданный одномерный массив упорядоченным по возрастанию.");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] < arr[i]) {
                return false;
            }
        }
        return true;
    }

    private static int nextHigh(int[] arr) {
        System.out.println("1. Найти второй по величине элемент в заданном одномерном массиве.");
        int max = arr[0];
        int nextMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                nextMax = max;
                max = arr[i];
            }
        }
        return nextMax;
    }

    private static void reverse(int[] arr) {
        System.out.println("2. Перевернуть заданный одномерный массив.");
        int middle = arr.length / 2;
        if (arr.length %2 != 0) {
            middle++;
        }
        for (int i = 0; i < middle; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int minSum(int[] arr) {
        System.out.println("3. Найти наименьшую сумму двух соседних элементов в заданном одномерном массиве.");
        int sum = arr[0] + arr[1];
        for (int i = 1; i < arr.length - 1; i++) {
            int tmp = arr[i] + arr[i + 1];
            if (tmp < sum) {
                sum = tmp;
            }
        }
        return sum;
    }
}