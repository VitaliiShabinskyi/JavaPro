import java.util.Scanner;

public class Main {

    /*
    План занятия
    1) Конечные автоматы(ДКА - детерминированные конечные автоматы - 5 глава стр. 687) - enum, switch
    2*) Паттерн Декоратор(3 глава - стр. 111)
     */

    /*
    Теория
    ДКА - сводит задача к какому-то фиксированному набору случаев(состояний), такой способ идеально подходит
    для обработки чего-либо, что не должно меняться, например, стоит задача запрограммировать дни недели:
    Обычный класс с конструктором не подойдет, т.к. нет гарантий, что не будет создан какой-либо объект с несуществующим
    днем недели, воспользуемся решением представленным в классе DaysOfWeek - закроем конструктор, а доступ к переменным
    будем осущетвлять через класс, то есть разместим их в метаспейсе и сделаем их константами.
     */

    public static void main(String[] args) {
        System.out.println(DaysOfWeek.MONDAY);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String str2 = "Поне";
        str2 += "дельник";
        System.out.println(str2);

        if (DaysOfWeek.MONDAY == str2) {
            System.out.println("Обед: Борщ и плов");
        } else if (str.equals(DaysOfWeek.MONDAY)) {
            System.out.println("Обед: Суп и макароны по флотски");
        }

        switch (str) {
            case DaysOfWeek.MONDAY:
                System.out.println("Обед: Борщ и плов");
                break;
            case DaysOfWeek.TUESDAY:
                System.out.println("Суп и макароны по флотски");
                break;

        }

        System.out.println(Days.MONDAY);
        final String str3 = Days.MONDAY.toString();

        switch (Days.fromString(str)){
            case MONDAY:
                System.out.println("Обед");
                break;
            case TUESDAY:
                System.out.println("Завтрак");
                break;
        }
    }
}