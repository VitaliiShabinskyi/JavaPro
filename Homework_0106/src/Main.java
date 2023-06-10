import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *+ 1. Напишите программу, которая принимает на вход строку и выводит все перестановки символов этой строки.
 *+ 2. Напишите программу, которая принимает на вход две строки и проверяет, являются ли они анаграммами
 *    (т.е. содержат ли они одинаковые символы в разном порядке).
 *+ 3. Напишите программу, которая принимает на вход строку и выводит все подстроки этой строки.
 *+ 4. Напишите программу, которая принимает на вход две строки и проверяет, является ли одна строка перестановкой
 *    другой строки.
 *+ 5. Напишите программу, которая принимает на вход строку и выводит все возможные комбинации символов этой строки
 *    в порядке возрастания их длины.
 * Задача 1 (Сложность: 4/10):
 *+ 6. Напишите параметризированный класс "Pair", который принимает два различных типа данных в качестве параметров
 *    (например, "Pair"). Реализуйте методы для получения и установки значений каждого из элементов пары.
 * Задача 2 (Сложность: 3/10):
 *+ 7. Реализуйте параметризированный метод "swap", который принимает массив элементов и два индекса внутри массива.
 *    Метод должен поменять местами элементы по указанным индексам.
 * Задача 3 (Сложность: 4/10):
 *+ 8. Создайте параметризированный класс "Stack", представляющий стек элементов. Реализуйте методы "push", "pop" и
 *    "isEmpty" для добавления элемента в стек, извлечения элемента из стека и проверки, пуст ли стек соответственно.
 * Задача 4 (Сложность: 3/10):
 *+ 9. Напишите параметризированный метод "printArray", который принимает массив элементов и выводит их на консоль.
 *    Метод должен работать с любыми типами данных.
 * Задача 5 (Сложность: 3/10):
 *+ 10. Создайте параметризированный класс "LinkedList", представляющий связный список элементов.
 *     Реализуйте методы "add", "remove" и "contains" для добавления элемента в список,
 *     удаления элемента из списка и проверки, содержится ли элемент в списке соответственно.
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("1. Напишите программу, которая принимает на вход строку и выводит все перестановки символов этой строки.");
        List<String> permutations = permutationString("abc");
        System.out.println(permutations);

        System.out.println("2. Напишите программу, которая принимает на вход две строки и проверяет, являются ли они анаграммами.");
        System.out.println("4. Напишите программу, которая принимает на вход две строки и проверяет, является ли одна строка перестановкой другой строки.");
        System.out.println(isAnagram("ирландка", "кардинал"));
        System.out.println(isAnagram("привет", "hello!"));

        System.out.println("3. Напишите программу, которая принимает на вход строку и выводит все подстроки этой строки.");
        printSubstrings("abc");

        System.out.println("5. Напишите программу, которая принимает на вход строку и выводит все возможные комбинации символов этой строки в порядке возрастания их длины.");
        printSubstringsLowToHi("abc");

        System.out.println("6. Напишите параметризированный класс \"Pair\", который принимает два различных типа данных в качестве параметров");
        Pair<String, Integer> human = new Pair<>("Иван", 35);
        System.out.println("Первый элемент: " + human.getFirst());
        System.out.println("Второй элемент: " + human.getSecond());

        human.setFirst("Евгений");
        human.setSecond(23);
        System.out.println("Обновленный первый элемент: " + human.getFirst());
        System.out.println("Обновленный второй элемент: " + human.getSecond());

        System.out.println("7. Реализуйте параметризированный метод \"swap\", который принимает массив элементов и два индекса внутри массива.\n" +
                "    Метод должен поменять местами элементы по указанным индексам.");
        Character[] chars = {'a','b','c', 'd'};
        arraySwap(chars, 3, 2);

        System.out.println("8. Создайте параметризированный класс \"Stack\", представляющий стек элементов. Реализуйте методы \"push\", \"pop\" и\n" +
                "\"isEmpty\" для добавления элемента в стек, извлечения элемента из стека и проверки, пуст ли стек соответственно.");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println("Извлечен элемент: " + stack.pop());
        }

        System.out.println("9. Напишите параметризированный метод \"printArray\", который принимает массив элементов и выводит их на консоль.");
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Один", "Два", "Три"};

        System.out.print("Массив чисел: ");
        printArray(numbers);

        System.out.print("Массив имен:  ");
        printArray(names);

        System.out.println("10. Создайте параметризированный класс \"LinkedList\", представляющий связный список элементов.\n" +
                "    Реализуйте методы \"add\", \"remove\" и \"contains\" для добавления элемента в список,\n" +
                "    удаления элемента из списка и проверки, содержится ли элемент в списке соответственно.");
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("Contains 20? " + linkedList.contains(20));
        System.out.println("List size: " + linkedList.size());

        linkedList.remove(20);
        System.out.println("Contains 20 after remove? " + linkedList.contains(20));
        System.out.println("List size after remove: " + linkedList.size());
    }

    private static List<String> permutationString(String str) {
        List<String> permutations = new ArrayList<>();

        if (str == null || str.length() == 0) {
            System.out.println("String is Empty");
            return permutations;
        }

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        permutations.add(new String(chars));

        while (true) {
            int i = chars.length - 2;
            while (i >= 0 && chars[i] >= chars[i + 1]) {
                i--;
            }
            if (i < 0) {
                break;
            }
            int j = chars.length - 1;
            while (chars[j] <= chars[i]) {
                j--;
            }
            swap(chars, i, j);
            reverse(chars, i + 1);
            permutations.add(new String(chars));
        }
        return permutations;
    }
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    private static void reverse(char[] chars, int start) {
        int i = start;
        int j = chars.length - 1;

        while (i < j) {
            swap(chars, i, j);
            i++;
            j--;
        }
    }

    private static boolean isAnagram(String string1, String string2) {
        if (string1 == null || string2 == null || string1.length() != string2.length()) {
            return false;
        }
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    private static void printSubstrings(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("String is Empty");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    private static void printSubstringsLowToHi(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("String is Empty");
            return;
        }

        for (int len = 1; len <= str.length(); len++) {
            for (int i = 0; i <= str.length() - len; i++) {
                int j = i + len - 1;
                String substring = str.substring(i, j + 1);
                System.out.println(substring);
            }
        }
    }

    private static <T> void arraySwap(T[] array, int i, int j) {
        if (array == null || i < 0 || i >= array.length || j < 0 || j >= array.length) {
            System.out.println("Error input data");
            return;
        }

        System.out.println(Arrays.toString(array));

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        System.out.println(Arrays.toString(array));
    }

    private static <T> void printArray(T[] array) {
        System.out.print("[ ");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
}
