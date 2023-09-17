import java.util.stream.Collectors;


public class StringUtils {
    public static String toUpperCase(String input) {

        return input.chars()
                .mapToObj(Character::toString)
                .map(s -> Character.isWhitespace(s.charAt(0)) ? " " : s.toUpperCase())
                .collect(Collectors.joining());

// Вариант 2
//        String s = input.replaceAll("[a-zA-Z]", String::toUpperCase);
//        return s;
    }
}

/*
public class StringUtils {
    public static String toUpperCase(String input) {

        return input.chars()
                .mapToObj(Character::toString)
                .map(s -> {
                    if (s.equals(" ")) {
                        return " ";
                    } else {
                        return s.toUpperCase();
                    }
                })
                .collect(Collectors.joining());
    }
}
*/