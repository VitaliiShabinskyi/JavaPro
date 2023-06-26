import java.util.*;

/**
 * 1 + У вас есть Map<String, Boolean>, представляющая студентов и их оценки
 * (true - сдал экзамен, false - не сдал).
 * Напишите функцию, которая находит и возвращает имена студентов, не сдавших экзамен.
 *
 * 2 + У вас есть Map<String, Boolean>, представляющая список продуктов в магазине и
 * информацию о их наличии (true - продукт в наличии, false - продукта нет).
 * Напишите функцию, которая подсчитывает количество продуктов, которых нет в наличии.
 *
 * 3 + У вас есть список List<String>, содержащий имена людей.
 * Напишите программу, которая выводит все имена, начинающиеся на определенную букву.
 * List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
 * char targetLetter = 'C';
 *
 * 4 + У вас есть список List<String>, содержащий слова.
 * Напишите программу, которая находит все пары слов, в которых первое слово является обратным написанию второго слова.
 * List<String> words = Arrays.asList("lemon", "cat", "tac", "dog", "god", "man", "nam");
 *
 * 5 + Напишите программу, которая находит сумму всех элементов в заданном массиве arr и выводит ее значение.
 * 6 + Напишите программу, которая находит среднее арифметическое значение элементов в заданном массиве arr и выводит его.
 */
public class Main {

    public static void main(String[] args) {
        Map<String, Boolean> student = new HashMap<>();

        student.put("Ivan", true);
        student.put("Evgen", true);
        student.put("Alex", false);
        student.put("Darja", true);
        student.put("Masha", false);

        System.out.println("1. Напишите функцию, которая находит и возвращает имена студентов, не сдавших экзамен.\n" + findLoosers(student));

        System.out.println("2. Напишите функцию, которая подсчитывает количество продуктов, которых нет в наличии.");
        productsNotInSctock(student);

        // 3
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
        char targetLetter = 'C';

        System.out.println("3. Напишите программу, которая выводит все имена, начинающиеся на определенную букву.");
        findName(names, targetLetter);

        // 4
        List<String> words = Arrays.asList("lemon", "cat", "tac", "dog", "god", "man", "nam");

        System.out.println("4. Напишите программу, которая находит все пары слов, в которых первое слово является обратным написанию второго слова.");
        findNextPalindrom(words);

        // 5
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("5. Напишите программу, которая находит сумму всех элементов в заданном массиве arr и выводит ее значение.\n" + sum(arr));

        // 6
        System.out.println("6. Напишите программу, которая находит среднее арифметическое значение элементов в заданном массиве arr и выводит его.");
        avg(arr);

    }

    // 1
    private static List<String> findLoosers(Map<String, Boolean> map) {
        List<String> loosers = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (!entry.getValue()) {
                loosers.add(entry.getKey());
            }
        }
        return loosers;
    }

    // 2
    private static int productsNotInSctock(Map<String, Boolean> map) {
        int count = 0;
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (!entry.getValue()) {
                count++;
            }
        }
        System.out.println("Products not in stock : " + count);
        return count;
    }

    // 3
    private static void findName(List<String> names, char targetLetter) {
        for (String s : names) {
            if (s.charAt(0) == targetLetter) {
                System.out.println(s);
            }
        }
    }

    // 4
    private static void findNextPalindrom(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() != list.get(i+1).length()) {
                continue;
            }
            String word1 = list.get(i);
            String word2 = list.get(i+1);
            boolean isPalindrom = true;
            for (int j = 0; j < list.get(i).length() / 2 ; j++) {
                if (word1.charAt(j) != word2.charAt(word2.length() - j - 1)) {
                    isPalindrom = false;
                    break;
                }
            }
            if (isPalindrom) {
                System.out.println(word1 + " -> " + word2);
            }
        }
    }

    // 5
    private static int sum(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum;
    }

    // 6
    private static void avg(int[] arr) {
        int sum = sum(arr);
        double avg;
        avg = sum / arr.length;
        System.out.println(avg);
    }
}
