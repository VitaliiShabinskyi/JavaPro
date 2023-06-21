import java.util.ArrayList;
import java.util.List;

public class TaskList {
    public static void main(String[] args) {
        System.out.println("Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка.");
        List<String> list = new ArrayList<>();
        list.add("html/html5");
        list.add("css/css3");
        list.add("mysql");
        list.add("php");
        list.add("javascript/jquery");
        list.add("java");

        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("*".repeat(20));
        System.out.println("Создать список List, заполнить его несколькими значениями. Затем перебрать список и вывести элементы в обратном порядке.");
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }

    }
}
