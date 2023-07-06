import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("1. Дан список строк. Необходимо отфильтровать строки, длина которых больше 3 символов, преобразовать их \n" +
                           "в верхний регистр, удалить повторяющиеся и вывести результат в отсортированном порядке.");

        List<String> strings = Arrays.asList("Map", "Void", "Static", "Arrays", "0days", "", "For", "Void", "ArrayList");
        System.out.println(strings.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList())
        );

        System.out.println("2. Дан список слов. Необходимо найти среднюю длину слов, начинающихся с буквы A.");
        System.out.println(strings.stream()
                .filter(s -> s.startsWith("A"))
//                .filter(s -> 'A' == s.charAt(0))
                .mapToInt(String::length)
                .average()
                .orElse(0)
        );

        System.out.println("3. Дан список слов. Необходимо сгруппировать их по длине и вывести результат.");
        System.out.println(strings.stream()
                .collect(Collectors.groupingBy(String::length))
        );


        System.out.println("4. Дан список чисел. Необходимо найти наименьшее число, больше 0.");
        List<Integer> numbers = Arrays.asList(10, -2, 8, 3, -5, 12, 7, 4);
        System.out.println(numbers.stream()
                .filter(n -> n > 0)
                .min(Integer::compare)
                .orElse(null)
        );

        System.out.println("5. Дан список чисел. Необходимо найти сумму квадратов всех положительных чисел.");
        System.out.println(numbers.stream()
                .filter(n -> n > 0)
                .mapToInt(n -> n * n)
                .sum()
        );

        System.out.println("6. Даны два списка чисел. Необходимо объединить их в один список, отсортировать по убыванию и удалить повторяющиеся элементы.");
        List<Integer> numbers2 = Arrays.asList(9, -2, 6, 3, 5, 11, -7, 4);
        List<Integer> mergeArrays = Stream.of(numbers, numbers2)
                .flatMap(Collection::stream)                // integers -> integers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())          // (n1, n2) -> n2.compareTo(n1)
                .toList();
        System.out.println(mergeArrays);


        System.out.println("7. Дан список строк. Необходимо оставить только уникальные символы из всех строк и вывести их в алфавитном порядке.");
        List<String> strings2 = Arrays.asList("ghijkl", "bcd", "abc", "dfgh");
        System.out.println(strings2.stream()
                .flatMap(s -> s.chars().mapToObj(c -> (char) c))
                .distinct()
                .sorted()
                .toList()
        );

        System.out.println("8. Дан список чисел. Необходимо найти второе максимальное число.");
        System.out.println(numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                // v 1
//                .toList()
//                .get(1)
                // v 2
                .skip(1)
                .findFirst()
                .orElse(null)
        );

        System.out.println("9. Дан список слов. Необходимо отфильтровать слова, состоящие только из букв, разделить их на гласные и согласные, и вывести результат.");
        System.out.println("не решена");
//        Map<Boolean, List<String>> result = strings.stream()
//                .filter(s -> s.chars().allMatch(Character::isLetter))
//                .
//        System.out.println("Гласные: " + result.get(true));
//        System.out.println("Согласные: " + result.get(false));

        System.out.println("10. Дан список строк. Необходимо удалить пустые строки, объединить оставшиеся строки в одну строку, разделенную запятой.");
        System.out.println(strings.stream()
                .filter(s -> s.length() > 0)
                .collect(Collectors.joining(", "))
        );

        System.out.println("11. Дан список слов. Необходимо объединить все символы из всех слов в одну строку.");
        System.out.println(strings.stream()
                .collect(Collectors.joining())
        );

        System.out.println("12. Дан список слов. Необходимо проверить, содержат ли они одинаковые символы (являются ли анаграммами) и вывести результат.");
        List<String> strings3 = Arrays.asList("Нос", "яблоко", "пион", "сон", "банан", "пони");
        Map<String, List<String>> anagrams = strings3.stream()
                .collect(Collectors.groupingBy(
                        w -> w.toLowerCase()
                                .chars()
                                .sorted()
                                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                                .toString()
                )
        );

        int i = 1;
        for (List<String> items : anagrams.values()) {
            if (items.size() > 1) {
                System.out.println(i++ + ": " + items);
            }
        }

        System.out.println("13. Даны два списка чисел. Необходимо найти разность множеств (элементы, присутствующие только в одном из списков) и вывести результат.");
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers4 = Arrays.asList(3, 4, 5, 6, 7);
        System.out.println(
                Stream.concat(numbers3.stream().filter(o -> !numbers4.contains(o)), numbers4.stream().filter(o1 -> !numbers3.contains(o1)))
                    .distinct()
                    .collect(Collectors.toList())
        );

        System.out.println("14. Дан список слов. Необходимо подсчитать количество слов для каждой длины и вывести результат.");
        System.out.println(strings.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()))
        );

        System.out.println("15. Дан список строк. Необходимо отфильтровать строки, которые начинаются с префикса 'pre' и заканчиваются суффиксом 'post'.");
        List<String> prePost = Arrays.asList("preWORD1post", "prepost", "pre", "preWORD2post", "post", "word");
        System.out.println(prePost.stream()
                .filter(w -> w.startsWith("pre") && w.endsWith("post"))
                .toList()
        );

        System.out.println("16. Дан список слов. Необходимо подсчитать количество символов в каждом слове и вывести результат.");
        System.out.println(strings.stream()
                .map(String::length)
                .toList()
        );

        System.out.println("17. Дан список чисел. Необходимо найти среднее значение всех уникальных чисел.");
        List<Integer> task17 = Arrays.asList(1, 2, 7, 3, 4, 5, 4, 6, 7, 8, 2, 9, 10);
        System.out.println(task17.stream()
                .distinct()
                .mapToInt(n -> n)
                .average()
                .orElse(0)
        );

        System.out.println("18. Дан список строк. Необходимо найти самое длинное слово с четной длиной.");
        System.out.println(strings.stream()
                .filter(s -> s.length() % 2 == 0)
                .mapToInt(String::length)
                .max()
                .orElse(-1)
        );

        System.out.println("19. Дан список строк. Необходимо удалить все пробелы в каждой строке, отсортировать их в лексикографическом порядке и вывести результат.");
        List<String> task19 = Arrays.asList("Дан список строк", "Дан список чисел", "Дан список слов");
        System.out.println(task19.stream()
                .map(s -> s.replace(" ", ""))
                .sorted()
                .toList()
        );

//        System.out.println("20. Дан список слов. Необходимо проверить, являются ли они палиндромами, и вывести результат.");


        System.out.println("21. Дан список чисел. Необходимо найти максимальное четное число.");
        System.out.println(numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .max()
                .orElse(-1)
        );

        System.out.println("22. Дан список строк. Необходимо объединить все строки в одну строку, добавив префикс '>>' и суффикс '<<' к каждой строке.");
        System.out.println(strings.stream()
                .map(s -> ">>" + s + "<<")
                .toList()
        );

        System.out.println("23. Дан список строк. Необходимо объединить все символы из всех строк, удалить дубликаты и отсортировать их в лексикографическом порядке.");
        System.out.println(strings.stream()
                .flatMap(s -> s.chars().mapToObj(ch -> (char) ch))
                .distinct()
                .sorted()
                .toList()
        );

        System.out.println("24. Дан список объектов Person с полем 'возраст'. \n" +
                "Необходимо отфильтровать объекты, возраст которых находится в диапазоне от 25 до 40 лет, отсортировать по имени и вывести результат.");
        List<Persons> personList = new ArrayList<>();
        personList.add(new Persons("Dima", 15));
        personList.add(new Persons("Vladislav", 39));
        personList.add(new Persons("Vadim", 31));
        personList.add(new Persons("Evgeny", 54));
        personList.add(new Persons("Roman", 25));

        System.out.println(personList.stream()
                .filter(p -> p.getAge() >= 25 && p.getAge() <= 40)
                .sorted()
                .toList()
        );

        System.out.println("25. Дан список чисел. Необходимо найти сумму всех четных чисел, которые являются положительными.");
        System.out.println(numbers.stream()
                .filter(n -> n % 2 == 0 && n > 0)
                .mapToInt(n -> n)
                .sum()
        );

        System.out.println("26. Дан список чисел. Необходимо найти второе минимальное число среди уникальных чисел.");
        System.out.println(numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null)
        );

        System.out.println("27. Дан список слов. Необходимо разделить их на две группы: \n" +
                " одна группа - слова с длиной менее или равной 4 символам, другая группа - слова с длиной более 4 символов.\n" +
                " После этого подсчитать количество слов в каждой группе и вывести результат.");
        System.out.println(strings.stream()
                .collect(Collectors.groupingBy(s -> {
                    if (s.length() > 4) {
                        return "Больше 4";
                    } else {
                        return "Меньше или равно 4";
                    }
                }, Collectors.counting()))
        );

        System.out.println("28. Дан список строк. Необходимо пропустить первые три символа в каждой строке и объединить оставшиеся символы в одну строку.");
        List<String> task28 = Arrays.asList("abcString 1", "abcString 2", "abcString 3");
        System.out.println(task28.stream()
                .map(s -> s.substring(3))
                .collect(Collectors.joining())
        );

        System.out.println("29. Дан список чисел. Необходимо найти три наименьших числа и вывести результат.");
        System.out.println(numbers.stream()
                .sorted()
                .limit(3)
                .toList()
        );

        System.out.println("30. Дан список строк. Необходимо проверить, содержит ли хотя бы одна строка подстроку 'an' и вывести результат.");
        List<String> task30 = Arrays.asList("String", "a nd");
        System.out.println(task30.stream()
                .anyMatch(s -> s.contains("an"))
        );

    }

}

@Setter
@Getter
@AllArgsConstructor
@ToString
class Persons implements Comparable<Persons> {
    private String name;
    private int age;

    @Override
    public int compareTo(Persons o) {
        return this.name.compareTo(o.name);
    }
}

