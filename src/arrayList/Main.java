package arrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 400_000; i++) {
            list.add(i);
        }
        ArrayList<Integer> list1 = (ArrayList<Integer>) list.clone();

        deleteWithRemove(list);
        deleteWithSubList(list1);
    }

    static void deleteWithRemove(List<Integer> list) {
        int startSize = list.size();
        System.out.println("Удаление с помощью метода remove()");
        long start = System.currentTimeMillis();

        for (int i = 100_000; i < 200_000; i++) {
            list.remove(i);
        }

        long finish = System.currentTimeMillis() - start;
        System.out.println("Время: " + finish);
        System.out.println("Количество удаленных элементов: " + (startSize - list.size()) + "\n");
    }

    static void deleteWithSubList(List<Integer> list) {
        int startSize = list.size();
        System.out.println("Удаление с помощью метода subList()");
        long start = System.currentTimeMillis();

        List<Integer> subList = list.subList(0, 100_000);

        subList.addAll(list.subList(200_000, 400_000));

        long finish = System.currentTimeMillis() - start;
        System.out.println("Время: " + finish);
        System.out.println("Количество удаленных элементов: " + (startSize - subList.size()));
    }

}
