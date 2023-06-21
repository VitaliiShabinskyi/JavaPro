import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * +Вывести все ключи из мапы на экран.
 * +Проверить, содержит ли мапа определенное значение.
 * +Найти ключ, связанный с определенным значением.
 * +Вывести на экран все ключи, у которых значение начинается с определенной буквы.
 * +Проверить, содержит ли мапа определенный ключ.
 * +Найти ключ с максимальным значением.
 * +Подсчитать количество ключей, значение которых содержит определенное слово.
 * +Найти все ключи, значение которых состоит только из цифр.
 * +Подсчитать сумму числовых значений в мапе.
 * +Подсчитать количество ключей, у которых длина значения превышает определенную границу.
 * +Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы.
 * +Очистить мапу и вывести сообщение о ее пустом состоянии.
 * +Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка.
 * +Создать список List, заполнить его несколькими значениями. Затем перебрать список и вывести элементы в обратном порядке.
 * +Вычислить сумму всех элементов в массиве int[] и вывести результат.
 * +Найти наименьший и наибольший элементы в массиве int[] и вывести их.
 * +Подсчитать количество четных элементов в массиве int[] и вывести результат.
 * +Отсортировать массив int[] в порядке убывания и вывести отсортированный массив.
 * +Подсчитать сумму квадратов всех элементов в массиве int[] и вывести результат.
 * +Посчитать сумму всех элементов во всем массиве.[][]
 * +Найти максимальное значение в каждой строке и вывести его.[][]
 * +Найти среднее значение элементов в каждом столбце и вывести его.[][]
 * +Посчитать количество элементов, кратных заданному числу, во всем массиве.[][]
 * +Найти сумму элементов только в нечетных строках массива.[][]
 */
public class TaskMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "456");
        map.put(5, "Pineapple");
        map.put(6, "Watermelon");
        map.put(7, "123");
        map.put(8, "Papaya");


        System.out.println("Вывести все ключи из мапы на экран.");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println("*".repeat(20));
        System.out.println("Проверить, содержит ли мапа определенное значение.");
        System.out.println("Orange --> " + isContain(map, "Orange"));

        System.out.println("*".repeat(20));
        System.out.println("Найти ключ, связанный с определенным значением.");
        System.out.println("Pineapple --> " + findKey(map, "Pineapple"));

        System.out.println("*".repeat(20));
        System.out.println("Вывести на экран все ключи, у которых значение начинается с определенной буквы.");
        System.out.println("Буква P:");
        checkFirstLetter(map, 'P');

        System.out.println("*".repeat(20));
        System.out.println("Проверить, содержит ли мапа определенный ключ.");
        System.out.println(isKeyContains(map, 2));
//        System.out.println(map.containsKey(2));

        System.out.println("*".repeat(20));
        System.out.println("Найти ключ с максимальным значением.");
        System.out.println(findKeyOfMaxValue(map));

        System.out.println("*".repeat(20));
        System.out.println("Подсчитать количество ключей, значение которых содержит определенное слово.");
        System.out.println("Orange -> " + countKeysOfValue(map, "Orange"));

        System.out.println("*".repeat(20));
        System.out.println("Найти все ключи, значение которых состоит только из цифр.");
        findDigitsOnly(map);

        System.out.println("*".repeat(20));
        System.out.println("Подсчитать сумму числовых значений в мапе.");
        System.out.println(sumDigitValues(createReverseMap(map)));

        System.out.println("*".repeat(20));
        System.out.println("Подсчитать количество ключей, у которых длина значения превышает определенную границу.");
        System.out.println("Слов больше 5 букв: " + countKeys(map, 5));

        System.out.println("*".repeat(20));
        System.out.println("Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы.");
        System.out.println(createReverseMap(map));

        System.out.println("*".repeat(20));
        System.out.println("Очистить мапу и вывести сообщение о ее пустом состоянии.");

        map.clear();
        if (map.isEmpty()) {
            System.out.println("Map пуст.");
        } else {
            System.out.println("Map не пуст.");
        }
    }

    private static boolean isContain(Map<Integer, String> map, String value) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if ( value.equals(entry.getValue()) ) {
                return true;
            }
        }
        return false;
    }

    private static Integer findKey(Map<Integer, String> map, String value) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if ( value.equals(entry.getValue()) ) {
                return entry.getKey();
            }
        }
        return -1;
    }

    private static void checkFirstLetter(Map<Integer, String> map, char first) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().charAt(0) == first) {
                System.out.println(entry.getValue());
            }
        }
    }

    private static boolean isKeyContains(Map<Integer, String> map, Integer key) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (key.equals(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    private static Integer findKeyOfMaxValue(Map<Integer, String> map) {
        Integer maxKey = null;
        String maxValue = null;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (maxValue == null || entry.getValue().compareTo(maxValue) > 0) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
//        System.out.println(maxValue);
//        if (maxKey != null) {
//            return maxKey;
//        } else {
//            return -1;
//        }
        return Objects.requireNonNullElse(maxKey, -1);
    }

    private static int countKeysOfValue(Map<Integer, String> map, String value) {
        int count = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                count++;
            }
        }
        return count;
    }

    private static void findDigitsOnly(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            boolean isDigits = true;
            for (char c : entry.getValue().toCharArray()) {
                if (!Character.isDigit(c)) {
                    isDigits = false;
                    break;
                }
            }
            if (isDigits) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    private static int sumDigitValues(Map<String, Integer> map) {
        int result = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                result += entry.getValue();
            }
        }
        return result;
    }

    private static int countKeys(Map<Integer, String> map, int length) {
        int count = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue() != null && entry.getValue().length() > length) {
                count++;
            }
        }
        return count;
    }
    
    private static Map<String, Integer> createReverseMap(Map<Integer, String> map) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }
}
