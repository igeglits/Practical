package arrayList;

import java.util.ArrayList;
import java.util.List;

public class MethodSubList {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println("arrayList1: " + arrayList1);

        List<String> arrayList2 = arrayList1.subList(1, 4); //этот лист является представлением части списка, это не отдельная сущность
        System.out.println("arrayList2: " + arrayList2);

        arrayList2.add("Fedor");
        System.out.println("arrayList1: " + arrayList1);
        System.out.println("arrayList2: " + arrayList2);

        arrayList2.add(1, "Anna");
        System.out.println("arrayList1: " + arrayList1);
        System.out.println("arrayList2: " + arrayList2);

        arrayList2.remove("Kolya");
        System.out.println("arrayList1: " + arrayList1);
        System.out.println("arrayList2: " + arrayList2);
    }
}
