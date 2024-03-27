package arrayList;

import java.util.ArrayList;

public class MethodRetainAll {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println("arrayList1: " + arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Elena");
        arrayList2.add("Zaur");
        arrayList2.add("Anna");
        System.out.println("arrayList2: " + arrayList2);

        arrayList1.retainAll(arrayList2);
        System.out.println("arrayList1 after retainAll: " + arrayList1);
    }
}
