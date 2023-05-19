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
 */

 /**
 * Уровень сложности 1 из 10:
 *
 *+ Найти сумму всех элементов в массиве.
 *+ Найти наибольшее значение в массиве.
 *+ Посчитать количество четных чисел в массиве.
 *
 * Уровень сложности 2 из 10:
 *
 *+ Проверить, содержит ли массив заданное значение.
 *+ Отсортировать массив по возрастанию.
 *+ Найти индекс первого вхождения заданного значения в массиве.
 *
 * Уровень сложности 3 из 10:
 *
 *+ Найти среднее значение всех элементов в массиве.
 *+ Поменять порядок элементов массива на обратный.
 *+ Проверить, является ли массив палиндромом (элементы читаются одинаково с начала и с конца).
 *
 * Уровень сложности 4 из 10:
 *
 *+ Найти наибольшую сумму подряд идущих элементов в массиве.
 *+ Удалить все дубликаты из массива.
 *+ Найти два наименьших значения в массиве.
 *
 * Уровень сложности 5 из 10:
 *
 *+ Найти наибольшую возрастающую последовательность в массиве (элементы идут по порядку).
 * Найти наибольшую сумму подмассива с нечетным количеством элементов.
 *
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
        int[] array6 = {1, 3, 4, 4, 8, 9, 10, 10, 6, 7};

        // Найти сумму всех элементов в массиве.
        System.out.println(sum(array));

        // Найти наибольшее значение в массиве.
        System.out.println(max(array));

        // Посчитать количество четных чисел в массиве.
        System.out.println(evenCount(array));

        // Проверить, содержит ли массив заданное значение.
        System.out.println(isContain(array, 5));

        // Отсортировать массив по возрастанию.
        sort(array3);

        // Найти индекс первого вхождения заданного значения в массиве.
        System.out.println(findIndex(array2, 2));

        // Найти среднее значение всех элементов в массиве.
        System.out.println(average(array));

        // Поменять порядок элементов массива на обратный.
        reverse(array5);

        // Проверить, является ли массив палиндромом
        System.out.println(isSymmetry(array));

        // Найти наибольшую сумму подряд идущих элементов в массиве.
        System.out.println(maxSumSuccessively(array6));

        // Удалить все дубликаты из массива.
        System.out.println(Arrays.toString(deleteDuplicate(array6)));

        // Найти два наименьших значения в массиве.
        findTwoMin(array4);

        // Найти наибольшую возрастающую последовательность в массиве
        findLongSequence(array2);

        // Найти наибольшую сумму подмассива с нечетным количеством элементов.
        System.out.println(findMaxOddSum(array5));

        System.out.println(mult(array2));

        System.out.println(isDuplicate(array2));

        System.out.println(Arrays.toString(removeNegatives(array4)));

        changeMinMax(array4);

        System.out.println(countHighNumbers(array4));

        System.out.println(isLowToHigh(array));

        System.out.println(nextHigh(array));

        System.out.println(minSum(array));

    }

     private static int findMaxOddSum(int[] arr) {
         System.out.println("Найти наибольшую сумму подмассива с нечетным количеством элементов.\n" + Arrays.toString(arr));
         int maxSum = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
             int sum = arr[i];
             int count = 1;

             int left = i - 1;
             int right = i + 1;
             while (count %2 != 0 && left >=0 && right < arr.length) {
                 sum += arr[left] + arr[right];
                 count += 2;
                 left--;
                 right++;
             }
             if (sum > maxSum) {
                 maxSum = sum;
             }
         }
         return maxSum;
     }

     private static void findLongSequence(int[] arr) {
         System.out.println("Найти наибольшую возрастающую последовательность в массиве\n" + Arrays.toString(arr));
         int count = 1;
         int currentCount = 1;
         int index = 0;
         int endIndex = 0;
         int currentIndex = 0;
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] == arr[i - 1] + 1) {
                 currentCount++;
             } else {
                 currentCount = 1;
                 currentIndex = i;
             }
             if (currentCount > count) {
                 count = currentCount;
                 index = currentIndex;
                 endIndex = i;
             }
         }
         System.out.print("[");
         for (int i = index; i <= endIndex; i++) {
             System.out.print(arr[i]);
             if (i != endIndex) {
                 System.out.print(", ");
             }
         }
         System.out.println("]");
     }

     private static int[] deleteDuplicate(int[] arr) {
         System.out.println("Удалить все дубликаты из массива.\n" + Arrays.toString(arr));
         int index = 0;
         int[] uniqueArr = new int[arr.length];

         for (int i = 0; i < arr.length; i++) {
             boolean isDuplicate = false;
             for (int j = 0; j < index; j++) {
                if (uniqueArr[j] == arr[i] ) {
                    isDuplicate = true;
                    break;
                }
             }
             if (!isDuplicate) {
                 uniqueArr[index] = arr[i];
                 index++;
             }
         }
         int[] result = new int[index];
         for (int i = 0; i < index; i++) {
             result[i] = uniqueArr[i];
         }
         return result;
     }

     private static int sum(int[] arr) {
        System.out.println("1. Найти сумму элементов в заданном одномерном массиве.\n" + Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int max(int[] arr) {
        System.out.println("2. Найти наибольший элемент в заданном одномерном массиве.\n" + Arrays.toString(arr));
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int evenCount(int[] arr) {
        System.out.println("3. Подсчитать количество четных элементов в заданном одномерном массиве.\n" + Arrays.toString(arr));
        int even_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2 == 0) {
                even_count++;
            }
        }
        return even_count;
    }

    private static boolean isContain(int[] arr, int x) {
        System.out.println("Проверить, содержит ли массив заданное значение.\n" + Arrays.toString(arr) + "\tx = " + x);
        for (int num : arr) {
            if (num == x) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSymmetry(int[] arr) {
        System.out.println("1. Проверить, является ли заданный одномерный массив симметричным.\n" + Arrays.toString(arr));
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
        System.out.println("2. Найти произведение элементов в заданном одномерном массиве.\n" + Arrays.toString(arr));
        int mult = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mult *= arr[i];
        }
        return mult;
    }

    private static boolean isDuplicate(int[] arr) {
        System.out.println("3. Проверить, есть ли в заданном одномерном массиве повторяющиеся элементы.\n" + Arrays.toString(arr));
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
        System.out.println("1. Отсортировать заданный одномерный массив по возрастанию.\n" + Arrays.toString(arr));
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

    private static int findIndex(int[] arr, int x) {
        System.out.println("Найти индекс первого вхождения заданного значения в массиве.\n" + Arrays.toString(arr) + "\tx = " + x);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    private static float average(int[] arr) {
        System.out.println("Найти среднее значение всех элементов в массиве.\n" + Arrays.toString(arr));
        int sum = 0;
        float average;
        for (int num : arr) {
            sum += num;
        }
        average = (float) sum / arr.length;
        return average;
    }

    private static int maxSumSuccessively(int[] arr) {
        System.out.println("Найти наибольшую сумму подряд идущих элементов в массиве.\n" + Arrays.toString(arr));

        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - 1 == arr[i - 1]) {
                currentSum += arr[i];
            } else  {
                currentSum = arr[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    private static int[] removeNegatives(int[] arr) {
        System.out.println("3. Удалить все отрицательные элементы из заданного одномерного массива.\n" + Arrays.toString(arr));
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
        System.out.println("1. Найти наименьший и наибольший элементы в заданном одномерном массиве и поменять их местами.\n" + Arrays.toString(arr));
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
        System.out.println("2. Подсчитать количество элементов, которые больше среднего значения всех элементов в заданном одномерном массиве.\n" + Arrays.toString(arr));
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
        System.out.println("3. Проверить, является ли заданный одномерный массив упорядоченным по возрастанию.\n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] < arr[i]) {
                return false;
            }
        }
        return true;
    }

    private static int nextHigh(int[] arr) {
        System.out.println("1. Найти второй по величине элемент в заданном одномерном массиве.\n" + Arrays.toString(arr));
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

    private static void findTwoMin(int[] arr) {
        System.out.println("Найти два наименьших значения в массиве.\n" + Arrays.toString(arr));
        if (arr.length < 2) {
            System.out.println("Массив должен содержать не менее двух элементов");
            return;
        }

        int min = Integer.MAX_VALUE;
        int nextMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                nextMin = min;
                min = arr[i];
            } else if (arr[i] < nextMin && arr[i] != min) {
                nextMin = arr[i];
            }
        }
        if (min != Integer.MAX_VALUE && nextMin != Integer.MAX_VALUE) {
            System.out.println(min + ", " + nextMin);
        } else {
            System.out.println("Не найдено двух различных наименьших значений");
        }
    }

    private static void reverse(int[] arr) {
        System.out.println("2. Перевернуть заданный одномерный массив.\n" + Arrays.toString(arr));
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
        System.out.println("3. Найти наименьшую сумму двух соседних элементов в заданном одномерном массиве.\n" + Arrays.toString(arr));
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