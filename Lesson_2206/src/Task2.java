import java.util.*;

/**
 * 1 + Напишите программу, которая принимает на вход двумерный
 * массив int[][] и возвращает сумму всех элементов в массиве.
 *
 * 2 + Напишите программу, которая принимает на вход двумерный массив
 * int[][] и возвращает максимальное значение среди всех элементов в массиве.
 *
 * 3 + Напишите программу, которая принимает массив строк String[] и
 * возвращает новый массив, содержащий только уникальные строки из исходного массива
 *
 * 4 + Напишите программу, которая принимает массив строк String[]
 * и возвращает новый массив строк, в котором все строки перевернуты задом наперёд.
 *
 * 5 + Напишите функцию, которая принимает на вход Set<String>
 * и возвращает новый Set<String>, содержащий только те строки, которые начинаются с заглавной буквы.
 *
 * 6 + Напишите функцию, которая принимает на вход два Set<String> и
 * возвращает новый Set<String>, содержащий только те строки, которые присутствуют в обоих наборах.
 *
 * 7 + Напишите функцию, которая принимает на вход Set<String> и возвращает
 * новый Set<String>, содержащий только уникальные строки, игнорируя регистр символов
 * Set<String> stringSet = new HashSet<>();
 *         stringSet.add("Apple");
 *         stringSet.add("banana");
 *         stringSet.add("apple");
 *         stringSet.add("Banana");
 */

public class Task2 {
    public static void main(String[] args) {

        // 1
        int[][] arr = {
                {1, 2, 3},
                {7, 8, 9},
                {4, 5, 6}
        };
        System.out.println("Task 1. сумма всех элементов в массиве.\n" + summ(arr));

        // 2
        System.out.println("Task 2. максимальное значение среди всех элементов в массиве.\n" + findMax(arr));

        // 3
        String[] strings = {"One", "Two", "Tree", "Four", "Two", "Five", "Four", "Six"};
        System.out.println("Task 3. новый массив, содержащий только уникальные строки из исходного массива\n" + Arrays.toString( findUnique(strings)) );

        // 4
        System.out.println("Task 4. новый массив строк, в котором все строки перевернуты задом наперёд.\n" + Arrays.toString( reverseStrings(strings)) );

        // 5
        Set<String> words2 = new HashSet<>();
        words2.add("cat");
        words2.add("Cheetah");
        words2.add("bunny");
        words2.add("Hedgehog");
        words2.add("rat");

        System.out.println("Task 5. Set<String>, содержащий только те строки, которые начинаются с заглавной буквы.\n" + findAlt(words2));

        // 6
        Set<String> words3 = new HashSet<>();
        words3.add("cat");
        words3.add("test");
        words3.add("bunny");
        words3.add("false");
        words3.add("rat");

        System.out.println("Task 6. Set<String>, содержащий только те строки, которые присутствуют в обоих наборах.\n" + returnDuplicate(words2, words3));

        // 7
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("banana");
        stringSet.add("apple");
        stringSet.add("Banana");

        System.out.println("Task 7. Set<String>, содержащий только уникальные строки, игнорируя регистр символов\n" + duplicatesIgnoringCase(stringSet));
    }

    // 1
    private static int summ(int[][] arr) {
        int summ = 0;
        for (int[] row : arr) {
            for (int number : row) {
                summ += number;
            }
        }
        return summ;
    }

    // 2
    private static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int number : row) {
                if (number > max) {
                    max = number;
                }
            }
        }
        return max;
    }

    // 3
    public static String[] findUnique(String[] arr) {
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        return set.toArray(new String[0]);
    }

    // 4
    public static String[] reverseStrings(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return result;
    }

    // 5
    private static Set<String> findAlt(Set<String> set) {
        Set<String> result = new HashSet<>();
        for (String word : set) {
            if (Character.isUpperCase(word.charAt(0))) {
                result.add(word);
            }
        }
        return result;
    }

    // 6
    private static Set<String> returnDuplicate(Set<String> string1, Set<String> string2) {
        Set<String> result = new HashSet<>();
        for (String word : string1) {
            if (string2.contains(word)) {
                result.add(word);
            }
        }
        return result;
    }

    // 7
    public static Set<String> duplicatesIgnoringCase(Set<String> words) {
        Set<String> result = new HashSet<>();
        Set<String> temp = new HashSet<>();
        for (String word : words) {
            if (!temp.add(word.toLowerCase())) {
                result.add(word);
            }
        }
        return result;
    }
}
