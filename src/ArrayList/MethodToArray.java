package ArrayList;

import java.util.ArrayList;

public class MethodToArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println("arrayList1: " + arrayList1);

        Object[] array1 = arrayList1.toArray();
        for (Object o : array1) {
            System.out.print(o + " ");
        }
        System.out.println();
        String[] array2 = arrayList1.toArray(new String[10]);
        for (String s : array2) {
            System.out.print(s + " ");
        }
    }
}
