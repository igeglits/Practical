package functionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLambda myLambda = (x, y) -> x.length() + y.length();
        System.out.println(myLambda.fullLength("my", "name"));
    }
    interface MyLambda{
        int fullLength(String x, String y);
    }
}
class SortListWithLambda {
    public static void main(String[] args) {
        // Исходный список
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(2);
        myList.add(8);
        myList.add(1);
        myList.add(9);

        // Сортировка списка с помощью лямбда-выражения
        Collections.sort(myList, (a, b) -> a.compareTo(b));

        System.out.println(myList); // Вывод: [1, 2, 5, 8, 9]
    }
}
